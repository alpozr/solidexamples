package liskov;

public class Square implements Shape {
    private double edge ;

    public Square (int edge){
        this.edge=edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return  edge*edge;
    }
}
