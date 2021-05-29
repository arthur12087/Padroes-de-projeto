package model;

public class DiretorArquivoBuilder {
	
	private AbstractBuilderArquivo montadorArquivo;

	public DiretorArquivoBuilder(AbstractBuilderArquivo montadorArquivo) {
		this.montadorArquivo = montadorArquivo;
	}
	
	public void buildArquivoCopiavel() {
		montadorArquivo.buildTipoArquivo();
		montadorArquivo.buildCompactacaoArquivo();
		montadorArquivo.buildAutorizarCopia();
	}
	
	public void buildArquivoNaoCopiavel() {
		montadorArquivo.buildTipoArquivo();
		montadorArquivo.buildCompactacaoArquivo();
		montadorArquivo.buildNaoAutorizarCopia();
	}
}
