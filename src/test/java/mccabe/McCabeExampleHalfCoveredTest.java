package mccabe;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class McCabeExampleHalfCoveredTest {

  private McCabeExampleHalfCovered example;

  @Before
  public void setUp() {
    example = new McCabeExampleHalfCovered();
  }

  @Test
  public void largestValue() {
    assertEquals(3, example.largestValue(3, 1, 2));
    assertEquals(3, example.largestValue(2, 1, 3));
  }

}
