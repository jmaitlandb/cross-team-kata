package org.verint.designpatterns;

public class FactoryCreator {
    public static AbstractFactory getFactory(boolean isBig) {
        if (isBig) {
            return new BigShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
