package codewars.four.codewarsstylerankingsystem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
public class UserTest {

	@Test
	public void testFunction() {
//		User user = new User();
//        assertThrows(IllegalArgumentException.class, () -> {
//            user.incProgress(-9); // 
//        });
        
		User user = new User();
        assertThrows(IllegalArgumentException.class, () -> {
            do_test(-9,-8,3);
        });

	}
	
	User user = new User();
	  private void do_test(int rank, int expectedRank, int expectedProgress) {
	    if(rank!=0) user.incProgress(rank);
	    assertEquals("After applying rank of " + rank, expectedRank, user.rank);
	    assertEquals("After applying rank of " + rank, expectedProgress, user.progress);
	  }
	  @Test
	  public void testIncProgress() throws Exception {
	    do_test(-8, -8, 3);
	    
	    user = new User();
	    do_test(-7, -8, 10);
	    
	    user = new User();
	    do_test(-6, -8, 40);
	    
	    user = new User();
	    do_test(-5, -8, 90);
	    
	    user = new User();
	    do_test(-4, -7, 60);
	    
	    user = new User();
	    do_test(-8, -8, 3);
	    
//	    user = new User();
//	    do_test(-9, -8, 3);
	        
	    user = new User();
	    do_test(1, -2, 40);
	    do_test(1, -2, 80);
	    do_test(1, -1, 20);
	    do_test(1, -1, 30);
	    do_test(1, -1, 40);
	    do_test(2, -1, 80);
	    do_test(2, 1, 20);
	    do_test(-1, 1, 21);
	  }
}
