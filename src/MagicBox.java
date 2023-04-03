import java.util.Random;

public class MagicBox<T> {
    private final T[] array;
    private int size;
    private final Random random = new Random();

    public MagicBox(int size) {
        array = (T[]) new Object[size];
        this.size = 0;
    }

    public boolean add(T item) {
        if (size < array.length) {
            array[size++] = item;
            return true;
        }
        System.out.println("Полна! лишний предмет: " + item);
        return false;
    }
    public T pick() {
        if (size != array.length) {
            throw new RuntimeException("Не заполнена, осталось '" + (array.length - size) + "' свободных ячеек!");
        }
        return array[random.nextInt(size)];
    }
}