package Figurs;

class rectangle extends shape {
    private final String shapeType = "rectangle";
    //inherits point and name of the shape, extends to it half of each side of the rectangle

    private final double deltax; //half of side x
    private final double deltay; // half of side y

    public rectangle(Point anker, int halfLength, int halfWidth) {
        super(anker);
        this.deltax = halfLength;
        this.deltay = halfWidth;
    }
    //circumference method

    public double Circumference () {
        return 2 * (2 * deltax + 2 * deltay);
    }

    //area calculator :

    public double shapeArea () {
        return (2 * deltax) * (2 * deltay);

    }

    public String ToString () {
        return
                "rectangle with origin : " + this.origin() + " / Area : " + this.shapeArea() + " / Circumference : " + this.Circumference();
    }
}

