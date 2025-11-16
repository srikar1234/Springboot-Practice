public class ShapeClient {
    private Shape shapePrototype;

    public ShapeClient(Shape shape){
        this.shapePrototype = shape;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}
