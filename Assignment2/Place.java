import java.util.HashMap;

public class Place {
	private HashMap<Integer, String> locationMap;

	public Place() {
		locationMap = new HashMap<Integer, String>();
		locationMap.put(1, "The Cathedral of Learning");
		locationMap.put(2, "Squirrel Hill");
		locationMap.put(3, "The Point");
		locationMap.put(4, "Downtown");
		locationMap.put(5, "left");
	}
	
	public String nextLocation(Generator generator) {
		String location = locationMap.get(generator.rGenerator()+1);
		return location;
	}
	
	public String getLocation(int i) {
		return locationMap.get(i);
	}

}