package step1.rectangle;

public class RectanglePrOopMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("넓이 : " + rectangle.calculateArea());
        System.out.println("둘레 길이 : " + rectangle.calculatePerimeter());
        System.out.println("정사각형 여부 : " + rectangle.isSquare());
    }
}
