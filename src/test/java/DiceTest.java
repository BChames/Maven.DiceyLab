import org.junit.Assert;
import org.junit.Test;


public class DiceTest {

    //Passes bc each roll ranges between 1-6
    @Test
    public void rollDiceTest(){

        Dice test = new Dice(1);

        int actual = test.rollDice();

        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;
        int expected4 = 4;
        int expected5 = 5;
        int expected6 = 6;

        Assert.assertEquals(expected3, actual);


    }


    }

