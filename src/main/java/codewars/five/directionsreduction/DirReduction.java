package codewars.five.directionsreduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DirReduction {
	public static String[] dirReduc(String[] arr) {

		Map<String, String> directions = new HashMap<>();
		directions.put("NORTH", "SOUTH");
		directions.put("SOUTH", "NORTH");
		directions.put("WEST", "EAST");
		directions.put("EAST", "WEST");

		Stack<String> stack = new Stack<>();
		for (String direction : arr) {

			if (stack.isEmpty()) {
				stack.push(direction);
			} else {
				if (stack.lastElement() == directions.get(direction)) {
					stack.pop();
				} else {
					stack.push(direction);
				}
			}

		}

		return stack.toArray(new String[stack.size()]);
	}

}