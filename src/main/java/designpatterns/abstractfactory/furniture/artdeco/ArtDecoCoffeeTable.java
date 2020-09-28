package designpatterns.abstractfactory.furniture.artdeco;

import designpatterns.abstractfactory.furniture.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public Integer getWidth() {
        return 80;
    }

    @Override
    public Integer getHeight() {
        return 40;
    }

    @Override
    public Integer getLength() {
        return 100;
    }
}
