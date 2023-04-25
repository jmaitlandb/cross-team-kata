package org.verint.designpatterns;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            default -> null;
        };
    }
}
