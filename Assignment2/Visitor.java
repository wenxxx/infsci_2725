import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Visitor {
	
	private List<String> studentLikes;
	private List<String> professorLikes;
	private List<String> businessLikes;
	private List<String> bloggerLikes;
	
	private HashMap<String, List<String>> visitorInfo;
	
	private List<String> visitorTypes;
	
	//Initialization
	public Visitor() {
		
		visitorInfo = new HashMap<String, List<String>>();
		//Student information
		studentLikes = new ArrayList<String>();
		studentLikes.add("Squirrel Hill");
		studentLikes.add("Downtown");
		studentLikes.add("The Point");
		//System.out.println(studentLikes.get(0) + studentLikes.get(1));
		visitorInfo.put("Student", studentLikes);
		
		//Professor information
		professorLikes = new ArrayList<String>();
		professorLikes.add("The Cathedral of Learning");
		professorLikes.add("Squirrel Hill");
		professorLikes.add("Downtown");
		professorLikes.add("The Point");
		visitorInfo.put("Professor", professorLikes);
		
		//Business Person information
		businessLikes = new ArrayList<String>();
		businessLikes.add("Squirrel Hill");
		businessLikes.add("Downtown");
		visitorInfo.put("Business Person", businessLikes);
		
		//Blogger information
		bloggerLikes = new ArrayList<String>();
		visitorInfo.put("Blogger", bloggerLikes);
		
		visitorTypes = new ArrayList<String>();
		visitorTypes.add("Student");
		visitorTypes.add("Professor");
		visitorTypes.add("Business Person");
		visitorTypes.add("Blogger");
	}
	
	
	
	 // Randomly generate the next visitor
	 // @param seed
	 // @return selected visitor
	public String nextVisitor(Generator generator) {
	
		String selected = visitorTypes.get(generator.rGenerator());
		
		return selected;

	}
	
	public String[] visitor(Generator generator) {
		String[] visitor = new String[5];
		int[] visitorIndex = generator.rgVisitor();
		
		for(int i =0; i<5; i++) {
			visitor[i] = visitorTypes.get(visitorIndex[i]);
		}
		
		return visitor;
	}
	
	
	 // Detemine whether the visitor likes this location
	 // @param visitor
	 // @param location
	 // @return true - like ; false - not like
	
	public boolean likeLocation(String visitor, String location) {
		return visitorInfo.get(visitor).contains(location);
	}
	
}