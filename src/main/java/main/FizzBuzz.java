package main;

public class FizzBuzz {

    public String convertNumber(int num) {
        if (num % 5 == 0 && num % 7 != 0) {
            return "Fizz";
        } else if (num % 7 == 0 && num % 5 != 0) {
            return "Buzz";
        } else if (num % 7 == 0){
            return "FizzBuzz";
        } else {
            return "";
        }
    }
}
