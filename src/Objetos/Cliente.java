package Objetos;

import Excecoes.QtdCpfException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;

public class Cliente extends Pessoa {
	
	private String renda;
	private float saldo=0;

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getRenda() {
		return renda;
	}

	public Cliente(String cpf, String nome, String data_de_nascimento,	String estado_civil, String senha, String renda) throws QtdCpfException, SoNumerosException, SoLetrasException {
		super(cpf, nome, data_de_nascimento, estado_civil, senha);
		this.renda = renda;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}
	
}
