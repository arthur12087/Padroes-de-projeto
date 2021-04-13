package model;

public class EnchantedMaze {
	
	private Wall wall;
	private Door door;
	private EnchantedRoom enchantedRoom;
	
	

	public EnchantedMaze(Wall wall, Door door, EnchantedRoom enchantedRoom) {
		this.wall = wall;
		this.door = door;
		this.enchantedRoom = enchantedRoom;
		System.out.println("Construiu um labirinto ENCANTADO");
	}



	public Wall getWall() {
		return wall;
	}



	public void setWall(Wall wall) {
		this.wall = wall;
	}



	public Door getDoor() {
		return door;
	}



	public void setDoor(Door door) {
		this.door = door;
	}



	public EnchantedRoom getEnchantedRoom() {
		return enchantedRoom;
	}



	public void setEnchantedRoom(EnchantedRoom enchantedRoom) {
		this.enchantedRoom = enchantedRoom;
	}



	@Override
	public String toString() {
		return "EnchantedMaze [wall=" + wall + ", door=" + door + ", enchantedRoom=" + enchantedRoom + "]";
	}



	
	
	
}
