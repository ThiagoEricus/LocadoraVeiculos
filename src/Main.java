import java.util.Scanner;

import Controle.Locadora;
import Excecoes.PlacaException;
import Excecoes.QtdCpfException;
import Excecoes.QtdPlacaException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;
import Objetos.Cliente;
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
		int a = -1;



		do{
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
			a =  sc.nextInt();
			String cpf = "";

			switch (a) {
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

				try{
					l.adicionarCliente(cpf, nome, data, estado, senha, renda);
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
				System.out.println("Data inicial");
				int dataInicial = sc.nextInt();
				System.out.println("Data Final");
				int dataFinal = sc.nextInt();
				System.out.println("Placa do veiculo");
				placa =  sc.next();
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
				System.out.println("Data inicial");
				dataInicial = sc.nextInt();
				System.out.println("Data Final");
				dataFinal = sc.nextInt();
				System.out.println("Placa do veiculo");
				placa =  sc.next();
				l.adicionarReserva(dataInicial, dataFinal, l.procurarVeiculos(placa), l.procurarClientes(cpf));
				break;	
			case 9:
				l.listarVeiculosReservados();
				break;	
			default:
				break;
			}
		}while(a != 0);
	}

}
