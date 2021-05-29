package model;

public class Rectangle extends Shape {

	private String type;
	
	public Rectangle(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Shape clonar() {
		return new Rectangle(this.type);
	}

	@Override
	public String toString() {
		return "Rectangle [type=" + type + "]";
	}
	
	
}
