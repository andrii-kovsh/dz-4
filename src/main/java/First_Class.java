public class First_Class {
    public static void main(String[] args) {
        Second_Class secondObject = new Second_Class(); // Створення екземпляру другого класу
        int value = secondObject.getField(); // Виклик методу getField()
        System.out.println("~~~ " + value + " ~~~"); // Виведення поверненого значення у консоль
    }
}