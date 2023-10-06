public class ClassAndObjects {
    public static void main(String[] args){

        // u can create an object like you declaring variable, you can use it as much as u want.
        // but first, you must define a class that containe all variables in it to describe your class

        Cat Cat1 = new Cat();
        Cat1.name = "Charlie";
        Cat1.weight = 5;
        Cat1.sounds = "meooowwwww meowwww";

        Cat Cat2 = new Cat();
        Cat2.name = "George";
        Cat2.weight = 3;
        Cat2.sounds = "mauuuww mauuwww";


        System.out.println("I have a Cat named : "+Cat1.name);
        System.out.println("his weight is " +Cat1.weight+"kg");
        System.out.println("and he makes a sound like "+Cat1.sounds);

        System.out.println();

        System.out.println("My 2nd Cat named : "+Cat2.name);
        System.out.println("his weight is " +Cat2.weight+"kg");
        System.out.println("and he makes a sound like "+Cat2.sounds);

        System.out.println();

        System.out.println("I love "+Cat1.name+" "+"& "+Cat2.name);
    }
}

//this is the constructor class
public class Cat {
    String name;
    Integer weight;
    String sounds;
}