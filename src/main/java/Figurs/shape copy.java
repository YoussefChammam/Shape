package Figurs;
// 1. 1 *****

import org.junit.Test;

import java.awt.*;


class shape {
    private final Point Anker;
    /*
     * Base class for geometrical shapes. Each Figurs.shape has an explicit origin * represented by a point: (x,y).
     * @ version 1.x
     * @author X.Y.
     */

    public shape( Point anker){
        this.Anker = anker;
    }

    public double shapeArea(){
        //base Figurs.shape is just a point so it has no Figurs.shape
        return 0;
    }

    public double Circumference(){
        //base Figurs.shape is just a point so it has no circumference
        return 0;
    }
/*
 * constructs a textual representation of the origin in the form: "(x, y)".
 * @return the origin on textual representation
 */
    public String origin() {
        return "( " + Double.toString(Anker.getx()) + " ; " + Double.toString(Anker.gety()) + " )";
    }

    /*
     * constructs a textual representation of the object.
     * @return the current object in a textual representation */
    public  String ToString(){
        return
        "shape with origin : " + this.origin() + " / Area : " + this.shapeArea() + " / Circumference : " + this.Circumference();
    }
}



//point

class Point {
    int x;
    int y;

    //constructor

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    //getters

    /* x-coordinate of the origin */
    public int getx(){
        return x;
    }
    /* y-coordinate of the origin */
    public int gety(){
        return y;
    }
}