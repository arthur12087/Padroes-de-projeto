
package modelo;


public class SobrenomeNome extends Nome {
    
    public SobrenomeNome(String nome, String sobrenome) {
        super(nome,sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String formatarNome(){
        return this.sobrenome + " " + this.nome;
        
    }
}
