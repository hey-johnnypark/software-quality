package mccabe;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class McCabeExampleFullCoveredTest {

  private McCabeExampleFullCovered example;

  @Before
  public void setUp() {
    example = new McCabeExampleFullCovered();
  }

  @Test
  public void largestValue() {
    assertEquals(3, example.largestValue(3, 1, 2));
    assertEquals(3, example.largestValue(2, 1, 3));
    assertEquals(3, example.largestValue(1, 3, 2));
    assertEquals(3, example.largestValue(1, 2, 3));
  }

}
