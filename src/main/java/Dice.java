import java.util.Random;

public class Dice {

    public Integer tossAndSum(int numDice, int min, int max){
        int diceSum = 0;
        for (int i = 0; i < numDice; i++){
            int dice1 = (int)(Math.random()*max+min);
            System.out.println(dice1 + " + ");
            diceSum += dice1;
        }
        System.out.print("total = " + diceSum);
        return diceSum;
    }
}
