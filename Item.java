public class Item{
	private String name;
	private String description;	
	private boolean equippable;

	Item(String name, String description, boolean equippable){
	
	this.name = name;
	this.description = description;
	this.equippable = equippable;

	}
	
	public void printName(){
	
		System.out.print(this.name);
	
	}
	

}
