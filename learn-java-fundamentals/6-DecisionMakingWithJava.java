import java.util.Scanner;

public class DecisionMakingWithJava {
    public static void main(String[] args) {
        // There are 2 decision making statements in java
        // IF or IF-ELSE or IF-ELSE IF-ELSE
        int i = 10;

        if(i!=10){
            System.out.println("i not 10");
        }

        if(i!=9){
            System.out.println("i not 9");
        }else{
            System.out.println("i is 9");
        }

        if(i==10){
            System.out.println("i is 10");
        }else if(i == 0 ){
            System.out.println("i is 0");
        }else{
            System.out.println("neither 0 nor 10 are i");
        }

        // SWITCH CASE
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lets Gacha!");
        int verse = keyboard.nextInt();
        switch (verse) {
            case 1:
                System.out.println("5Billion RUpiah");
                break;
            case 2:
                System.out.println("1000 m^2 house");
                break;
            case 3:
                System.out.println("1 Maybach");
                break;
            default:
                System.out.println("Zonk!!!");
                break;
        }
        System.out.println("Bye..");
        keyboard.close();
    }
}