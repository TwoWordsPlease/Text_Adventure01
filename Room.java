import java.util.ArrayList;

public class Room{
	private Room north;
	private Room south;
	private Room east;
	private Room west;
	private Room up;
	private Room down;
	private String description;
	private String name;
	private ArrayList<Item> items = new ArrayList<>();
	private boolean needKey;
	
	Room(String name, String description, boolean locked){
		this.name = name;
		this.description = description;
		this.needKey = locked;
	}
	

	public void set(Room room, char direction){
		switch (Character.toLowerCase(direction)){
		
			case 'n':
				north = room;
				break;
			case 's':
				south = room;
				break;
			case 'e':
				east = room;
				break;
			case 'w':
				west = room;
				break;
			case 'u':
				up = room;
				break;
			case 'd':
				down = room;
				break;
			default:
				System.err.println("Invalid direction, please choose n,s,e,w.");

		}
	}

	public Room get(String field){

	  switch (field.toLowerCase()){
                        case "north":
				if(north != null){
					return north;
				}
				else{
					System.err.println("ERROR: Room does not exist...");
					break;
				}
                        case "south":    
				if(south != null){
					return south;
				}
				else{
					System.err.println("ERROR: Room does not exist...");
					break;
				}
                        case "east":
				if(east != null){
                                	return east;
				}
				else{
					System.err.println("ERROR: Room does not exist...");
					break;
                              	}
                        case "west":
                                if(west != null){
                                	return west;
				}
				else{
					System.err.println("ERROR: Room does not exist...");
					break;
				}
			case "up":
                                if(up != null){
                                	return up;
				}
				else{
					System.err.println("ERROR: Room does not exist...");
					break;
				}
			case "down":
                                if(down != null){
                                	return down;
				}
				else{
					System.err.println("ERROR: Room does not exist...");
					break;
				}

                        default:
                                System.err.println("ERROR: Invalid direction, please choose a cardinal direction, up, or down.");
				return null;
               

		 }

	
		return null;
	}


	public String getName(){
		return this.name;
	}

	public String getDes(){
		return this.description;
	}

	public void loadItems(Item... a){
			
		for(int i = 0; i < a.length; i++){
			items.add(a[i]);
			a[i].printName();
			System.out.print(" loaded!\n");
		}		
	
	}




}

