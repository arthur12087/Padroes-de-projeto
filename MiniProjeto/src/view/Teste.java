package view;
import model.*;

public class Teste {

	public static void main(String[] args) {
		
		Arquivo arquivo1 = new Arquivo("Projeto Manhattan", "C:Usuarios/Arthur/Documentos");
		ArquivoTextoBuilder montadorTexto = new ArquivoTextoBuilder(arquivo1);
		ArquivoPlanilhaBuilder montadorPlanilha = new ArquivoPlanilhaBuilder(arquivo1);
		ArquivoApresentacaoBuilder montadorApresentacao = new ArquivoApresentacaoBuilder(arquivo1);
		
		DiretorArquivoBuilder diretorBuilder = new DiretorArquivoBuilder(montadorTexto);
		diretorBuilder.buildArquivoCopiavel();
		
		EditoresFactory fabrica = new EditoresFactory();
		Editor word = fabrica.getEditor("texto", arquivo1);
		
		Arquivo arquivo2 = arquivo1.clonar();
		arquivo2.escrever();
		arquivo1.ler();
		
		
		
		
		
		

	}

}
