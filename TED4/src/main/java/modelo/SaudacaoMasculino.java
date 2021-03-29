
package modelo;

public class SaudacaoMasculino extends Saudacao{
    
    public SaudacaoMasculino(String nome) {
        super(nome);
    }
    public String responder() {
		return ("Bem-vindo Sr." + this.nome);
	}
}
