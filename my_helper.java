import java.util.Scanner;

public class my_helper {
        public static Scanner userInput = new Scanner(System.in);
        public static int getInt(String myPrompt){
            boolean validNum = false;
            int anyInt = 0;
            while(!validNum){
                System.out.println(myPrompt);
                try{
                    anyInt = Integer.parseInt(userInput.nextLine());
                    validNum = true;
                }
                catch(NumberFormatException exp1){
                    System.out.println("You did not enter a valid integer try again");
                }
            }
            return anyInt;
        }//End getInt Method

        public static String getString(String myPrompt){
            String tempStr = "";
            System.out.println(myPrompt);
            tempStr = userInput.nextLine();
            return tempStr;

        } //End getString Method
}
