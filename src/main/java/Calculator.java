import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Calculator {

    // Bonus: Modify your add() method so that instead of accepting two numbers as parameters, it takes an ArrayList of
    // Integers and adds all the numbers in the collection


    //Runs through each index and adds together

    public double addition(List<Integer> addedNumbers) {
        double totalAddition = 0;
        for(int i = 0; i < addedNumbers.size(); i++)
            totalAddition += addedNumbers.get(i);
        return totalAddition;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        double totalSubtraction = firstNumber - secondNumber;
        return totalSubtraction;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        double totalMultiplication = firstNumber * secondNumber;
        return totalMultiplication;
    }

    public double division(double firstNumber, double secondNumber) {
        double totalDivision = firstNumber / secondNumber;
        return totalDivision;
    }

    public double squareRoot(double firstNumber) {
        double squareRootOf = sqrt(firstNumber);
        return squareRootOf;
    }
}