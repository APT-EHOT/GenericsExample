public class LinkedList<T> {
    T value;
    LinkedList<T> next;
    private int size;

    public LinkedList(T value) {
        this.value = value;
        size = 1;
    }

    public void add(T value) {
        LinkedList<T> currentItem = this;
        while (currentItem.next != null)
            currentItem = currentItem.next;
        currentItem.next = new LinkedList<>(value);
        size++;
    }

    public T getValue(int index) {
        return getItem(index).value;
    }

    public LinkedList<T> getItem(int index) {
        if (index < 0 || index >= size)
            return null;

        LinkedList<T> currentItem = this;
        while (index != 0) {
            currentItem = currentItem.next;
            index--;
        }
        return currentItem;
    }
}
