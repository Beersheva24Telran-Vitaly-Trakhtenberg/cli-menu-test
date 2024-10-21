package telran.view.test;

import telran.view.*;

public class CalculatorItems
{
    private static Calculator calculator;

    public static Item[] getItems(Calculator calculator)
    {
        CalculatorItems.calculator = calculator;
        Item[] res = {
                Item.of("Add values", CalculatorItems::add),
                Item.of("Subtract values", CalculatorItems::subtract),
                Item.of("Multiply values", CalculatorItems::multiply),
                Item.of("Divide values", CalculatorItems::divide),
                Item.ofExit()
        };
        return res;
    }

    public static double[] enteredNumbers(InputOutput io)
    {
        double op1 = io.readDouble("Enter first value", "");
        double op2 = io.readDouble("Enter second value", "");

        return new double[]{op1, op2};
    }

    static void add(InputOutput io)
    {
        double[] numbers = enteredNumbers(io);
        io.writeLine(calculator.add(numbers[0], numbers[1]));
    }

    static void subtract(InputOutput io)
    {
        double[] numbers = enteredNumbers(io);
        io.writeLine(calculator.subtract(numbers[0], numbers[1]));
    }

    static void multiply(InputOutput io)
    {
        double[] numbers = enteredNumbers(io);
        io.writeLine(calculator.multiply(numbers[0], numbers[1]));
    }

    static void divide(InputOutput io)
    {
        double[] numbers = enteredNumbers(io);
        io.writeLine(calculator.divide(numbers[0], numbers[1]));
    }
}
