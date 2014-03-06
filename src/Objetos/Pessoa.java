package Objetos;

import java.net.SocketException;

import Excecoes.QtdCpfException;
import Excecoes.SoLetrasException;
import Excecoes.SoNumerosException;

public class Pessoa implements Login{

	protected String cpf;
	protected String nome;
	protected String data_de_nascimento;
	protected String estado_civil;
	protected  String senha;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pessoa(String cpf, String nome, String data_de_nascimento,
			String estado_civil, String senha) throws QtdCpfException, SoNumerosException, SoLetrasException{
		if(cpf.length()	!=	11)	
			throw new QtdCpfException();			
		for(int	i = 0;	i <	cpf.length(); i++){
			char c = cpf.charAt(i);
			if(!Character.isDigit(c))
				throw new SoNumerosException();
		}
		this.cpf = cpf;
		for(int	i = 0;	i <	nome.length(); i++){
			char c = nome.charAt(i);
			if(!Character.isLetter(c))
				throw new SoLetrasException();
		}
		this.nome = nome;
		this.data_de_nascimento = data_de_nascimento;
		for(int	i = 0;	i <	estado_civil.length(); i++){
			char c = estado_civil.charAt(i);
			if(!Character.isLetter(c))
				throw new SoLetrasException();
		}
		this.estado_civil = estado_civil;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean checarSenha(String cpf, String senha){
		if(this.cpf.equals(cpf) && this.senha.equals(senha)){
			return true;
		}else{
			return false;

		}
	}
}
