import java.util.Scanner;

public class Main {
    
    // This method takes in keyboard input and returns it in integer
    //
    public static int inputInt (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    } // END inputInt
    
    // This method returns an array of 7 days
    //
    public static int[] askSun () {
        final int weekdays = 7;
        int[] week_sunshine = new int[7];
        
        for (int i = 0; i < weekdays; i++) {
            int status = -1;
            while (status < 0) {
                status = inputInt("How many hours of sunshine today? ");
                week_sunshine[i] = status;
            }
        }
        
        return week_sunshine;
    } // END askSun
    
    // This method determines the day
    //
    public static String[] decideDay (int[] hours) {
        String[] days = new String[7];
        final int days_per_week = 7;
        
        for (int i = 0; i < days_per_week; i++) {
            if (hours[i] < 3) {
                days[i] = "dull";
            }
            else if (hours[i] < 6) {
                days[i] = "nice";
            }
            else {
                days[i] = "scorching";
            }
        }
        
        return days;
    } // END decideDay
    
    // This method prints the final result
    //
    public static void printResult (int[] weeks_sunshine, String[] days) {
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        final int days_per_week = 7;
        for (int i = 0; i < days_per_week; i++) {
            System.out.println("On "+weeks[i]+" there was "+weeks_sunshine[i]+" hours of sunshine. It was a "+days[i]+" day");
        }
        return;
    } // END printResult
    
    public static void main (String[] args) {
        int[] weeks_sunshine = askSun();
        String[] days = decideDay(weeks_sunshine);
        System.out.println("");
        printResult(weeks_sunshine,days);
        return;
    } // END main
    
    
}
