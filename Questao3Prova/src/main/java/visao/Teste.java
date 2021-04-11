
package visao;

import modelo.*;


public class Teste {
    
    public static void main (String args[]){
        
        FactoryNome factory = new FactoryNome();
        
        Nome n1 = factory.getNome("João","Amado","0");
        System.out.println(n1.formatarNome());
        
        Nome n2 = factory.getNome("Amado","João","1");
        System.out.println(n2.formatarNome());
        
        Nome n3 = factory.getNome("João","Rodrigues Carvalho Branco Amado","2");
        System.out.println(n3.formatarNome());
        
        //O parametro tipo de formatacao "1" instancia objeto da classe Sobrenome-Nome
        //O parametro tipo de formatacao "2" instancia objeto da classe Nome-Outrosnomes-Sobrenome
        //Qualquer outro parametro fora "1" e "2" instancia objeto da classe Nome
        
    }
    
}
