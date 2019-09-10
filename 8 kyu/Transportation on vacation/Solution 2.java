public class Kata {
  public static int rentalCarCost(int d) {
    int price = 0;
    
    for (int i = 0; i < d; i++) {
      price += 40;
    }
    
    if (d >= 7) {
      return price -= 50;
    }
    
    if (d >= 3) {
      return price -= 20;
    }
    
    return price;
  }
}