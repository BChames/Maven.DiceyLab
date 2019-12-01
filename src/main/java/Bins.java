import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Bins {

    private Integer numberOfDie;
    private Integer numberOfTosses;

    public Bins(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }


    public double[] saveRolls() {

        Dice die = new Dice(numberOfDie);
        double[] binArray = new double[numberOfDie * 6];

        for (int i = 0; i < numberOfTosses; i++) {
            binArray[die.rollDice() - 1] +=1;

        }
        return binArray;
    }



    //print method
    //make array equal to bin array
    //how can I manipulate the values to print them out
    public void printResults() {

        double[] printArray = saveRolls();

        for (int i = 0; i < printArray.length; i++) {
            System.out.printf("%4d %s %70.0f %s %1.2f %s", i + 1, " : ", printArray[i], " : ", printArray[i] / numberOfTosses, " ");

            for (int j = 0; j < (printArray[i] / numberOfTosses) * 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
