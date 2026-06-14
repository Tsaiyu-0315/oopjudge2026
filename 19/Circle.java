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
        setLength(length);
    }

    /**
     * 設定圓形的直徑。
     *
     * @param length 直徑
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 計算圓形面積。
     *
     * @return 面積
     */
    @Override
    public double getArea() {
        double radius = length / 2;
        return Math.PI * radius * radius;
    }

    /**
     * 計算圓形周長。
     *
     * @return 周長
     */
    @Override
    public double getPerimeter() {
        return Math.PI * length;
    }
}