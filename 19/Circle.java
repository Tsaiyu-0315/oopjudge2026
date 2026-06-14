/**
 * 表示圓形，length 代表直徑。
 */
public class Circle extends Shape {

    /**
     * 建立指定直徑的圓形。
     *
     * @param length 直徑
     */
    public Circle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double radius = length / 2;
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * length;
    }
}