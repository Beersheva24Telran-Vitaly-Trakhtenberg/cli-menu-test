package telran.view.test;

import telran.view.*;

public class Main
{
    public static void main(String[] args)
    {
        InputOutput io = new StandardInputOutput();
        Item[] items = CalculatorItems.getItems(new SimpleCalculator());
        Menu menu = new Menu("Calculator", items);
        menu.perform(io);
    }
}
