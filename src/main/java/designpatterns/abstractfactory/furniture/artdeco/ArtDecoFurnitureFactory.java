package designpatterns.abstractfactory.furniture.artdeco;

import designpatterns.abstractfactory.furniture.Chair;
import designpatterns.abstractfactory.furniture.CoffeeTable;
import designpatterns.abstractfactory.furniture.FurnitureFactory;
import designpatterns.abstractfactory.furniture.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
