
///random
/*import java.util.Scanner;


public class Main {
    public static void main(String args[]){

        // generating random number of 2 digit
        int random_number = (int) ((Math.random() * 91) +10);;

        //prompt for taking guess number by user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 digit number");
        int guess_number = input.nextInt();

        // separating digits from random number
        int random_number_digit1 = random_number / 10 ;
        int random_number_digit2 = random_number % 10 ;

        //separating digits guess number
        int guess_number_digit1 = guess_number / 10 ;
        int guess_number_digit2 = guess_number % 10 ;


        //conditions
        boolean exact_match =   random_number == guess_number;
        boolean match_all_digits =   random_number_digit1 == guess_number_digit2 && random_number_digit2 == guess_number_digit1;
        boolean match_one_digit =   random_number_digit1 == guess_number_digit1 ||
                random_number_digit1 == guess_number_digit2 ||
                random_number_digit2 == guess_number_digit1 ||
                random_number_digit2 == guess_number_digit2;

        //final condition to check and show result
        if (exact_match){
            System.out.println("Exact match: you win $10,000");
        }
        else if(match_all_digits){
            System.out.println("Match all digits: you win $3,000");
        }
        else if (match_one_digit){
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("sorry, no match");
        }
    }
}*/

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {

        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int num = number;
        int reverse = 0;
        while(number != 0)
        {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;

        }
        System.out.println("Reverse Num: " + reverse);
        if (num==reverse){
            System.out.println("Is a palindrome");
        }else{
            System.out.println("Isn't a palindrome");
        }

    }
}