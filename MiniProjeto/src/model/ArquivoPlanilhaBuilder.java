package model;

public class ArquivoPlanilhaBuilder extends AbstractBuilderArquivo {
	
private Arquivo arquivo;
	
	public ArquivoPlanilhaBuilder(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	
	public void buildTipoArquivo() {
		arquivo.setTipoArquivo(".csv");
	}
	
	public void buildCompactacaoArquivo() {
		arquivo.setTipoCompactacao("WinRar");
	}
	
	public void buildAutorizarCopia() {
		arquivo.setAutorizacaoCopia(true);
	}
	
	public void buildNaoAutorizarCopia() {
		arquivo.setAutorizacaoCopia(false);
	}

}

