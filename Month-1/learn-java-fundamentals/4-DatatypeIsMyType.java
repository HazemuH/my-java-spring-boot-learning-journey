public class Datatype {
    public static void main(String[] args){
        //in java there is a datatype to define what type of value u store on the variable

        String firstName;
        String middleName = "Harden", lastName = "Saiful";

        /*
        * line above is called a variable declaration. Putting this line in your program is
        * like saying, “I’m declaring my intention to have a variable named fullName in my program.”
        * This line reserves the name fullName for your use in the program with String datatype.
        * */

        // u can assign String to the fullname

        firstName = "James";

        System.out.println(String.format("my name is %s %s %s",firstName,middleName,lastName));
    }
}