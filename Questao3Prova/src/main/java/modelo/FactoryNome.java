
package modelo;


public class FactoryNome {
    
    public FactoryNome(){}
    
    public Nome getNome(String nome, String sobrenome, String tipoFormatacao){
        if(tipoFormatacao.equals("1"))
            return new SobrenomeNome(nome,sobrenome);
        
        else if(tipoFormatacao.equals("2"))
            return new NomeOutrosnomesSobrenome(nome,sobrenome);
        
        else return new Nome(nome,sobrenome);
            
        
        
    }
    
}
