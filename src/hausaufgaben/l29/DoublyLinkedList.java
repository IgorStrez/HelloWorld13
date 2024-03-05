package hausaufgaben.l29;

class DoublyLinkedList implements IntList {
    static class DoubleNode {
        int data;
        DoubleNode prev;
        DoubleNode next;

        public DoubleNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
}

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за рамки");
        }
        // Начинаем с головы списка
        DoubleNode current = head;
        // Идём по списку, пока не достигнем нужного индекса
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        // Возвращаем значение текущего узла
        return current.data;
    }
    @Override
    public void add(int value) {
        DoubleNode node = new DoubleNode(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    @Override
    public void remove(int index) {
        // Проверяем, что индекс находится в допустимом диапазоне
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Начинаем с головы списка
        DoubleNode current = head;
        // Проходим по списку до нужного индекса
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        // Проверяем случаи удаления элемента из начала или конца списка
        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            // Удаление элемента из середины списка
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        // Уменьшаем размер списка
        size--;
    }
}
