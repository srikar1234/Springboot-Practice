package decorater.design.pattern.Toppings;

import decorater.design.pattern.Pizzas.BasePizza;

public class MushroomsDecorater extends ToppingsDecorater{
    BasePizza basePizza;

    public MushroomsDecorater(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
