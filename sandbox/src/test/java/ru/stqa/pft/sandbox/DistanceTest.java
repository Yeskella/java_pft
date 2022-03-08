package by.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class DistanceTest {

  @Test
  public void testDistance() {
    Point a = new Point(1, 0);
    Point b = new Point(3, 0);

    Assert.assertEquals(a.distance(b), 2,0);
  }

  @Test
  public void testDistance2() {
    Point a = new Point(0, 1);
    Point b = new Point(0, -5);

    Assert.assertEquals(a.distance(b), 6,0);
  }


}