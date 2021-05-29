package model;

public class Arquivo {
	
	private String nomeArquivo;
	private String caminho;
	private String tipoArquivo;
	private String tipoCompactacao;
	private boolean autorizacaoCopia;
	
	public Arquivo(String nomeArquivo, String caminho) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.caminho = caminho;
		
		
	}

	public Arquivo(Arquivo arquivo) {
		// TODO Auto-generated constructor stub
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public String getTipoCompactacao() {
		return tipoCompactacao;
	}

	public void setTipoCompactacao(String tipoCompactacao) {
		this.tipoCompactacao = tipoCompactacao;
	}

	public boolean isAutorizacaoCopia() {
		return autorizacaoCopia;
	}

	public void setAutorizacaoCopia(boolean autorizacaoCopia) {
		this.autorizacaoCopia = autorizacaoCopia;
	}
	
	
	public void escrever() {
		System.out.println("Escreveu conteúdo");
		
	}
	
	public void ler() {
		System.out.println("Leu conteúdo");
	}
	
	public Arquivo clonar() {
		if (autorizacaoCopia) {
			return new Arquivo(this);
		}
		else {
			return null;
		}
	}

}
