public class ArithmaticOperator {
    public static void main(String[] args){
        // in programming language you can use any basic arithmatic operator by default without importing any
        // library or module: something like +, -, *, /, **, %, etc..

        // you can manipulate or create new value with operator, for example..

        // use plus (+) to concacte some string

        String before, after;

        before = "This is a first string and ";
        after = "this is the last string";

        System.out.println(before+after);

        /*
        * There's also increment or decrement operator like ++ and --
        */

        int valueSubstraction = 10;
        System.out.println("this is value before substraction : "+valueSubstraction);
        valueSubstraction--;
        System.out.println("this is value after substraction  : "+valueSubstraction);

        /*
        * Assignment Operators
        */

        int baseValue = 7;
        baseValue += 15;
        System.out.println(baseValue);
        //same as
        baseValue = baseValue + 15;
        System.out.println(baseValue);

        /*
         * Logical Operator &&, ||, !, AND, OR
         */



    }
}