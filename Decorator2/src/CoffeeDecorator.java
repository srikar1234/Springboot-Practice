public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;
    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
