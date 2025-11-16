public class PlainCoffee implements Coffee{
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getCoffeeDescription() {
        return "This is a plain coffee";
    }
}
