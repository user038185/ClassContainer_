/**
 * Класс контейнер, позволяющий хранить произвольное количество объектов.
 * Использование встроенных коллекций запрещено.
 * Реализован с помощью массива.
 *
 * @param <T> Тип элементов, хранимых в контейнере.
 */
public class Container<T> {

    private Object[] elements;
    private int size;
    /**
     * Конструктор класса Container. Инициализирует пустой контейнер с начальной емкостью 10.
     */
    public Container() {
        elements = new Object[10];
        size = 0;
    }
    /**
     * Добавляет элемент в конец контейнера.
     *
     * @param element Элемент, который нужно добавить.
     */
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }
    /**
     * Возвращает элемент с заданным индексом.
     *
     * @param index Индекс элемента.
     * @return Элемент с заданным индексом.
     * @throws IndexOutOfBoundsException Если индекс находится за пределами допустимого диапазона.
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }
    /**
     * Удаляет элемент с заданным индексом.
     *
     * @param index Индекс элемента.
     * @throws IndexOutOfBoundsException Если индекс находится за пределами допустимого диапазона.
     */
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
    /**
     * Возвращает количество элементов в контейнере.
     *
     * @return Количество элементов.
     */
    public int size() {
        return size;
    }

    /**
     * Увеличивает размер массива на один элемент, если в нем не хватает места.
     */
    private void resize() {
        Object[] newElements = new Object[elements.length +1];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}


