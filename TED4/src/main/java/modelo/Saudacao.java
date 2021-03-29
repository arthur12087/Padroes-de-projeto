
package modelo;


public class Saudacao {

	public String nome;
	
	
	public Saudacao(String nome) {
		this.nome = nome;
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String responder() {
		return ("Bem-vindo " + this.nome);
	}
}