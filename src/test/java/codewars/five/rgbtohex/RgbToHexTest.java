package codewars.five.rgbtohex;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RgbToHexTest {
	
	@Test
	public void sample() {
		assertEquals(0, RgbToHex.roundValueToMatchRgbFormat(-15));
		assertEquals(15, RgbToHex.roundValueToMatchRgbFormat(15));
		assertEquals(255, RgbToHex.roundValueToMatchRgbFormat(256));
	}

    @Test
    public void sampleTests() {
        assertEquals("For input: (0, 0, 0)", "000000", RgbToHex.rgb(0, 0, 0));
        assertEquals("For input: (1, 2, 3)", "010203", RgbToHex.rgb(1, 2, 3));
        assertEquals("For input: (255, 255, 255)", "FFFFFF", RgbToHex.rgb(255, 255, 255));
        assertEquals("For input: (254, 253, 252)", "FEFDFC", RgbToHex.rgb(254, 253, 252));
        assertEquals("For input: (-20, 275, 125)", "00FF7D", RgbToHex.rgb(-20, 275, 125));
    }
}