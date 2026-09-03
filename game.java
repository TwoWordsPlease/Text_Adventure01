import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;





public void main(String[] args) throws IOException { 
	Item poop = new Item("poop","a piece of poop", true);
	Item poop1 = new Item("poop1","a piece of poop", true);
	Item poop2 = new Item("poop2","a piece of poop", true);
	Item poop3 = new Item("poop3","a piece of poop", true);
	Item poop4 = new Item("poop4","a piece of poop", true);
	Item poop5 = new Item("poop5","a piece of poop", true);
	Item poop6 = new Item("poop6","a piece of poop", true);
	Item poop7 = new Item("poop7","a piece of poop", true);

	String one =("\"Fuck you stupid fucking fat loser yes yes yes.\"");
	String two =("\nThe old man before you coughs harshly once you're in view, voice cutting off quick. A dribble of spit splatters down onto the worn stone floors from his old lips." + 
		"\nHe stares for a moment, eyes cloudy and ancient. Eventually, he stretches up his turtle like neck right in your face, nasty old breath ghosting across your skin.");
	String four =("\"Oh pardon my harsh words earlier then ");
	String fourtwo = (". I wasn't aware I was in the presence of royality.\"");
	String three =("\n\"Apologies, I maybe have spoken too soon... What is your name?\"");
	String five =("He waves weakly out toward the tattered room. \"This is my oh so humble mansion. Do you have any questions?\"");
	String six =("Oh I didn't quite catch that. Ask me about where you are. I made it easy for you.");
	String seven =("\"I bore of you, begone.\"");

	Room hall = new Room("hall","It's a grimey old hallway lined with tattered banners of a forgotten era. Harsh soot covers every inch of space above waist height and the windows glow a gentle white from the moon.", false);
	Room bedroom = new Room("bedroom","It's a stupid fucking bedroom", false);
	hall.set(bedroom,'n');
	bedroom.set(hall,'s');
	hall.loadItems(poop, poop1, poop2, poop3, poop4, poop5, poop6, poop7);
	Scanner test = new Scanner(System.in);

	
	typeWriter(one);
	typeWriter(two);
	typeWriter(three);
	String name = test.nextLine();
	typeWriter(four);
	System.out.print(name);
	typeWriter(fourtwo);
	typeWriter(five);
	test("poop");
	
/* 
	while(true){
		if(response.equals("Where am I?")){
			System.out.print("\nOh? This is my hall. ");
			hall.get("description");
			break;
		}
		else{
			
			typeWriter(six);
		}
		response = test.nextLine();

	}
*/
	typeWriter(seven);
	test.close();
}




	private void typeWriter(String text){
		Random r= new Random();

		for(int i = 0; i < text.length(); i++){
		System.out.printf("%c", text.charAt(i));
			try{
				Thread.sleep(50);//pause for 0.05 seconds between characters
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}

		}
		System.out.println();

	}

	private void test(String item) throws IOException{
		
		Player p = new Player();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        
        
        String response = br.readLine().toLowerCase();
		String line;
        FileReader fr = new FileReader("/home/alexh/Downloads/verbs.txt");
		BufferedReader ar = new BufferedReader(fr);
		
        // Holds true till there is nothing to read
        while ((line = ar.readLine()) != null)
			if(response.equals(line)){
				System.out.println("found it" + line);
				p.grab(item);
			}
        
		fr.close();
	}



