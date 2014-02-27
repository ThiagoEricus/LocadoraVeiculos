package Objetos;

public class Login {
	protected String id;
	protected  String senha;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean checarSenha(String id, String senha){
		if(this.id == id && this.senha == senha){
			return true;
		}else{
			return false;
			
		}
	}
	public Login(String id, String senha) {
		
		this.id = id;
		this.senha = senha;
	}
	
}
