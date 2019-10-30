import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Bins {
    private Integer numberOfDie;
    private Integer numberOfTosses;


    //static Integer[] binArray = new Integer[ numberOfDie * 6];

    public Bins(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }


    public Integer[] saveRolls() {

        Dice die = new Dice();
        Integer[] binArray = new Integer[numberOfDie * 6];

        for (int i = 0; i < numberOfTosses; i++) {
            binArray[i] = die.rollDice(numberOfDie);

        }
        return binArray;
    }

    //print method
    //make array equal to bin array
    //how can I manipulate the values to print them out
    public PrintStream printResults() {

        Integer[] printArray = saveRolls();
        Integer[] printArray2 = new Integer[printArray.length];

        for (int i = 0; i < 12; i++) {
            printArray[i] = printArray2[i];
        }

       /*
        for (int i = 0; i < 5; i++) {
            x = (Integer) Array.get(printArray2, i);

        }

        */
     //  Integer x = (Integer) Array.get(printArray2, 1);


        PrintStream format = System.out.format("%d", printArray2[10]);

        return format;


    }
}
