//Задача 1:
//        Создайте класс "Кот" (Cat) со следующими свойствами:
//
//        Приватное поле "имя" (name) типа String для хранения имени кота.
//        Приватное поле "возраст" (age) типа int для хранения возраста кота.
//        Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//        Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//        Дополнительное задание:
//        Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".



public class Task1 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик",4);

        barsik.showGreet();
    }
}
class Shaper {
    private String name;
    private int age;

    public Shaper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Shaper(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Cat extends Shaper1{

    public Cat(String name, int age) {
        super(name, age);
    }

    public void showGreet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет).", getName(), getAge());
    }
}

