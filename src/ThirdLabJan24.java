import java.util.Scanner;

public class ThirdLabJan24 {

	public static void main(String[] args) {
		
        System.out.println("Learn your squares and cubes!");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        char userChar;

        do
        {
            
            System.out.print("Enter an integer: ");
            int userNum = scan.nextInt();
            System.out.println();

            
            String header = "Number	" + "Squared	"	+ "Cubed" + "\n" // Create a header.
                    +   "======	" + "======	" + "======";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int i = 1; i <= userNum; i++)
            {
            		square = (int) Math.pow(i, 2);
            		cube = (int) Math.pow(i, 3);

                row = i + "	" + square + "	" + cube;
                System.out.println(row);
                
            }

            System.out.println();
            System.out.print("If you would like to continue, press the y key, and hit enter." + "\n" + "Otherwise, press any other key, and hit enter to exit: ");
            userChar = scan.next().charAt(0);
            System.out.println();

        }
        while (userChar == 'y' || userChar == 'Y');
        
        	System.out.println("Goodbye!");
        	
        	scan.close();
        
    }
	}