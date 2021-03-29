
package modelo;


public class FactorySaudacao {
    
    
    public FactorySaudacao(){}
    
    public Saudacao getSaudacao(String genero,String nome){
        if (genero.equals("masculino"))
            return new SaudacaoMasculino(nome);
        
        else if (genero.equals("feminino"))
            return new SaudacaoFeminino(nome);
        
        else return new Saudacao(nome);
    }
    
}
