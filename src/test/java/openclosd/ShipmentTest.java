package openclosd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {

    @Test
    void calculateCostForOverair() {
        //GİVEN
        OverairShipment overairShipment = new OverairShipment("1234A",12.2,15.5);
        //WHEN
        double expected=overairShipment.calculateCost();
        //THEN
        assertEquals(expected,overairShipment.calculateCost());
    }
    @Test
    void calculateCostForOverland() {
        //GİVEN
        OverlandShipment overLandShipment = new OverlandShipment("1231L",12.2,15.5);
        //WHEN
        double expected=overLandShipment.calculateCost();
        //THEN
        assertEquals(expected,overLandShipment.calculateCost());
    }
    @Test
    void calculateCostForOverSea() {
        //GİVEN
        OverseaShipment overseaShipment = new OverseaShipment("1231S",12.2,15.5);
        //WHEN
        double expected=overseaShipment.calculateCost();
        //THEN
        assertEquals(expected,overseaShipment.calculateCost());
    }
}