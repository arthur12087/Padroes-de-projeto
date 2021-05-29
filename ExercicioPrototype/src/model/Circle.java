package model;

public class Circle extends Shape {

	private String type;
	
	public Circle(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public Shape clonar() {
		return new Circle(this.type);
	}

	@Override
	public String toString() {
		return "Circle [type=" + type + "]";
	}
	
	
	
}
