package model;

public class Editor {
	
	private Arquivo arquivo;

	public Editor(Arquivo arquivo) {
		this.arquivo = arquivo;
		System.out.println("Abriu editor");
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}


}
