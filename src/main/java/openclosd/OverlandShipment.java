package openclosd;


public class OverlandShipment  extends Shipment{

    public OverlandShipment(String id, double weight, double height){
        super.setId(id);
        super.setWeight(weight);
        super.setHeight(height);
    }

    @Override
    double calculateCost() {
        return getWeight()*getHeight()*3;
    }
}

