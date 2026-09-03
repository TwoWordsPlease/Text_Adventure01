public class Player{
	private Room current_Room;
	//private ArrayList<Item> inventory = new ArrayList<>();	

	public void move(String direction){
		
		if(current_Room.get(direction) != null){
			
			current_Room = current_Room.get(direction);
			System.out.println("You enter " + current_Room.getDes());
		}
		else{
			System.out.println("I don't think you can go that way dude...");
		}	

	}	

	public void grab(String item){
		System.out.println("The harsh scat squishes out horrifically between your fingers, most definitely staining the skin for the rest of your life.");
	}


}
