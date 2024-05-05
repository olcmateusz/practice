package codewars.five.directionsreduction;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.runners.JUnit4;

public class DirReductionTest {
	
	@Test
	public void testAddingToStack() {
		assertArrayEquals(new String[] {"NORTH"}, 
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));
		Map<String, String> directions = new HashMap<>();
	
		directions.put("SOUTH", "NORTH");
		assertEquals("NORTH", directions.get("SOUTH"));
	}
		
	@Test
	public void testSimpleDirReduc() {
		assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
				new String[] { "WEST" },
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));
		assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"", new String[] {},
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH" }));
	}
}
