package model;

public class ArquivoApresentacaoBuilder extends AbstractBuilderArquivo {
	
private Arquivo arquivo;
	
	public ArquivoApresentacaoBuilder(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	
	public void buildTipoArquivo() {
		arquivo.setTipoArquivo(".pptx");
	}
	
	public void buildCompactacaoArquivo() {
		arquivo.setTipoCompactacao(".zip");
	}
	
	public void buildAutorizarCopia() {
		arquivo.setAutorizacaoCopia(true);
	}
	
	public void buildNaoAutorizarCopia() {
		arquivo.setAutorizacaoCopia(false);
	}

}


