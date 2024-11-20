import java.util.Scanner;

class Newspaper {
    String name;
    String form;
    String stance;
}

class Main {

    // This method returns keyboard input
    //
    public static String inputString (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    } // END inputString

    // This method sets the newspaper.name
    //
    public static void setName (Newspaper news, String answer) {
        news.name = answer;
        return;
    } // END setName

    // This method sets the newspaper.form
    //
    public static void setForm (Newspaper news) {
        news.form = inputString("Tabloid or Broadsheet: ");
        return;
    } // END setForm

    // This method sets the newspaper.stance
    //
    public static void setStance (Newspaper news) {
        news.stance = inputString("Left or Right wing: ");
        return;
    } // END setStance

    // This method returns newspaper.name
    //
    public static String returnName (Newspaper news) {
        return news.name;
    } // END returnName

    // This method returns newspaper.form
    //
    public static String returnForm (Newspaper news) {
        return news.form;
    } // END returnForm

    // This method returns newspaper.stance
    // 
    public static String returnStance (Newspaper news) {
        return news.stance;
    } // END returnStance

    public static void main (String[] args) {
        Newspaper[] news_array = new Newspaper[20];
        String key = "";
        int count = 0;
        String answer = "";
        while (!answer.equals("END") && (count < news_array.length)) {
            answer = inputString("Newspaper: ");
            if (!answer.equals("END")) {
                news_array[count] = new Newspaper();
                setName(news_array[count], answer);
                setForm(news_array[count]);
                setStance(news_array[count]);
                System.out.println("");
                count++;
            }
        }
        System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.println("The " + returnName(news_array[i]) + " is a " + returnStance(news_array[i]) + " wing " + returnForm(news_array[i]) + " paper."); 
        }
        return;
    } // END main
}
