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
	public void listarVeiculosAlugados(){
		for (Aluguel v : alugueis){
			System.out.println(v.veiculo.getModelo());
		}

	}
	public void adicionarCliente(String cpf, String nome, String data_de_nascimento,
			String estado_civil, String senha, String renda, float saldo) throws QtdCpfException, SoNumerosException, SoLetrasException{
		Cliente c = new Cliente( cpf,  nome,  data_de_nascimento, estado_civil,  senha,  renda, saldo);
		clientes.add(c);

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
	protected void adicionarFuncionarios(String cpf, String nome, String data_de_nascimento,String estado_civil, String senha) throws QtdCpfException, SoNumerosException, SoLetrasException{
		Funcionario f = new Funcionario( cpf,  nome,  data_de_nascimento, estado_civil,  senha);
		funcionarios.add(f);

	}


	public void adicionarVeiculo(String chassi, String marca, float kilometragem,
			String placa, String cor, String modelo,
			float valorDiaria) throws QtdPlacaException, PlacaException, SoLetrasException{
		Veiculo v = new Veiculo(chassi, marca, kilometragem, placa, cor, modelo, valorDiaria);
		veiculos.add(v);
		disponiveis.add(v);


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


	public void adicionarAluguel(Cliente cliente, int dataInicial, int dataFinal, Veiculo veiculo){
		float valor_total=0;
		int dias;
		dias=dataFinal-dataInicial;
		valor_total=veiculo.getValorDiaria()*dias;
		if(valor_total<cliente.getSaldo()){
			Aluguel a = new Aluguel(cliente, dataInicial, dataFinal, veiculo);
			a.setTotal(dataInicial, dataFinal);
			alugueis.add(a);
			disponiveis.remove(veiculo);
		}
	}
	public void adicionarReserva(int dataInicial, int dataFinal, Veiculo veiculo, Cliente cliente){
		Reserva r = new Reserva(dataInicial, dataFinal, veiculo, cliente);
		reservas.add(r);
		disponiveis.remove(veiculo);
	}
	protected void removerAluguel(Veiculo ve){
		for (Aluguel a : alugueis){
			if(a.veiculo == ve){
				alugueis.remove(a);
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
