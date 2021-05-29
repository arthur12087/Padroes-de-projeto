package model;

public abstract class Shape {
	
	public String type;
	
	public Shape() {}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract Shape clonar();

	
}
