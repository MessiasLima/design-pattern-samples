package designpatterns.abstractfactory.furniture.victorian;

import designpatterns.abstractfactory.furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public Integer getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a Victorian chair");
    }
}
