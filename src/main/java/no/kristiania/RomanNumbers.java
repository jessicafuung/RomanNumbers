package no.kristiania;

public class RomanNumbers {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    static String toRoman(int numbers) {
        String romanNumber = "";

        if (numbers == 4) {
            return "IV";
        } else {
            for (int i = 0; i < numbers; i++) {
                romanNumber += "I";
            }
            return romanNumber;
        }
    }
}
