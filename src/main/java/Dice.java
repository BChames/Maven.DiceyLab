public class Dice {

    public Integer rollDice(Integer tossedDice){
        int dice = 0;

        for( int i = 0; i < tossedDice; i++){
            dice+=(int)(Math.random()*6+1);
            System.out.println(dice);
         //Random number generated from method is added to dice.
        }
        return dice;
    }
}
