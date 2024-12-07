
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
//this is class mainly for the user
public class CoinTossSimulator{
    //the Main method
    public static void main(String args[]){
        Coin Thecoin = new Coin();
        Scanner task4 = new Scanner (System.in);
        int Input;

        do {
            //dot operator to access the methods
            //showing the optiosn to the user
            System.out.println("1.Toss Coin");
            System.out.println("2.Exit");
            Input= task4.nextInt();
            //printing the user's choice
            System.out.printf("Choice: %d \n",Input);


            //what to do depeding on the input
            switch (Input){
                case  1:
                    Thecoin.flip();
                    System.out.printf("Heads: %d , Tails: %d \n ",Thecoin.headsCounting,Thecoin.tailsCounting);
                    break;

                case 2 :
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option.Please try again.");
            }
            System.out.println();
            //if input is 2 which means 2 don't run the do while loop
        }while (Input!=2);

    }

}
