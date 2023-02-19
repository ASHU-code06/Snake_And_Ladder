import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {

        System.out.println("this a 2 player game. Initially both are at zero ");
        int optionp1,optionp2;
        int diceroll = 0;
        int countdiceroll=0;
        int player1pos = 0;
        int player2place =0;
        while(player1pos!=100||player2place!=100) {
            System.out.println("***********************************\nPLAYER 1 CHANCE");
            Random ran = new Random();
            diceroll = ran.nextInt(6) + 1;
            countdiceroll++;
            System.out.println("random diceroll is     " + diceroll);

            Random randomoptionp2 = new Random();
            optionp1 = randomoptionp2.nextInt(3);
            System.out.println("option chosen by player1 is " + optionp1);

            if( optionp1==0){
                System.out.println(" No Play ");
            }
            if (optionp1 == 1) {
                System.out.println("Ladder  ");
                player1pos = player1pos + diceroll;
                System.out.println("current player1position " + player1pos);
                if(player1pos > 100){
                    System.out.println("Player can not cross 100 ");
                    player1pos = player1pos - diceroll;
                    System.out.println("So player will remain at previous position which is "+player1pos);
                } else if (player1pos == 100) {
                    System.out.println("player 1 win");
                    break;

                }
            }
            if (optionp1 == 2) {
                System.out.println(" Snake  ");
                player1pos = player1pos - diceroll;
                System.out.println("current player1position " + player1pos);
                if (player1pos < 0) {
                    player1pos = player1pos + diceroll;
                    System.out.println("Player will restart so actual current player1position is " + player1pos);

                }
            }

            System.out.println("***********************************************\nPLAYER 2 CHANCE");

            Random ra = new Random();
            diceroll = ra.nextInt(6) + 1;
            countdiceroll++;
            System.out.println("random diceroll is     " + diceroll);


            Random randomoptionp2n = new Random();
            optionp2 = randomoptionp2n.nextInt(2) + 1;
            System.out.println("option chosen by player 2 is " + optionp2);


            if( optionp2 == 0){
                System.out.println(" No Play ");
            }
            if (optionp2 == 1) {
                System.out.println("Ladder ");
                player2place = player2place + diceroll;
                System.out.println("current player2position " + player2place);
                if(player2place > 100){
                    System.out.println("Player can not cross 100 ");
                    player2place = player2place - diceroll;
                    System.out.println("So player will remain at previous position which is "+player2place);
                } else if (player2place == 100) {
                    System.out.println("player2 win");
                    break;
                }
            }
            if (optionp2 == 2) {
                System.out.println(" Snake  ");
                player2place = player2place - diceroll;
                System.out.println("current player2position " + player2place);
                if (player2place < 0) {
                    player2place = player2place + diceroll ;
                    System.out.println("Player 2 will restart so actual current player2position is " + player2place);
                }
            }
        }
        System.out.println("Total dice roll is "+countdiceroll);
    }
}
