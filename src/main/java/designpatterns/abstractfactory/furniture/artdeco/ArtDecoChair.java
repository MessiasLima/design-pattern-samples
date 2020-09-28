package designpatterns.abstractfactory.furniture.artdeco;

import designpatterns.abstractfactory.furniture.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public Integer getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a ArtDeco chair");
    }
}
