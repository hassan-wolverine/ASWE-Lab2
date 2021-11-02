
public class Rectangle extends Shape implements IArea {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public String toString() {
        return "this is a rectangle with length " + this.length + "\n";
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return (this.length + this.width) * 2;
    }
}
