//Dice 'object'
public class Dice {

    //*******revisit Dice constructo bc it may be useless after method creation
    //Define an Integer that takes in the amount of 'dice' tossed
    Integer tossedDice;

    //Contructor that takes in the amount of 'dice' tossed
    public Dice(Integer n){
        this.tossedDice = n;
    }

    //Method that randomizes a number when the 'dice' are rolled
    //Takes in the Integer of the amount of dice being thrown
    public Integer rollDice(Integer tossedDice){

        //Initialize variable to take in the sum after the rolls are complete
        Integer sum = 0;

        //Loop thatYou can't roll a 0 on a real die. 'throws' the dice once per loop and add that number to sum
        for( int i = 0; i < tossedDice; i++){

            //Math.random() * 6 range from 0x6 = 0 and 1x6 = 6.
            //Add plus 1 bc you can't roll a 0 on a real die.
            sum+=(int)(Math.random()*6+1);
            System.out.println(sum);

        }
        return sum;//return the sum of all the dice rolled
    }
}
