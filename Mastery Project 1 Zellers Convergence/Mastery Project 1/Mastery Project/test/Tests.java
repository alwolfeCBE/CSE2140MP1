import org.junit.Assert;
import org.junit.Test;



public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Monday", Task.Zellers(2024, 9, 9));
    Assert.assertEquals("Wednesday", Task.Zellers(2023, 9, 13));
    Assert.assertEquals("Sunday", Task.Zellers(2024, 1, 7));
    Assert.assertEquals("Friday", Task.Zellers(2000, 1, 7));
    Assert.assertEquals("Tuesday", Task.Zellers(1999, 12, 28));

    // Edge cases
    Assert.assertEquals("Saturday", Task.Zellers(1900, 1, 1));
    Assert.assertEquals("Monday", Task.Zellers(2000, 1, 3));
  }
}


/*public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Assert.fail("Tests not implemented for the task");
  }
}*/