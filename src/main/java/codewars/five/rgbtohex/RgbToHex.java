package codewars.five.rgbtohex;

import java.util.ArrayList;
import java.util.List;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
    	  	
    	List<Integer> arguments = new ArrayList<>();
    	arguments.add(r);
    	arguments.add(g);
    	arguments.add(b);
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (Integer arg : arguments) {
    		arg = roundValueToMatchRgbFormat(arg);
    		String hex = arg < 10 ? "0" + arg : Integer.toHexString(arg).toUpperCase();
			sb = sb.append(hex);
		}
    	
//    	System.out.println(String.format("%02X", 255));

    	return sb.toString();
    }
    
    public static int roundValueToMatchRgbFormat(int original) {
    	return original > 255 ? 255 : original < 0 ? 0 : original;
    }
}