package designpatterns.abstractfactory.furniture.modern;

import designpatterns.abstractfactory.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public Integer getNumberOfLegs() {
        return 1;
    }

    @Override
    public Integer getNumberOfSeats() {
        return 4;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a modern sofa");
    }
}
