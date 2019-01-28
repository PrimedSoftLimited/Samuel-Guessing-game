/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.the.number;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nwanwobi Samuel
 */
public class GuessingTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random_number();
        // TODO code application logic here
    }
    
    public static void Random_number(){
        int score = 0;
        int num_tries = 1;
        Random rand_num = new Random();
        int num = rand_num.nextInt(20 - 1 + 1) + 1;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        
        do {
            
            if(guess == num)
                System.out.println("Your guess is correct");
           
            else if (guess < num)
                System.out.println("Your gues is smaller than the number");
            else if (guess > num)
                System.out.println("Your gues is larger than the number");
            break;
        } while (num_tries <= 3);
        if (guess == num){
            score = score + 5;
            System.out.println(score);
        } 
        
    }
    
    
    
    
}
