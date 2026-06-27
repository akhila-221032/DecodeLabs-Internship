import java.util.Scanner;
import java.util.Random;
public class DecodeLabs_java_p1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char playonce;
        System.out.println("Welcome to my 1st project- Number Guessing Game!");
        do{
        int num=rand.nextInt(100)+1;
        int attempts=0;
        int guess=0;
        int maxat=7;
        int score=0;
        while(num != guess && attempts < maxat){
            try{

            System.out.println("Guess a number (Attempts left: " + (maxat - attempts) + "):");
            guess = sc.nextInt();
            attempts++;
            if(guess>num) {
                System.out.println("Too High!");
            }
            else if(guess<num){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("Correct! You guessed in " + attempts + " attempts.");
                score=(11-attempts)*10;
                System.out.println("Your score is: " + score +"/100");
            }
        }
        catch(Exception e){
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
            }
        }
        if( attempts >= maxat && num != guess){
            System.out.println("sorry,no attempts and the num is:" + num);
        }
        System.out.println("Do you want to play again? (y/n)");
        playonce = sc.next().charAt(0);
    }while(playonce=='y' || playonce=='Y');
     System.out.println("ok,THANKYOU");
       sc.close(); 
    }
}

