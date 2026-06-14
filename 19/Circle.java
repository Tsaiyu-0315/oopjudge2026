/**
 * 表示圓形，length 代表直徑。
 */
public class Circle extends Shape {

    public Circle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double radius = length / 2.0;
        double area = Math.PI * radius * radius;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        double perimeter = Math.PI * length;
        return Math.round(perimeter * 100.0) / 100.0;
    }
}