package org.verint.designpatterns;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = null;
        shapeFactory = FactoryCreator.getFactory(args[0].equals("big"));
        Shape shape = shapeFactory.getShape(args[1]);
        shape.draw();
    }
}