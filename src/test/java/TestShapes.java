import liskov.Rectangle;
import liskov.Square;
import liskov.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   class TestShapes {
    @Test
     void TestShapes(){

        //Given
        Rectangle rectangle = new Rectangle(12,20);

        Square square = new Square(20);

        Triangle triangle = new Triangle(15,20);

         //When
        double triangleArea=triangle.area();
        double squareArea=square.area();
        double rectangleArea=rectangle.area();

        //Then
        Assertions.assertEquals(240,triangleArea);
        Assertions.assertEquals(400,squareArea);
        Assertions.assertEquals(150,rectangleArea);
    }


}
