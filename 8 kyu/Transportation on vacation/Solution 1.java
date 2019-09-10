public class Kata {
  public static int rentalCarCost(int d) {
    int price = 40 * d;
    
    if (d >= 7) {
      return price -= 50;
    }
    
    if (d >= 3) {
      return price -= 20;
    }
    return price;
  }
}