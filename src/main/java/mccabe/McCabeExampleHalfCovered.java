package mccabe;

public final class McCabeExampleHalfCovered {

  /**
   * 
   * @param x
   * @param y
   * @param z
   * @return
   */
  public int largestValue(int x, int y, int z) {
    int max = 0;
    if (x > y) {
      if (x > z) {
        max = x;
      } else {
        max = z;
      }
    } else {
      if (y > z) {
        max = y;
      } else {
        max = z;
      }
    }
    return max;
  }
}
