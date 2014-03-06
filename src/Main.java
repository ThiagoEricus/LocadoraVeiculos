import java.util.Scanner;

import Controle.Locadora;
import Excecoes.PlacaException;
import Excecoes.QtdCpfException;
import Excecoes.QtdPlacaException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;
import Objetos.Cliente;
import Objetos.Funcionario;
import Objetos.Veiculo;


public class Main {

	/**
	 * @param args
	 * @throws QtdCpfException 
	 * @throws SoNumerosException 
	 * @throws PlacaException 
	 * @throws QtdPlacaException 
	 */
	public static void main(String[] args) throws QtdCpfException, SoNumerosException, QtdPlacaException, PlacaException, SoLetrasException {

		Scanner sc = new Scanner(System.in);
		Locadora l =  new Locadora();
		int a = -1, b = -1, c=-1;
		boolean login=false;
		String tipo="";
		String cpf_cliente = "";
		String cpf_funcionario = "";
		String cpf_novo = "";
		String cpf = "";

		while(login!=true){
			System.out.println("#############################################");

			System.out.println("Sistema de Locação de Carros");
			System.out.println("1 - Logar Clientes");
			System.out.println("2 - Logar Funcionario");
			System.out.println("3 - Inscrever cliente");
			System.out.println("4 - Listar cliente");
			a =  sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("CPF");
				cpf_cliente = sc.next();
				System.out.println("Senha");
				String senha_cliente = sc.next();
				Cliente cliente=l.procurarClientes(cpf_cliente);
				if(cliente.checarSenha(cpf_cliente,senha_cliente)){
					login=true;
					tipo="cliente";
					System.out.println("Logado!");
				}
				break;
			case 2:
				System.out.println("CPF");
				cpf_funcionario = sc.next();
				System.out.println("Senha");
				String senha_funcionario = sc.next();
				Funcionario funcionario=l.procurarFuncionario(cpf_funcionario);
				if(funcionario.checarSenha(cpf_funcionario,senha_funcionario)){
					login=true;
					tipo="funcionario";
				}
				break;
			case 3:				
				System.out.println("CPF");
				cpf_novo = sc.next();
				System.out.println("Nome");
				String nome = sc.next();
				System.out.println("Data");
				String data = sc.next();
				System.out.println("Estado");
				String estado = sc.next();
				System.out.println("Senha");
				String senha = sc.next();
				System.out.println("Renda");
				String renda = sc.next();
				System.out.println("Valor depositado");
				float saldo = sc.nextFloat();

				try{
					l.adicionarCliente(cpf_novo, nome, data, estado, senha, renda, saldo);
					login=true;
					tipo="cliente";
				}catch (QtdCpfException e) {
					e.getMessage();
				}
				catch (SoNumerosException e) {
					System.out.println("no CPF.");
					e.getMessage();
				}catch (SoLetrasException e) {
					System.out.println("no nome ou no estado civil.");
					e.getMessage();
				}
				break;				
			case 4:
				l.listarClientes();
				break;
			}

			while(login!=false && tipo.equalsIgnoreCase("cliente")){
				System.out.println("#############################################");

				System.out.println("Sistema de Locação de Carros");
				System.out.println("1 - Alugar Carro");
				System.out.println("2 - Listar Disponiveis");
				System.out.println("3 - Reservar Carro");
				System.out.println("0 - Logout");
				b =  sc.nextInt();

				switch (b) {
				case 1:
					System.out.println("CPF do cliente");
					cpf  = sc.next();
					System.out.println("Dia inicial");
					int diaI = sc.nextInt();
					System.out.println("Mes inicial");
					int mesI = sc.nextInt();
					System.out.println("Ano inicial");
					int anoI = sc.nextInt();
					System.out.println("Dia Final");
					int diaF = sc.nextInt();
					System.out.println("Mes Final");
					int mesF = sc.nextInt();
					System.out.println("Ano Final");
					int anoF = sc.nextInt();
					System.out.println("Placa do veiculo");
					String placa =  sc.next();

					Data dataI = new Data(diaI,mesI,anoI);
					int dataInicial= dataI.trasformarEmInteiro(diaI,mesI,anoI);

					Data dataF = new Data(diaF,mesF,anoF);
					int dataFinal= dataF.trasformarEmInteiro(diaF,mesF,anoF);			

					l.adicionarAluguel(l.procurarClientes(cpf), dataInicial, dataFinal, l.procurarVeiculos(placa));
					break;
				case 2:
					l.listarVeiculosDisponiveis();
					break;	
				case 3:
					System.out.println("CPF do cliente");
					cpf  = sc.next();
					System.out.println("Dia inicial");
					int diaI2 = sc.nextInt();
					System.out.println("Mes inicial");
					int mesI2 = sc.nextInt();
					System.out.println("Ano inicial");
					int anoI2 = sc.nextInt();
					System.out.println("Dia Final");
					int diaF2 = sc.nextInt();
					System.out.println("Mes Final");
					int mesF2 = sc.nextInt();
					System.out.println("Ano Final");
					int anoF2 = sc.nextInt();
					System.out.println("Placa do veiculo");
					placa =  sc.next();

					Data dataI2 = new Data(diaI2,mesI2,anoI2);
					int dataInicial2= dataI2.trasformarEmInteiro(diaI2,mesI2,anoI2);

					Data dataF2 = new Data(diaF2,mesF2,anoF2);
					int dataFinal2= dataF2.trasformarEmInteiro(diaF2,mesF2,anoF2);				

					l.adicionarReserva(dataInicial2, dataFinal2, l.procurarVeiculos(placa), l.procurarClientes(cpf));
					break;	
				case 9:
					l.listarVeiculosReservados();
					break;
				case 0:
					login=false;
					tipo="";
					break;
				default:
					break;
				}
			}

			while(login!=false && tipo.equalsIgnoreCase("funcionario")){
				System.out.println("#############################################");

				System.out.println("Sistema de Locação de Carros");
				System.out.println("1 - Adicionar Clientes");
				System.out.println("2 - Adicionar Carro");
				System.out.println("3 - Listar Clientes");
				System.out.println("4 - Listar Carros");
				System.out.println("5 - Alugar Carro");
				System.out.println("6 - Listar Alugueis");
				System.out.println("7 - Listar Disponiveis");
				System.out.println("8 - Reservar Carro");
				System.out.println("9 - Listar Reservas");
				System.out.println("0 - Logout");
				c =  sc.nextInt();

				switch (c) {
				case 1:
					System.out.println("CPF");
					cpf = sc.next();
					System.out.println("Nome");
					String nome = sc.next();
					System.out.println("Data");
					String data = sc.next();
					System.out.println("Estado");
					String estado = sc.next();
					System.out.println("Senha");
					String senha = sc.next();
					System.out.println("Renda");
					String renda = sc.next();
					System.out.println("Valor depositado");
					float saldo = sc.nextFloat();

					try{
						l.adicionarCliente(cpf, nome, data, estado, senha, renda, saldo);
					}catch (QtdCpfException e) {
						e.getMessage();
					}
					catch (SoNumerosException e) {
						System.out.println("no CPF.");
						e.getMessage();
					}catch (SoLetrasException e) {
						System.out.println("no nome ou no estado civil.");
						e.getMessage();
					}
					break;			 
				case 2:
					System.out.println("chassi");
					String chassi = sc.next();
					System.out.println("marca");
					String marca = sc.next();
					System.out.println("km");
					float km = sc.nextFloat();
					System.out.println("placa");
					String placa = sc.next();
					System.out.println("cor");
					String cor = sc.next();
					System.out.println("modelo");
					String modelo = sc.next();
					System.out.println("valor");
					Float valor = sc.nextFloat();
					

					try{
						l.adicionarVeiculo(chassi, marca, km,  placa, cor, modelo, valor);
					}catch (QtdPlacaException e) {
						e.getMessage();
					}catch (PlacaException e) {
						e.getMessage();
					}catch (SoLetrasException e) {
						System.out.println("na cor.");
						e.getMessage();
					}
					break;
				case 3:
					l.listarClientes();
					break;
				case 4:
					l.listarVeiculos();
					break;
				case 5:
					System.out.println("CPF do cliente");
					cpf  = sc.next();
					System.out.println("Dia inicial");
					int diaI = sc.nextInt();
					System.out.println("Mes inicial");
					int mesI = sc.nextInt();
					System.out.println("Ano inicial");
					int anoI = sc.nextInt();
					System.out.println("Dia Final");
					int diaF = sc.nextInt();
					System.out.println("Mes Final");
					int mesF = sc.nextInt();
					System.out.println("Ano Final");
					int anoF = sc.nextInt();
					System.out.println("Placa do veiculo");
					placa =  sc.next();

					Data dataI = new Data(diaI,mesI,anoI);
					int dataInicial= dataI.trasformarEmInteiro(diaI,mesI,anoI);

					Data dataF = new Data(diaF,mesF,anoF);
					int dataFinal= dataF.trasformarEmInteiro(diaF,mesF,anoF);			

					l.adicionarAluguel(l.procurarClientes(cpf), dataInicial, dataFinal, l.procurarVeiculos(placa));
					break;
				case 6:
					l.listarVeiculosAlugados();
					break;
				case 7:
					l.listarVeiculosDisponiveis();
					break;	
				case 8:
					System.out.println("CPF do cliente");
					cpf  = sc.next();
					System.out.println("Dia inicial");
					int diaI2 = sc.nextInt();
					System.out.println("Mes inicial");
					int mesI2 = sc.nextInt();
					System.out.println("Ano inicial");
					int anoI2 = sc.nextInt();
					System.out.println("Dia Final");
					int diaF2 = sc.nextInt();
					System.out.println("Mes Final");
					int mesF2 = sc.nextInt();
					System.out.println("Ano Final");
					int anoF2 = sc.nextInt();
					System.out.println("Placa do veiculo");
					placa =  sc.next();

					Data dataI2 = new Data(diaI2,mesI2,anoI2);
					int dataInicial2= dataI2.trasformarEmInteiro(diaI2,mesI2,anoI2);

					Data dataF2 = new Data(diaF2,mesF2,anoF2);
					int dataFinal2= dataF2.trasformarEmInteiro(diaF2,mesF2,anoF2);				

					l.adicionarReserva(dataInicial2, dataFinal2, l.procurarVeiculos(placa), l.procurarClientes(cpf));
					break;	
				case 9:
					l.listarVeiculosReservados();
					break;	
				case 0:
					login=false;
					tipo="";
					break;
				default:
					break;
				}
			}
		}

	}
}
