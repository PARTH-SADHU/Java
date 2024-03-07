package com.parth.basics.B34AccessModifiers.Package1;


import com.parth.basics.B34AccessModifiers.Package2.ClassC;

/*  Access Levels
    Modifier	Class	Package	Subclass	World
    public	      Y	       Y	   Y	      Y
    protected	  Y	       Y	   Y	      N
    no modifier	  Y	       Y	   N	      N
    private	      Y	       N	   N	      N
 */
public class ClassA {

    public static void main(String[] args) {
        ClassC c = new ClassC();

//        * We cannot access the method as it is by default initialized as no modifier so bydefault
//          it accessibility is limited or its scope is limited to only the package and its files.
//        c.defaultMessage();
//        * W can access this as it is declared so any classs from any package can access this variable.
        System.out.println(c.publicMessage);

    }
}
