package Controle;

import Objetos.Cliente;
import Objetos.Veiculo;

public class Aluguel {
	public Cliente cliente;
	public int dataInicial;
	public int dataFinal;
	public float total=0;
	public Veiculo veiculo;

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
	public float getTotal() {
		return total;
	}
	public float setTotal(int fim, int inicio) {
		this.total = (fim-inicio)*this.veiculo.getValorDiaria();
		return this.total;
	}

	public Aluguel(Cliente cliente, int dataInicial, int dataFinal,	 Veiculo veiculo) {
		super();
		this.cliente = cliente;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.veiculo = veiculo;
	}	
}
