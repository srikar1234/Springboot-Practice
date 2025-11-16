//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee plainCoffee = new PlainCoffee();
        Coffee milkWithCoffee = new MilkDecorator(plainCoffee);
        Coffee milkWithSugarCoffee = new SugarDecorator(new MilkDecorator(new SugarDecorator(plainCoffee)));

        System.out.println(plainCoffee.getCoffeeDescription() + " and cost: " + plainCoffee.getCost());
        System.out.println(milkWithCoffee.getCoffeeDescription() + " and cost: " + milkWithCoffee.getCost());
        System.out.println(milkWithSugarCoffee.getCoffeeDescription() + " and cost: " + milkWithSugarCoffee.getCost());

    }
}