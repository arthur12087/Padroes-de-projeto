package model;
import model.*;

public class MazeFactory extends AbstractMazeFactory {

	public MazeFactory() {}
	
	
	public Maze getMaze() {
		
		Wall parede = new Wall();
		Door porta = new Door();
		Room salaNormal = new Room();
		
		return new Maze(parede,porta,salaNormal);
		
		
		
	}

}
