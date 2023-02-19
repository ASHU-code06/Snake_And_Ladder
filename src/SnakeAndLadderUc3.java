import java.util.Random;

public class SnakeAndLadderUc3 {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder");
        int playerpos=0;
        int diceroll=1;
        Random ran = new Random();
        diceroll = ran.nextInt(6)+1;
        System.out.println("random diceroll is     "   +diceroll);
        int options;
        Random randomoption  = new Random();
        options = randomoption.nextInt(3);
        if(options==0){
            System.out.println("The player stays in the same position  "+options);
        }
        if(options==1){
            System.out.println("The player moves ahead by number of position received in the dice "+options);
            playerpos=playerpos+diceroll;
        }
        if(options==2){
            System.out.println("The player moves behind by the number of position received in the dice "+options);
            playerpos=playerpos-diceroll;
        }

    }
}
