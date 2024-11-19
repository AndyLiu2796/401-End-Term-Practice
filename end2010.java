import java.util.Scanner;

public class MyClass {
    
    // This method returns keyboard input
    //
    public static String inputString (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    } // END inputString
    
    public static void printCheese () {
        String cheese = "";
        
        while (!cheese.equals("CRACKERS")) {
            cheese = inputString("What cheese do you fancy");
            if (cheese.equals("Cheddar")) {
                System.out.println("I could just fancy some cheese, Gromit. What do you say? Cheddar");
            }
            else if (cheese.equals("Wensleydale")) {
                System.out.println("We’ve no cheese, not even Wensleydale");
            }
            else if (cheese.equals("Gorgonzola")) {
                System.out.println("I do like a bit of Gorgonzola");
            }
            else if (cheese.equals("Gruyere")) {
                System.out.println("We’ve no cheese, not even Gruyere");
            }
            else {
                System.out.println("I don't know... it's like no cheese I've ever tasted..." + cheese);
            }
            System.out.println("");
        }
        System.out.println("No cheese, Gromit. Not a bit in the house.");
        return;
    }
    
    public static void main (String[] args) {
        printCheese();
        return;
    }
    
    
}
