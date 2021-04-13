package model;
import model.*;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	public EnchantedMazeFactory() {}
		
	public EnchantedMaze getEnchantedMaze() {
		
		Wall parede = new Wall();
		Door porta = new Door();
		EnchantedRoom salaEncantada = new EnchantedRoom();
		
		return new EnchantedMaze(parede,porta,salaEncantada);
		
	}

}
