import org.code.neighborhood.*;

public class thirdRinging extends FirstRing {
  /* This moves the third painter to the bottom left
    and utilizes for loops to do so */
  public void bottomLeft() {
    for(int i = 0; i < 6; i++) {
      move();
    }
    turnLeft();
    turnLeft();
    for(int i = 0; i < 6; i++) {
      move();
    }
  }
}