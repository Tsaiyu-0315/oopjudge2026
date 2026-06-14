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
        setLength(length);
    }

    /**
     * 設定正方形的邊長。
     *
     * @param length 邊長
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 計算正方形面積。
     *
     * @return 面積
     */
    @Override
    public double getArea() {
        return length * length;
    }

    /**
     * 計算正方形周長。
     *
     * @return 周長
     */
    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}