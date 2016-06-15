import java.util.Random;

public class CitySim {
	 // Determine whether the input is a valid integer
	public static boolean isInteger(String[] n) {	
		if(n.length != 1) return false;
		
		try{
			Integer.parseInt(n[0]);
		} catch(NumberFormatException e) {
			return false;
		} catch(NullPointerException e) {
			return false;
		}
	
		return true;
	}
	
	private static int v_num = 4;
	private static int l_numE = 5;

	public static void main(String[] args) {
		int seed = 0;
		if(isInteger(args))    
			seed = Integer.parseInt(args[0]); 	
		else {
			System.out.println("Please enter an integer argument, seed");
			System.exit(0);
		}	
		System.out.println("Welcome to CitySim!  Your seed is " + seed + ".");	
		
		Visitor visitor = new Visitor();	
		String nextVisitor = "";	
		Place location = new Place();
		String nextLocation = "";
		Generator visGenerator = new Generator(seed, v_num);
		String[] visitorList = visitor.visitor(visGenerator);
		Random generator = new Random(seed);
	
		//First select a visitor randomly, then visit randomly, and print three asterisks finally
		for(int i=1; i<=5; i++) {

			nextVisitor = visitorList[i-1];		
			System.out.println("Visitor " + i + " is a " + nextVisitor);
			
			nextLocation = location.getLocation(generator.nextInt(l_numE) + 1);
			
			//The visitor shouldn't leave at the first time.
			while(nextLocation.compareTo("left") == 0) {
				nextLocation = location.getLocation(generator.nextInt(l_numE) + 1);
			}
			
			while(nextLocation.compareTo("left") != 0) {
				System.out.println("Visitor " + i + " is going to " + nextLocation + "!");
				
				if(visitor.likeLocation(nextVisitor, nextLocation))
					System.out.println("Visitor " + i + " did like " + nextLocation + ".");
				else
					System.out.println("Visitor " + i + " did not like " + nextLocation + ".");
				
				nextLocation = location.getLocation(generator.nextInt(l_numE) + 1);
			}
			
			System.out.println("Visitor " + i + " has left the city.");
			System.out.println("***");
		}
	}
	



}
