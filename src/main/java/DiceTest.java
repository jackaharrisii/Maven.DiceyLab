import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void tossAndSumTest(){
        Dice dice = new Dice();
        Boolean expected = true;
        Boolean actual;
        int dice1 = dice.tossAndSum();
//  this didn't work --->  if(dice.tossAndSum() >= 1 && dice.tossAndSum() <=6){
        // doing it this way was rolling the die twice
        //it was rolling for each comparison
        // solution was to roll before the if statement, then call the variable
        if (dice1 >= 1 && dice1 <= 6){
            actual = true;
        }
        else { actual = false; }
    }

/*    @Test
    public void tossAndSumTest(){
        Dice dice = new Dice();
        Boolean expected = true;
        Boolean actual;
        if(dice.tossAndSum(1,1,6) >= 1 && dice.tossAndSum(1,1,6)<= 6) {
            actual = true;
        }else{actual = false;}
        Assert.assertEquals(expected,actual);
    }
*/

}