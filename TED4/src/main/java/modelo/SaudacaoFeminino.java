
package modelo;

public class SaudacaoFeminino extends Saudacao{
    
    public SaudacaoFeminino(String nome) {
        super(nome);
    }
    public String responder() {
		return ("Bem-vindo Sra." + this.nome);
	}
}