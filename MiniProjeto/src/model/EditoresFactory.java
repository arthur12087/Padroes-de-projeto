package model;

public class EditoresFactory {
	
	
	public EditoresFactory() {}
	
	public Editor getEditor(String condicao, Arquivo arquivo) {
		if (condicao.equals("texto")) 
			return new EditorDeTexto(arquivo);
		
		else if (condicao.equals("planilha"))
			return new EditorDePlanilha(arquivo);
		
		else if (condicao.equals("apresentacao"))
			return new EditorDeApresentacao(arquivo);
		
		else
			return new Editor(arquivo);
		
	}

}

