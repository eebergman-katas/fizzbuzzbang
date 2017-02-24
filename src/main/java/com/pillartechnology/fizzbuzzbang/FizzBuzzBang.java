package com.pillartechnology.fizzbuzzbang;

public class FizzBuzzBang {

    public static String beginFizzBuzzBang(Integer inputNumber) {

        if (numberIsDivisibleByThreeFiveAndSeven(inputNumber)) return "fizzBuzzBang";

        if (numberIsDivisibleByThreeAndFive(inputNumber)) return "fizzBuzz";

        if (numberIsDivisibleByThreeAndSeven(inputNumber)) return "fizzBang";

        if (numberIsDivisibleByFiveAndSeven(inputNumber)) return "buzzBang";

        if (isNumberDivisibleByThree(inputNumber)) return "fizz";

        if (isNumberDivisibleByFive(inputNumber)) return "buzz";

        if (isNumberDivisibleBySeven(inputNumber)) return "bang";

        return inputNumber.toString();
    }

    public static boolean numberIsDivisibleByFiveAndSeven(Integer inputNumber) {
        if (isNumberDivisibleByFive(inputNumber) && isNumberDivisibleBySeven(inputNumber)) {
            return true;
        }
        return false;
    }

    public static boolean numberIsDivisibleByThreeAndSeven(Integer inputNumber) {
        if (isNumberDivisibleByThree(inputNumber) && isNumberDivisibleBySeven(inputNumber)) {
            return true;
        }
        return false;
    }

    public static boolean numberIsDivisibleByThreeAndFive(Integer inputNumber) {
        if (isNumberDivisibleByThree(inputNumber) && isNumberDivisibleByFive(inputNumber)) {
            return true;
        }
        return false;
    }

    public static boolean numberIsDivisibleByThreeFiveAndSeven(Integer inputNumber) {
        if (isNumberDivisibleByThree(inputNumber) && isNumberDivisibleByFive(inputNumber) && isNumberDivisibleBySeven(inputNumber)) {
            return true;
        }
        return false;
    }

    public static boolean isNumberDivisibleByThree(int i) {
        if ((i % 3) == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean isNumberDivisibleByFive(int i) {
        if ((i % 5) == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNumberDivisibleBySeven(int i) {
        if ((i % 7) == 0) {
            return true;
        }
        return false;
    }
}
