package Objetos;

import Excecoes.QtdCpfException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;

public class Funcionario extends Pessoa {

	private String senha;
	
	public Funcionario(String cpf, String nome, String data_de_nascimento,
			String estado_civil, String senha) throws QtdCpfException, SoNumerosException, SoLetrasException {
		super(cpf, nome, data_de_nascimento, estado_civil);
		this.senha = senha;
		
		}

	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
