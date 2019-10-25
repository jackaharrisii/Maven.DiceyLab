import java.util.Random;

public class Dice {
   // Integer toss = dice.tossAndSum(1,1,6);

/*    public Integer tossAndSum(int numDice, int min, int max) {
        Dice dice = new Dice();
        int sumRoll = 0;
        for(int i = 1; i <= numDice; i++) {
            Random rand = new Random();
            int dieResult = min + rand.nextInt((max - min) + 1);
            System.out.print(dieResult + "\n");
//            System.out.print(sumRoll + "\n");
            sumRoll += dieResult;
//            System.out.print(sumRoll + "\n");
        }
        System.out.print(sumRoll);
        return sumRoll;
*/
    public Integer tossAndSum(){
        int dice1 = (int)(Math.random()*6+1);
        System.out.print(dice1);
        return dice1;
    }
}
