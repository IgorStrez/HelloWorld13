package hausaufgaben.l29;

class DoublyLinkedList implements IntList {
    private static class DoubleNode {
        int data;
        DoubleNode prev;
        DoubleNode next;

        public DoubleNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за рамки");
        }
        DoubleNode current = getNode(index);
        return current.data;
    }

    @Override
    public int add(int value) {
        return addLast(value);
    }

    @Override
    public int add(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс выходит за рамки");
        }
        if (index == size) {
            return addLast(value);
        } else if (index == 0) {
            addFirst(value);
            return 0;
        } else {
            addAtIndex(value, index);
            return index;
        }
    }

    @Override
    public int addLast(int value) {
        if (size == 0) {
            addFirst(value);
            return 0;
        } else {
            DoubleNode newNode = new DoubleNode(value);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            return size - 1;
        }
    }

    @Override
    public int addFirst(int value) {
        DoubleNode newNode = new DoubleNode(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        return 0;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за рамки");
        }
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
            DoubleNode current = getNode(index);
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    private DoubleNode getNode(int index) {
        if (index < size / 2) {
            DoubleNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            DoubleNode current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    private void addAtIndex(int value, int index) {
        DoubleNode current = getNode(index - 1);
        DoubleNode newNode = new DoubleNode(value);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }
}
