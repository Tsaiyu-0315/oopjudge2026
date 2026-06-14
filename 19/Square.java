/**
 * 表示正方形。
 */
public class Square extends Shape {

    /**
     * 建立指定邊長的正方形。
     *
     * @param length 邊長
     */
    public Square(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}