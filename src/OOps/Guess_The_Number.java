package OOps;
import java.util.Random;
import java.util.Scanner;

//Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int),etc to get this task done!

class Game{

    int number;
    int userGuess;
    int numberOfTry=0;

    Game(){
        Random rn = new Random();
        int number = rn.nextInt(50);
        this.number=number;
    }

    public void setNumberOfTry(int numberOfTry){
        this.numberOfTry=numberOfTry;
    }

    public int getNumberOfTry(){
        return numberOfTry;
    }
    public int takeUserInput(){
        System.out.println("Guess The Number");
       Scanner sc = new Scanner(System.in);
        this.userGuess=sc.nextInt();
        return userGuess;
    }


    public boolean isCorrectNumber(int UserGuess){
          numberOfTry++;
        if(this.userGuess==this.number){
            System.out.format("!!HOORAY!! you guess the correct number it was %d and you guess in %d attempts",number,getNumberOfTry());
            return true;
        }else if(this.userGuess>this.number){
            System.out.println("Too High");
            System.out.println();
            return false;
        }else{
            System.out.println("Too Low");
            System.out.println();
            return false;

        }
    }


}


public class Guess_The_Number {

    public static void main(String[] args) {

        System.out.println("!!!WELCOME TO THE Guess THE NUMBER GAME!!!");
        Game player = new Game();




         boolean n =false;

        while (!n){
            int user = player.takeUserInput();
            n = player.isCorrectNumber(user);
        }







    }

}
