public class MathOperations {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;

        // 1. Arithmetic Operators
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("1. Arithmetic Operators :-");
        System.out.println("+ : " + sum); //Addition
        System.out.println("- : " + diff); //Subtraction
        System.out.println("* : " + prod); //Multiplication
        System.out.println("/ : " + div); //Division
        System.out.println("% : " + mod); //Modulus

        // Increment and Decrement (Unary Operators)
        int x = 5;
        System.out.println("Increment and Decrement Operators :-");
        System.out.println("x before increment: " + x);
        
        x++; 
        System.out.println("x after x++ : " + x); // post-increment
        
        x--; 
        System.out.println("x after x-- : " + x); // post-decrement
        
        ++x; 
        System.out.println("x after ++x : " + x); // pre-increment
        
        --x; 
        System.out.println("x after --x : " + x); // pre-decrement
        
        System.out.println(""); //Just to give space
        
        // 2. Relational Operators
        System.out.println("2. Relational Operators :-");
        System.out.println("a > b : " + (a > b)); // Greaterthan
        System.out.println("a < b : " + (a < b)); // Lessthan
        System.out.println("a == b : " + (a == b)); //Equal to
        System.out.println("a != b : " + (a != b)); //Notequal
        System.out.println("a >= b : " + (a >= b)); // Greaterorequal
        System.out.println("a <= b : " + (a <= b)); // Lessorequal
        
        System.out.println(""); //Just to give space

        // 3. Logical Operators
        boolean p = true;
        boolean q = false;
        System.out.println("3. Logical Operators :-");
        System.out.println("p && q : " + (p && q)); //AND
        System.out.println("p || q : " + (p || q)); //OR
        System.out.println("!p : " + (!p)); //NOT
        
        System.out.println(""); //Just to give space

        // 4. Assignment Operators
        int y = 20;
        System.out.println("4. Assignment Operators :-");
        System.out.println("y = " + y);
        y += 5;
        System.out.println("y += 5 : " + y);
        y -= 3;
        System.out.println("y -= 3 : " + y);
        y *= 2;
        System.out.println("y *= 2 : " + y);
        y /= 4;
        System.out.println("y /= 4 : " + y);
        y %= 3;
        System.out.println("y %= 3 : " + y);
        
        System.out.println(""); //Just to give space

        // 5. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("5. Ternary Operator :-");
        System.out.println("Max of a and b : " + max);
        
        System.out.println(""); //Just to give space

        // 6. Bitwise Operators
        int m = 6;  // 0110 in binary
        int n = 4;  // 0100 in binary
        System.out.println("6. Bitwise Operators :-");
        System.out.println("m & n : " + (m & n)); // AND
        System.out.println("m | n : " + (m | n)); // OR
        System.out.println("m ^ n : " + (m ^ n)); // XOR
        System.out.println("~m : " + (~m));       // NOT
        System.out.println("m << 1 : " + (m << 1)); // Left shift
        System.out.println("m >> 1 : " + (m >> 1)); // Right shift
    }
}