package designpatterns.abstractfactory.furniture.victorian;

import designpatterns.abstractfactory.furniture.Chair;
import designpatterns.abstractfactory.furniture.CoffeeTable;
import designpatterns.abstractfactory.furniture.FurnitureFactory;
import designpatterns.abstractfactory.furniture.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
