package org.verint.designpatterns;

public class BigShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "rectangle" -> new BigRectangle();
            case "square" -> new BigSquare();
            default -> null;
        };
    }
}
