package decorater.design.pattern.Toppings;

import decorater.design.pattern.Pizzas.BasePizza;

public class ExtraCheeseDecorater extends ToppingsDecorater{
    BasePizza basePizza;

    public ExtraCheeseDecorater(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
