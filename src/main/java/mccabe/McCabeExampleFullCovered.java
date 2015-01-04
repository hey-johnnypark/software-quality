package mccabe;

public final class McCabeExampleFullCovered {

  /**
   * 
   * @param x first parameter
   * @param y 2nd
   * @param z 3rd
   * @return largest value
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
