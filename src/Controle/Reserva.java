package Controle;

import Objetos.Cliente;
import Objetos.Veiculo;

public class Reserva {

	protected int dataInicial;
	protected int dataFinal;
	protected boolean disponivel;
	public Veiculo veiculo;
	protected Cliente cliente;
	
	public int getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(int dataInicial) {
		this.dataInicial = dataInicial;
	}
	public int getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(int dataFinal) {
		this.dataFinal = dataFinal;
	}

	public boolean validadorDisponibilidade(int data){
		if(data>=this.dataInicial && data<=this.dataFinal){
			this.disponivel = false;
			return false;
			}
		return true;			
	}
	
	public Reserva(int dataInicial, int dataFinal, Veiculo veiculo, Cliente cliente) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.disponivel = false;
		this.veiculo = veiculo;
		this.cliente = cliente;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	
}



