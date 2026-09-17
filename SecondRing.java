import org.code.neighborhood.*;

public class SecondRing extends FirstRing {
  /* This moves the second painter to the bottom right 
     to start the second ring and also uses for loops */
  public void bottomRight() {
    for(int i = 0; i < 6; i++) {
      move();
    }
    turnRight();
    for(int i = 0; i < 6; i++) {
      move();
    }
  }
}