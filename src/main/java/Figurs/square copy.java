package Figurs;

class square extends rectangle {

    public square(Point anker, int delta) {
        super(anker, delta, delta);
    }

    //Inheritance of Circumference function of rectangle class

    public double Circumference() {
        return super.Circumference();
    }

    //Inheritance of area function of rectangle class

    public double shapeArea() {
        return super.shapeArea();
    }

    //Inheritance of ToString()

    public  String ToString(){
        return
                "shape with origin : " + this.origin() + " / Area : " + this.shapeArea() + " / Circumference : " + this.Circumference();
    }
}
