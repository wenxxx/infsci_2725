import static org.junit.Assert.*;
import org.junit.Test;

public class GeneratorTest {
	private Generator generator = new Generator(9, 5);
	 // The generated number should be no less than 0 and larger than 6
	 // The random number should be smaller than bound
	 // Input seed 9 and bound 6
	@Test
	public void testRandomGenerator() {
		assertTrue(generator.rGenerator()<5 && generator.rGenerator()>=0);
	}
	
	 // 5 index for visitors should be different
	 // Return the method to produce an int array
	 // Elements in the array should be different
	@Test
	public void testRandomGenerateVisitor0() {
		int[] tested = generator.rgVisitor();
		boolean allEqual = true;
		for(int i=0; i<5; i++) {
			if(tested[i] != tested[0]) allEqual = false;
		}
		assertFalse(allEqual);
	}

}