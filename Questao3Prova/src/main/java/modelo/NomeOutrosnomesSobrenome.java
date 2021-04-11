
package modelo;

import java.util.ArrayList;


public class NomeOutrosnomesSobrenome extends Nome {
    
    public NomeOutrosnomesSobrenome(String nome, String sobrenome){
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
        
        String[]  sobrenomeSeparado = this.sobrenome.split(" ");
        return this.nome + " " + sobrenomeSeparado[sobrenomeSeparado.length-1];
    }
}
