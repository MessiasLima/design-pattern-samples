package designpatterns.abstractfactory.furniture;

import designpatterns.abstractfactory.furniture.artdeco.ArtDecoFurnitureFactory;
import designpatterns.abstractfactory.furniture.modern.ModernFurnitureFactory;
import designpatterns.abstractfactory.furniture.victorian.VictorianFurnitureFactory;

public class Room {
    private final FurnitureFactory furnitureFactory;

    public Room(FurnitureStyle style) {
        this.furnitureFactory = getFurnitureFactory(style);
    }

    private FurnitureFactory getFurnitureFactory(FurnitureStyle furnitureStyle) {
        switch (furnitureStyle) {
            case ART_DECO:
                return new ArtDecoFurnitureFactory();
            case MODERN:
                return new ModernFurnitureFactory();
            case VICTORIAN:
                return new VictorianFurnitureFactory();
            default:
                throw new RuntimeException("Invalid furniture style");
        }
    }

    public Chair getChair() {
        return furnitureFactory.createChair();
    }

    public Sofa getSofa() {
        return furnitureFactory.createSofa();
    }

    public CoffeeTable getCoffeeTable() {
        return furnitureFactory.createCoffeeTable();
    }
}
