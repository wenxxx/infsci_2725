import java.util.Random;

public class Generator {
	
	private int seeds;
	private int bounds;
	
	public Generator(int s, int b) {
		this.seeds = s;
		this.bounds = b;
	}
	
	//generate number randomly 
	public int rGenerator() {
		int r = 0;
		Random generator = new Random(seeds);
		r = generator.nextInt(bounds);
		return r;
	}
	
	public int[] rgVisitor() {
		int[] visitorList = new int[5];
		Random generator = new Random(seeds);
		for(int i=1; i<=5; i++) {
			visitorList[i-1] = generator.nextInt(bounds);
		}
		return visitorList;
	}
	
}
