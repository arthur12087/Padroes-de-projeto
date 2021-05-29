package model;

public class Square extends Shape {
	
	private String type;
	
	public Square(String type) {
		this.type = type;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Shape clonar() {		
		return new Square(this.type);
	}


	@Override
	public String toString() {
		return "Square type=" + type + "";
	}
	
	
}
