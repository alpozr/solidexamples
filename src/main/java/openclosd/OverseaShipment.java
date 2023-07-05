package openclosd;

public class OverseaShipment  extends Shipment{


    public OverseaShipment(String id, double weight, double height){
        super.setId(id);
        super.setWeight(weight);
        super.setHeight(height);
    }

    @Override
    double calculateCost() {
              return getWeight()*getHeight()*3;
    }
}
