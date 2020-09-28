package designpatterns.abstractfactory.furniture.modern;

import designpatterns.abstractfactory.furniture.CoffeeTable;

import java.util.Random;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public Integer getWidth() {
        return new Random().nextInt(300);
    }

    @Override
    public Integer getHeight() {
        return new Random().nextInt(300);
    }

    @Override
    public Integer getLength() {
        return new Random().nextInt(300);
    }
}
