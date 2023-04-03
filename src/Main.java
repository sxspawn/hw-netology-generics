public class Main {

    public static void main(String[] args) {
        System.out.println("Коробка №1");
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("Ручка");
        magicBox1.add("Пенал");
        magicBox1.add("Ластик");
        magicBox1.add("Линейка");
        magicBox1.add("Карандаш");
        magicBox1.add("Кисточка");
        try {
            System.out.println("Выбранный предмет: " + magicBox1.pick() + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println("Коробка №2");
        MagicBox<String> magicBox2 = new MagicBox<>(6);
        magicBox2.add("Нож");
        magicBox2.add("Вилка");
        magicBox2.add("Ложка");
        magicBox2.add("Тарелка");
        magicBox2.add("Чашка");
        try {
            System.out.println("Выбранный предмет: " + magicBox2.pick() + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println("Коробка №3");
        MagicBox<String> magicBox3 = new MagicBox<>(2);
        magicBox3.add("Пряник");
        magicBox3.add("Молоко");
        try {
            System.out.println("Выбранный предмет: " + magicBox3.pick());
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

    }
}