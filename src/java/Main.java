public class Main {


    public Main(){
        System.out.println("Board games");

        Dice dice = new Dice();

        Dice.firstDiceNumber = dice.rollDice();
        Dice.secondDiceNumber = dice.rollDice();

        System.out.println("First dice number: "+ Dice.firstDiceNumber);
        System.out.println("Second dice number: " + Dice.secondDiceNumber);

        System.out.println( "The sum for both dices is: " + dice.sumForBothDices());
    }
    public static void main(String[] args) {
        new Main();
    }
}
