import java.util.Scanner;

public class Main {
    
    // This method returns keyboard input
    //
    public static String inputString (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    } // END inputString
    
    // This method prints the introduction lines and returns input
    //
    public static String printIntro () {
        System.out.println("I can tell you about the salt content of the following food: ");
        System.out.println("Crips, Yoghurt, Soup, Baked beans");
        return inputString("Please type one of the above foods or END to finish");
    } // END printIntro
    
    // This method dettermines what to print
    //
    public static void printSalt () {
        String food = "";
        while (!food.equals("END")) {
            food = printIntro();
            if (food.equals("Crisps")) {
                System.out.println("Crisps: that is 0.9g of sodium per 100g. The salt content is very high.");
            }
            else if (food.equals("Yoghurt")) {
                System.out.println("Yoghurt: that is 0.06g of sodium per 100g. The salt content is low.");
            }
            else if (food.equals("Soup")) {
                System.out.println("Soup: that is 0.22g of sodium per 100g. The salt content is medium.");
            }
            else if (food.equals("Baked Beans")) {
                System.out.println("Baked Beans: that is 0.4g of sodium per 100g. The salt content is high.");
            }
            else {
                System.out.println("Sorry I don't know that one.");
            }
            System.out.println("");
        }
        System.out.println("Eat Healthily. Goodbye.");
        return;
    } // END printSalt
    
    public static void main (String[] args) {
        printSalt();
        return;
    }
}
