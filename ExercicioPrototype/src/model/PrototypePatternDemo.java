package model;



public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache shapeCache = new ShapeCache();
		
		Shape squareClone = shapeCache.square.clonar();
		
		System.out.println(squareClone);
		
	}

}
