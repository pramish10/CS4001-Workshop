public class LiteralPractice {
    public static void main(String[] args) {
        // Long literal (requires 'L' suffix)
        long longVar = 1234567890123L;

        // Float literal (requires 'f' suffix)
        float floatVar = 9.81f;

        // Char literal using Unicode escape sequence (© symbol is \u00A9)
        char charVar = '\u00A9';

        // Printing values
        System.out.println("Literal Practice");
        System.out.println("----------------");
        System.out.println("Long literal value   : " + longVar);
        System.out.println("Float literal value  : " + floatVar);
        System.out.println("Char literal value   : " + charVar);
    }
}