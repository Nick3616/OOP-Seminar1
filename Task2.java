//Задача 2:
//        Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
//
//        Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//        Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//        Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//        Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//        Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
public class Task2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6,3);
        Rectangle defaultRectangle = new Rectangle();
        defaultRectangle.calculateArea();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}

class Rectangle{
    private int width;
    private int height;
    public Rectangle() {
        this.width = 10;
        this.height = 5;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public void calculateArea(){
        System.out.printf("Площадь прямоугольника равна: " + width * height + "\n");
    }
    public void calculatePerimeter(){
        System.out.printf("Периметр равен равен: " + 2*(width + height)+ "\n");
    }

}

