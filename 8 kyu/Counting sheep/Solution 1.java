public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    
    for (Boolean isSheep : arrayOfSheeps) {
      if (isSheep != null && isSheep) {
        counter++;
      }
    }
    return counter;
  }
}