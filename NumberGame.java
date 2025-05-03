import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int winCount=0;
        boolean play=true;
        
        while(play){
           
            int randomNo=rd.nextInt(100)+1;
            int attempt=5;
            boolean guessed=false;
            System.out.println("WELCOME!!");
            System.out.println("Random Number is generated,now you choose a number between 0 -100");
            
            while(attempt>0){
               
                System.out.print("Enter a number: ");
                int guessedNo=sc.nextInt();
                
                if(guessedNo==randomNo){
                    System.out.println("You won");
                    winCount++;
                    guessed=true;
                }

                else if(guessedNo<randomNo){
                    System.out.println("Guessed Number is lower than Random Number");
                }

                else{
                    System.out.println("Guessed Number is higher than the Random Number");
                }
                attempt--;
                System.out.println("Number of attempts left: "+attempt);
                
 
            }
            
            if(!guessed){
                System.out.println("You are out of attempts.The Random Number was "+randomNo);
            }
            
            System.out.print("Do you want to play again(yes/no): ");
            play=sc.next().equals("yes");

        }

        System.out.println("Game Over... You won "+winCount+" "+"rounds");

    }
}
