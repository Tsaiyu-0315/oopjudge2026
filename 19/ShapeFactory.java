/**
 * 建立不同種類的形狀物件。
 */
public class ShapeFactory {

    /**
     * 可建立的形狀種類。
     */
    public enum Type {
        Triangle,
        Square,
        Circle
    }

    /**
     * 根據種類建立形狀。
     *
     * @param shapeType 形狀種類
     * @param length 邊長或直徑
     * @return 建立完成的形狀物件
     */
    public Shape createShape(Type shapeType, double length) {
        switch (shapeType) {
            case Triangle:
                return new Triangle(length);

            case Square:
                return new Square(length);

            case Circle:
                return new Circle(length);

            default:
                return null;
        }
    }
}
