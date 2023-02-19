import java.util.Random;

public class SnakeAndLadderUc4 {
    public static void main(String[] args) {
        int diceroll = 1;
        int playerpos = 0;

        while(playerpos+diceroll<=100) {
            Random ran = new Random();
            diceroll = ran.nextInt(6) + 1;
            System.out.println("random diceroll is     " + diceroll);

            int options = 0;
            Random randomoption = new Random();
            options = randomoption.nextInt(3) ;
            System.out.println("option chosen by player is " + options);
            if (options == 0){
                System.out.println(" No play ");
            }
            if (options == 1) {
                System.out.println(" Ladder ");
                playerpos = playerpos + diceroll;
                System.out.println("current playerposition " + playerpos);
                if (playerpos == 100) {
                    System.out.println("u win");
                    break;
                }
            }
            if (options == 2) {
                System.out.println(" Snake  ");
                playerpos = playerpos - diceroll;
                System.out.println("current playerposition " + playerpos);
                if (playerpos < 0) {
                    // playerpos = playerpos + diceroll;
                    playerpos=0;
                    System.out.println("Player will restart \n actual current playerposition is " + playerpos);

                }
            }
        }


    }
}