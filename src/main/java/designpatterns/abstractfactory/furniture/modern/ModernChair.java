package designpatterns.abstractfactory.furniture.modern;

import designpatterns.abstractfactory.furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public Integer getNumberOfLegs() {
        return 1;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a modern chair");
    }
}
