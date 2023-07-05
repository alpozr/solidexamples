package openclosd;

import lombok.Getter;
import lombok.Setter;


public abstract class Shipment {

    private String Id ;
    private Double weight ;
    private Double height;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    abstract double calculateCost();


}
