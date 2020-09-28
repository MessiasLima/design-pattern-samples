package designpatterns.abstractfactory.furniture.artdeco;

import designpatterns.abstractfactory.furniture.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public Integer getNumberOfLegs() {
        return 4;
    }

    @Override
    public Integer getNumberOfSeats() {
        return 3;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a art deco sofa");
    }
}
