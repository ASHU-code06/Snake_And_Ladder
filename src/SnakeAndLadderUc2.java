import java.util.Random;

public class SnakeAndLadderUc2 {
    public static void main(String[] args) {
            int r = 1;
            int playerpos = 0;//position of player is at 0
            Random ran = new Random();
            r = ran.nextInt(6) + 1;
            System.out.println("dice roll is    " + r);

    }
}