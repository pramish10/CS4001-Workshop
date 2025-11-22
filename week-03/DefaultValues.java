public class DefaultValues {
    // Member variables (fields) for all 8 primitive types
    byte byteVar;       // default: 0
    short shortVar;     // default: 0
    int intVar;         // default: 0
    long longVar;       // default: 0L
    float floatVar;     // default: 0.0f
    double doubleVar;   // default: 0.0d
    boolean boolVar;    // default: false
    char charVar;       // default: '\u0000' (null character)

    public static void main(String[] args) {
        // Create an instance of the class
        DefaultValues obj = new DefaultValues();

        // Print the default values of each field
        System.out.println("Default Values of Primitive Types");
        System.out.println("---------------------------------");
        System.out.println("Value of byte    : " + obj.byteVar);
        System.out.println("Value of short   : " + obj.shortVar);
        System.out.println("Value of int     : " + obj.intVar);
        System.out.println("Value of long    : " + obj.longVar);
        System.out.println("Value of float   : " + obj.floatVar);
        System.out.println("Value of double  : " + obj.doubleVar);
        System.out.println("Value of boolean : " + obj.boolVar);
        System.out.println("Value of char    : [" + obj.charVar + "]");
        
        /*
         Why this wouldn’t work for local variables:
         - Local variables (declared inside methods) do NOT have default values.
         - The compiler requires that local variables be explicitly initialized
           before they are used; otherwise it’s a compile-time error:
           “variable <name> might not have been initialized”.

         For Example (you can uncomment to see the error):
         int x;                 // local variable
         System.out.println(x); // ❌ Compile error: x might not have been initialized
        */

    }
}