package model;

public class Maze {
	
	private Wall wall;
	private Door door;
	private Room room;
	
	
	public Maze(Wall wall, Door door, Room room) {
		this.wall = wall;
		this.door = door;
		this.room = room;
		System.out.println("Construiu labirinto normal");
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



	public Room getRoom() {
		return room;
	}



	public void setRoom(Room room) {
		this.room = room;
	}



	@Override
	public String toString() {
		return "Maze [wall=" + wall + ", door=" + door + ", room=" + room + "]";
	}	
	
	
	}
