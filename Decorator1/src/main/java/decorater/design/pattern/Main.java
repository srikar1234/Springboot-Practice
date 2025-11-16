package decorater.design.pattern;

import decorater.design.pattern.Pizzas.BasePizza;
import decorater.design.pattern.Pizzas.MargaritaPizza;
import decorater.design.pattern.Toppings.ExtraCheeseDecorater;
import decorater.design.pattern.Toppings.MushroomsDecorater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new MargaritaPizza();
        BasePizza extracheesePizza = new ExtraCheeseDecorater(pizza);
        System.out.println(extracheesePizza.cost());
        BasePizza extraCheeseAndMushroomPizza = new ExtraCheeseDecorater(new MushroomsDecorater(pizza));
        System.out.println(extraCheeseAndMushroomPizza.cost());
    }
}