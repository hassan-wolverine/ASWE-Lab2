
public class Square extends Shape implements IArea {
    private double side;

    public Square() {
        this.side = 0;
    }

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getCircumference() {
        return 4 * this.side;
    }
}
