package Controle;
import java.util.ArrayList;

import Excecoes.PlacaException;
import Excecoes.QtdCpfException;
import Excecoes.QtdPlacaException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;
import Objetos.*;
public class Locadora {

	public ArrayList<Cliente> clientes =  new ArrayList <Cliente>(); 
	public ArrayList<Funcionario> funcionarios =  new ArrayList <Funcionario>(); 
	public ArrayList<Veiculo> veiculos =  new ArrayList <Veiculo>(); 
	public ArrayList<Aluguel> alugueis =  new ArrayList <Aluguel>(); 
	public ArrayList<Reserva> reservas =  new ArrayList <Reserva>(); 
	public ArrayList<Veiculo> disponiveis =  new ArrayList <Veiculo>(); 

	public void listarVeiculosDisponiveis(){
		for (Veiculo v : disponiveis){
			System.out.println(v.getModelo());
		}

	}
	public  void listarVeiculos(){
		for (Veiculo v : veiculos){
			System.out.println(v.getModelo());
		}

	}

	public void listarVeiculosReservados(){
		for (Reserva v : reservas){
			System.out.println(v.veiculo.getModelo());
		}

	}
	public String listarVeiculosAlugados(){
		for (Aluguel v : alugueis){
			return v.data_inicial+"-"+v.data_final+"-"+v.veiculo.getModelo() +"-"+ v.cliente.getNome();
			
		}
		return null;

	}
	public boolean adicionarCliente(String cpf, String nome, String data_de_nascimento,
			String estado_civil, String senha, String renda) throws QtdCpfException, SoNumerosException, SoLetrasException{
		if(this.procurarClientes(cpf)==null){
			Cliente c = new Cliente( cpf,  nome,  data_de_nascimento, estado_civil,  senha,  renda);
			clientes.add(c);
			return true;
		}else{
			return false;
		}

	}
	public void listarClientes(){
		for(Cliente c : clientes){
			System.out.println(c.getNome());
		}
	}
	public Cliente procurarClientes(String cpf){
		for(Cliente c : clientes){
			if(cpf.equalsIgnoreCase(c.getCpf()))
				return c;
		}
		return null;
	}
	public Funcionario procurarFuncionario(String cpf){
		for(Funcionario c : funcionarios){
			if(cpf.equalsIgnoreCase(c.getCpf()))
				return c;
		}
		return null;
	}

	public Veiculo procurarVeiculos(String placa){
		for(Veiculo v : disponiveis){
			if(placa.equalsIgnoreCase(v.getPlaca()))
				return v;
		}
		return null;
	}
	public void adicionarFuncionarios(String cpf, String nome, String data_de_nascimento,String estado_civil, String senha, int horas) throws QtdCpfException, SoNumerosException, SoLetrasException{
		Funcionario f = new Funcionario( cpf,  nome,  data_de_nascimento, estado_civil,  senha, horas);
		funcionarios.add(f);

	}
	public void listarFuncionarios(){
		for(Funcionario c : funcionarios){
			System.out.println(c.getNome());
		}
	}

	public boolean adicionarVeiculo(String chassi, String marca, float kilometragem,
			String placa, String cor, String modelo,
			float valorDiaria) throws QtdPlacaException, PlacaException, SoLetrasException{
		if(this.procurarVeiculos(placa)==null){
			Veiculo v = new Veiculo(chassi, marca, kilometragem, placa, cor, modelo, valorDiaria);
			veiculos.add(v);
			disponiveis.add(v);
			return true;
		}else{
			return false;
		}



	}

	public void adicionarCarro(String chassi, String marca, float kilometragem,
			String placa, String cor, String modelo,
			float valorDiaria, int potencia) throws QtdPlacaException, PlacaException, SoLetrasException{
		Veiculo v = new Carro(chassi, marca, kilometragem, placa, cor, modelo, valorDiaria, potencia);
		veiculos.add(v);
		disponiveis.add(v);


	}

	public void adicionarMoto(String chassi, String marca, float kilometragem,
			String placa, String cor, String modelo,
			float valorDiaria, int potencia, int cc) throws QtdPlacaException, PlacaException, SoLetrasException{
		Veiculo v = new Moto(chassi, marca, kilometragem, placa, cor, modelo, valorDiaria, cc);
		veiculos.add(v);
		disponiveis.add(v);
	}


	public void adicionarAluguel(Cliente cliente, int dataInicial, int dataFinal, Veiculo veiculo, String data_inicial, String data_final){
		float valor_total=0;
		Aluguel a = new Aluguel(cliente, dataInicial, dataFinal, veiculo, data_inicial, data_final);
		valor_total=a.setTotal(dataFinal, dataInicial);
		cliente.setSaldo(valor_total);
		alugueis.add(a);
		disponiveis.remove(veiculo);
	}
	public void adicionarReserva(int dataInicial, int dataFinal, Veiculo veiculo, Cliente cliente, int data_hoje, String data_inicial, String data_final){
		Reserva r = new Reserva(dataInicial, dataFinal, veiculo, cliente);
		reservas.add(r);
		if(data_hoje>=dataInicial && data_hoje<=dataFinal){
			this.adicionarAluguel(cliente, dataInicial, dataFinal, veiculo, data_inicial, data_final);
		}
	}
	protected void removerAluguel(Veiculo ve){
		for (Aluguel a : alugueis){
			if(a.veiculo == ve){
				alugueis.remove(a);
				disponiveis.add(ve);
			}

		}
	}
	protected void removerReserva(Veiculo ve){
		for (Reserva r : reservas){
			if(r.veiculo == ve){
				reservas.remove(r);
			}
		}
	}
}
