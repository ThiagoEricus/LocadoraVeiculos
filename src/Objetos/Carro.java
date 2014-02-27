package Objetos;

import Excecoes.PlacaException;
import Excecoes.QtdPlacaException;
import Excecoes.SoLetrasException;

public class Carro extends Veiculo{

	public Carro(String chassi, String marca, float kilometragem, String placa,
			String cor, String modelo, float valorDiaria)
			throws QtdPlacaException, PlacaException, SoLetrasException {
		super(chassi, marca, kilometragem, placa, cor, modelo, valorDiaria);
		// TODO Auto-generated constructor stub
	}

}
