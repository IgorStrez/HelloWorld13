package hausaufgaben.l29;

interface IntList {
    int get(int index);

    int add(int value);
    int add(int value, int index);

    int addLast(int value);
    int addFirst(int value);

    void remove(int index);
    int size(); // этот метод должен возвращать int, а не void
    void clear();
}
