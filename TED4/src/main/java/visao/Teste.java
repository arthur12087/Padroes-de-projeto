
package visao;

import java.util.Scanner;
import modelo.FactorySaudacao;
import modelo.Saudacao;


public class Teste {
    
    public static void main(String args[]){
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu genero em minúsculo: ");
        String genero = entrada.nextLine();
        System.out.println("digite seu nome: ");
        String nome = entrada.nextLine();
        
        FactorySaudacao fabrica = new FactorySaudacao();
        Saudacao sa = fabrica.getSaudacao(genero,nome);
        
        
        System.out.println(sa.responder());
    }
    
}
