package liskov;

public class Triangle implements Shape{
    private double edge ;
    private double height;

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(int edge,int height){
        this.edge=edge;
        this.height=height;
    }
    @Override
    public double area() {
        return (edge * height) / 2;
    }
}
