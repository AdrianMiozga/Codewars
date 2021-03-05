class CodeWars {
  public static long overTheRoad(long address, long n) {
    if (address % 2 == 0) {
      return 2 * (n - (address / 2)) + 1;
    } else {
      return 2 * (n - (address / 2));
    }
  }
}