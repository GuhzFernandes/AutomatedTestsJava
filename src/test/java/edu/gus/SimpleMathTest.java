package edu.gus;

import edu.gus.SimpleMath;
import org.junit.jupiter.api.*;

public class SimpleMathTest {
    static SimpleMath simpleMath;

    @BeforeAll
    public static void setup() {
        System.out.println("Setting up SimpleMath");
        simpleMath = new SimpleMath();
    }


    @Test
    public void testSum() {
        //Setting up variables
        Double firstNumber = 3D;
        Double secondNumber = 2D;
        Double expected = 5D;

        //Executing
        double value = simpleMath.sum(firstNumber, secondNumber);

        //Validating
        Assertions.assertEquals(expected, value);
    }

    @Test
    public void testSubtraction() {
        //Setting up variables
        Double firstNumber = 3D;
        Double secondNumber = 2D;
        Double expected = 1D;

        //Executing
        double value = simpleMath.subtraction(firstNumber, secondNumber);

        //Validating
        Assertions.assertEquals(expected, value);
    }


    @Test
    public void testMultiplication() {
        //Setting up variables
        Double firstNumber = 3D;
        Double secondNumber = 2D;
        Double expected = 6D;

        //Executing
        double value = simpleMath.multiplication(firstNumber, secondNumber);

        //Validating
        Assertions.assertEquals(expected, value);
    }

    @Test
    public void testDivision() {
        //Setting up variables
        Double firstNumber = 3D;
        Double secondNumber = 2D;
        Double expected = 1.5D;

        //Executing
        double value = simpleMath.division(firstNumber, secondNumber);

        //Validating
        Assertions.assertEquals(expected, value);
    }

    @Test
    public void testMean() {
        //Setting up variables
        Double firstNumber = 3D;
        Double secondNumber = 2D;
        Double expected = 2.5D;

        //Executing
        double value = simpleMath.mean(firstNumber, secondNumber);

        //Validating
        Assertions.assertEquals(expected, value);
    }

    @Test
    public void testSquareRoot() {
        //Setting up variables
        Double number = 9D;
        Double expected = 3D;

        //Executing
        double value = simpleMath.squareRoot(number);

        //Validating
        Assertions.assertEquals(expected, value);
    }

    @Test
    public void testArithmeticException() {
        //Setting up variables
        Double firstNumber = 3D;
        Double secondNumber = 0D;

        //Executing and Validating
        Assertions.assertThrows(ArithmeticException.class, () -> {simpleMath.division(firstNumber, secondNumber);});
    }
}
