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
        setLength(length);
    }

    /**
     * 設定正三角形的邊長。
     *
     * @param length 邊長
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 計算正三角形面積。
     *
     * @return 面積
     */
    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length / 4;
    }

    /**
     * 計算正三角形周長。
     *
     * @return 周長
     */
    @Override
    public double getPerimeter() {
        return 3 * length;
    }
}