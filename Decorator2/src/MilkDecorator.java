public class MilkDecorator extends CoffeeDecorator{
    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 0.5;
    }

    @Override
    public String getCoffeeDescription(){
        return coffee.getCoffeeDescription() + "With addons: Milk";
    }
}
