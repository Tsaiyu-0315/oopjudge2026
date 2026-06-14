/**
 * 表示正三角形。
 */
public class Triangle extends Shape {

    /**
     * 建立指定邊長的正三角形。
     *
     * @param length 邊長
     */
    public Triangle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length / 4;
    }

    @Override
    public double getPerimeter() {
        return 3 * length;
    }
}