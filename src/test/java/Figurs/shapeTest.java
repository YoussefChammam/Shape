package Figurs;

import junit.framework.TestCase;
import org.w3c.dom.css.Rect;

public class shapeTest extends TestCase {
    public static void main(String[] args) {

        //List of Objects that we will test

        Point x = new Point(10 , 40);
        shape Shape = new shape(x);
        Point y = new Point ( 20 , 30);
        rectangle Rectangle = new rectangle(y , 35 , 15);
        Point z = new Point(30 , 20);
        square Square = new square(z , 5);
        Point alpha = new Point(40 , 10);
        circle Circle = new circle(alpha , 25);

        //outprint of the Circumference of the Square

        System.out.println(Square.Circumference());

        //outprint of the Area of the rectangle

        System.out.println(Rectangle.shapeArea());

        //outprint respectively of both the circumference and the area of the circle

        System.out.println(Circle.Circumference());
        System.out.println(Circle.shapeArea());
    }
}