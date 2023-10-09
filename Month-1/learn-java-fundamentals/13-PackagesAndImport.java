import java.util.ArrayList;
import java.util.List;

public class PackagesAndImport {

    /*
    - Package:
    Definition: A package in Java is a way to organize related classes and interfaces into a group or namespace.
    It provides a hierarchical structure for managing Java code files.

    Purpose:
    Organization: Packages help organize large codebases by grouping related classes together.
    This makes it easier to locate and maintain code.

    Namespace:
    Packages act as namespaces, preventing naming conflicts between classes and interfaces with the same name
    in different packages.

    Access Control:
    Packages provide access control mechanisms, allowing you to specify which classes and members
    are accessible from other packages.

    Package Declaration:
    To declare a class belongs to a package, you use the package statement at the top of your Java file.

    For example:
    package com.mycompany.myapp;
    Package Naming Convention: Package names are typically in reverse domain name format, such as com.mycompany.myapp. This minimizes the chance of naming conflicts.

    - Import:
    Definition: In Java, the import statement is used to bring classes, interfaces,
    or entire packages into your code. It allows you to use types defined in other packages
    without fully qualifying their names.

    Purpose:
    Access External Code: Imports enable you to access classes and types that are defined in other packages or libraries.
    Code Clarity: They improve code readability by reducing the need for fully qualified class names.

    Usage: You can use import statements at the top of your Java file, before declaring the class.

    For example:
    import java.util.ArrayList;
    import java.util.List;

    Wildcard Import:
    You can use a wildcard (*) to import all classes from a package.

    For example:
    import java.util.*;

    Custom Classes:
    You can also import custom classes that you've defined in your own packages.
    For example, if you have a class named MyClass in the package com.mycompany.myapp,
    you can import it as follows:

    import com.mycompany.myapp.MyClass;


    In summary:
    - Package organizes related classes and provides a namespace.
    - Import allows you to access classes and types from other packages, improving code clarity and maintainability.
 */

    public static void main(String[] args) {
        // Using Classes from Imported Packages
        List<String> myList = new ArrayList<>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        System.out.println("Contents of myList:");
        for (String item : myList) {
            System.out.println(item);
        }
    }

}
