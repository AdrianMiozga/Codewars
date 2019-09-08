public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
  
    if (employed == true && vacation == true) {
      return false;
    }
    
    if (employed == false && vacation == true) {
      return false;
    }
      
    if (employed == false && vacation == false) {
      return false;
    }
    
    if (employed == true && vacation == false) {
      return true;
    }
    
    return false;
  }
}