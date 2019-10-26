import java.util.Random;

public class Dice {

    private int numDice;
    private int sidesDice;

    public Dice(int numDice, int sidesDice){
        this.numDice = numDice;
        this.sidesDice = sidesDice;
    }

    public Integer tossAndSum(){
        int diceSum = 0;
        for (int i = 0; i < this.numDice; i++){
            int dice1 = (int)(Math.random()*this.sidesDice+1);
//            System.out.println(dice1 + " + ");
            diceSum += dice1;
        }
//        System.out.print("total = " + diceSum);
        return diceSum;
    }
}
