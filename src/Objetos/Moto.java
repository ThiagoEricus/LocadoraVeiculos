package Objetos;

import Excecoes.PlacaException;
import Excecoes.QtdPlacaException;
import Excecoes.SoLetrasException;

public class Moto extends Veiculo{
	private int cc;

	public Moto(String chassi, String marca, float kilometragem, String placa,
			String cor, String modelo, float valorDiaria, int cc)
			throws QtdPlacaException, PlacaException, SoLetrasException {
		super(chassi, marca, kilometragem, placa, cor, modelo, valorDiaria);
		this.cc = cc;
		// TODO Auto-generated constructor stub
	}

}
