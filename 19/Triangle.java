/**
 * 表示正三角形。
 */
public class Triangle extends Shape {

    public Triangle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = Math.sqrt(3) * length * length / 4.0;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 3.0 * length;
        return Math.round(perimeter * 100.0) / 100.0;
    }
}