package factory.design.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape newShape = factory.getShape("CIRCLE");
        newShape.draw();
    }
}