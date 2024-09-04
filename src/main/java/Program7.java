package scr.main.java
	
import java.util.Scanner;
public class Program7r {
    public static void main(String[] args) {
        final int KlevinsPerSchrute = 20;
        final int StanNickPerKlevin = 12;
        final int StanNickPerSchrute = KlevinsPerSchrute * StanNickPerKlevin;
        
        //Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        //Input statements
        System.out.println("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();
        
        System.out.println("Enter klevins: ");
        int klevins = scanner.nextInt();
        
        System.out.println("Enter stanley-nickles: ");
        int stanleyNickels = scanner.nextInt();
        
        //Convert to decimal schrute-bucks
        double totalStanleyNickels = schruteBucks * StanNickPerSchrute + klevins * StanNickPerKlevin + stanleyNickels;
        
        double decimalSchruteBucks = totalStanleyNickels / StanNickPerSchrute;
        
        System.out.printf("Decimal schrute-bucks: $%.2f%n", decimalSchruteBucks);
        
        scanner.close();
    }
}

/*Output:
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickles: 
9
Decimal schrute-bucks: $7.89

*/
