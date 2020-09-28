package designpatterns.abstractfactory.furniture.modern;

import designpatterns.abstractfactory.furniture.Chair;
import designpatterns.abstractfactory.furniture.CoffeeTable;
import designpatterns.abstractfactory.furniture.FurnitureFactory;
import designpatterns.abstractfactory.furniture.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
