package designpatterns.abstractfactory.furniture;


import designpatterns.abstractfactory.furniture.artdeco.ArtDecoChair;
import designpatterns.abstractfactory.furniture.artdeco.ArtDecoCoffeeTable;
import designpatterns.abstractfactory.furniture.artdeco.ArtDecoSofa;
import designpatterns.abstractfactory.furniture.modern.ModernChair;
import designpatterns.abstractfactory.furniture.modern.ModernCoffeeTable;
import designpatterns.abstractfactory.furniture.modern.ModernSofa;
import designpatterns.abstractfactory.furniture.victorian.VictorianChair;
import designpatterns.abstractfactory.furniture.victorian.VictorianCoffeeTable;
import designpatterns.abstractfactory.furniture.victorian.VictorianSofa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Room test")
public class RoomTest {
    @DisplayName("Should generate art deco furniture")
    @Test
    void shouldGenerateArtDecoFurniture(){
        var room = new Room(FurnitureStyle.ART_DECO);
        assertTrue(room.getChair() instanceof ArtDecoChair);
        assertTrue(room.getSofa() instanceof ArtDecoSofa);
        assertTrue(room.getCoffeeTable() instanceof ArtDecoCoffeeTable);
    }

    @DisplayName("Should generate modern furniture")
    @Test
    void shouldGenerateModernFurniture(){
        var room = new Room(FurnitureStyle.MODERN);
        assertTrue(room.getChair() instanceof ModernChair);
        assertTrue(room.getSofa() instanceof ModernSofa);
        assertTrue(room.getCoffeeTable() instanceof ModernCoffeeTable);
    }

    @DisplayName("Should generate victorian furniture")
    @Test
    void shouldGenerateVictorianFurniture(){
        var room = new Room(FurnitureStyle.VICTORIAN);
        assertTrue(room.getChair() instanceof VictorianChair);
        assertTrue(room.getSofa() instanceof VictorianSofa);
        assertTrue(room.getCoffeeTable() instanceof VictorianCoffeeTable);
    }
}