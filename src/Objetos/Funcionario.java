package Objetos;

import Excecoes.QtdCpfException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;

public class Funcionario extends Pessoa {

	private int horas_de_trabalho;

	public Funcionario(String cpf, String nome, String data_de_nascimento,
			String estado_civil, String senha, int horas) throws QtdCpfException, SoNumerosException, SoLetrasException {
		super(cpf, nome, data_de_nascimento, estado_civil, senha);
		this.horas_de_trabalho = horas;

	}



	public int getHoras_de_trabalho() {
		return horas_de_trabalho;
	}

	public void setHoras_de_trabalho(int horas_de_trabalho) {
		this.horas_de_trabalho = horas_de_trabalho;
	}

}
