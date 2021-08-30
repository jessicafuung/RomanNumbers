package no.kristiania;

public class RomanNumbers {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    static String toRoman(int numbers) {
        if (numbers == 2){
            return "II";
        }
        return "I";
    }
}
