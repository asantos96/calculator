import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        //Declaring property of the class which gives access throughout
    private Calculator myCalculator;

    @BeforeEach
    public void setUpCalculatorTestObject() {
        //Initializing what will be used for every @test, instantiating calculator class
        myCalculator = new Calculator();
    }

    @Test
    void additionTest() {

        //the @beforeeach method will create the calculator object everytime before the act portion

        //Establishes list to test
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(14);

        //Act
        double result = myCalculator.addition(numbersList);

        //Assert
        assertEquals(result, 24);
    }

    @Test
    void subtractionTest() {
        //Arrange


        //Act
        double result = myCalculator.subtraction(3, 1);

        //Assert
        assertEquals(result, 2);

    }

    @Test
    void multiplicationTest() {
        //Arrange


        //Act
        double result = myCalculator.multiplication(4, 11);

        //Assert
        assertEquals(result, 44);
    }

    @Test
    void divisionTest() {
        //Arrange


        //Act
        double result = myCalculator.division(10, 2);

        //Assert
        assertEquals(result, 5);
    }

        //If deciding not to use the @beforeeach method you could arrange(create object) every single time like below
    @Test
    void squareRootTest() {
        //Arrange
        Calculator testSquareRootMethod = new Calculator();

        //Act
        double result = testSquareRootMethod.squareRoot(9);

        //Assert
        assertEquals(result, 3);
    }
}