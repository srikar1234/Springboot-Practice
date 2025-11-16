public class SugarDecorator extends CoffeeDecorator{
    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 0.3;
    }

    @Override
    public String getCoffeeDescription(){
        return coffee.getCoffeeDescription() + " With Addon: Sugar";
    }
}
