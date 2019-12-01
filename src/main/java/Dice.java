public class Dice {

     Integer numOfRolls;

     public Dice(Integer x){
         this.numOfRolls = x;
     }

    public Integer rollDice(){
        int dice = 0;

        for( int i = 0; i < numOfRolls; i++){
            dice+=(int)(Math.random()*6+1);
           // System.out.println(dice);

        }
        return dice;
    }

}
