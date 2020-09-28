package designpatterns.abstractfactory.furniture.victorian;

import designpatterns.abstractfactory.furniture.Sofa;

public class VictorianSofa implements Sofa {
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
        System.out.println("Sitting on a Victorian sofa");
    }
}
