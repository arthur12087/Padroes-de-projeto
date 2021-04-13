package view;
import model.*;

public class Teste {

	public static void main(String[] args) {
		
		MazeFactory fabricaNormal = new MazeFactory();		
		fabricaNormal.getMaze();
		
		EnchantedMazeFactory fabricaEncantada = new EnchantedMazeFactory();
		fabricaEncantada.getEnchantedMaze();
		

	}

}
