import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int diceroll ;
        int playerpos = 0;
        int dicecount = 0;
        while (playerpos!=100) {
            Random ran = new Random();
            diceroll = ran.nextInt(6) + 1;
            dicecount++;
            System.out.println("random diceroll is     " + diceroll);

            int options = 0;
            Random randomoption = new Random();
            options = randomoption.nextInt(2) + 1;
            System.out.println("option chosen by player is " + options);
            if( options==0){
                System.out.println(" No Play ");
            }
            if (options == 1) {
                System.out.println("Ladder ");
                playerpos = playerpos + diceroll;
                System.out.println("current playerposition " + playerpos);
                if(playerpos > 100){
                    System.out.println("Player can not cross 100 ");
                    playerpos = playerpos - diceroll;
                    System.out.println("So player will remain at previous position which is "+playerpos);
                } else if (playerpos == 100) {
                    System.out.println("u win");
                }
            }
            if (options == 2) {
                System.out.println(" Snake  ");
                playerpos = playerpos - diceroll;
                System.out.println("current playerposition " + playerpos);
                if (playerpos < 0) {
                    playerpos = playerpos + diceroll;
                    System.out.println(" actual current playerposition is " + playerpos);

                }
            }

        }
        System.out.println("The total dice count is  " + dicecount);
    }
}
