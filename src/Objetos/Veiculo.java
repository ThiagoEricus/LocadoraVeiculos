package Objetos;

import Excecoes.PlacaException;
import Excecoes.QtdCpfException;
import Excecoes.QtdPlacaException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;

public class Veiculo {
	protected String chassi;
	protected String marca;
	protected float kilometragem;
	protected String placa;
	protected String cor;
	protected String modelo;
	protected float valorDiaria;

	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(float kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Veiculo(String chassi, String marca, float kilometragem,
			String placa, String cor, String modelo,
			float valorDiaria) throws QtdPlacaException, PlacaException, SoLetrasException {
		super();
		this.chassi = chassi;
		this.marca = marca;
		this.kilometragem = kilometragem;
		if(placa.length()!=7)	
			throw new QtdPlacaException();
		for(int	i = 0;	i <	placa.length(); i++){
			char c = placa.charAt(i);
			if(!Character.isLetter(c) && i<3)
				throw new PlacaException();
			if(!Character.isDigit(c) && i>3)
				throw new PlacaException();
		}
		this.placa = placa;
		for(int	i = 0;	i <	cor.length(); i++){
			char c = cor.charAt(i);
			if(!Character.isLetter(c))
				throw new SoLetrasException();
		}
		this.cor = cor;
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
	}
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}



}
