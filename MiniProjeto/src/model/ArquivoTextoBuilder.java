package model;

public class ArquivoTextoBuilder extends AbstractBuilderArquivo {
	
	private Arquivo arquivo;
	
	public ArquivoTextoBuilder(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	
	public void buildTipoArquivo() {
		arquivo.setTipoArquivo(".txt");
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
