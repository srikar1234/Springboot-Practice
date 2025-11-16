package factory.design.pattern;

public class ShapeFactory {
    Shape getShape(String input){
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
