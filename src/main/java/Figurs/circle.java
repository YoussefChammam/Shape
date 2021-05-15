package Figurs;
import java.math.*;
public class circle extends shape{
    double radius; // radius of the circle
    double pi = 3.1415; // approximate value of pi

    //Constructor of the circle with inheritance of the point

    public circle(Point anker , double radius){
        super(anker);
        this.radius = radius;
    }

    //circumference calculator

    public double Circumference () {
        return 2*pi*radius;
    }

    //area calculator :

    public double shapeArea () {
        return pi * Math.pow(radius , 2);

    }

    //toString method

    public String ToString () {
        return
                "circle with origin : " + this.origin() + " / Area : " + this.shapeArea() + " / Circumference : " + this.Circumference();
    }


}
