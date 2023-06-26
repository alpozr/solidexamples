package liskov;

public class Rectangle implements Shape{

    private double longedge ;
    private double shortedge;

    public Rectangle(int longedge,int shortedge){
        this.shortedge=shortedge;
        this.longedge=longedge;
    }
    public void setLongedge(int longedge) {
        this.longedge = longedge;
    }

    public void setShortedge(int shortedge) {
        this.shortedge = shortedge;
    }

    @Override
    public double area() {
        return longedge*shortedge;
    }
}
