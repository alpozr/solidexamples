package openclosd;

public class OverairShipment  extends Shipment{


    public OverairShipment(String id, double weight, double height){
        super.setId(id);
        super.setWeight(weight);
        super.setHeight(height);
    }

    @Override
    double calculateCost() {
        return getWeight()*getHeight()*5;
    }
}

