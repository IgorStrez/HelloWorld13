package hausaufgaben.l28;

public class MainBook {
    public static void main(String[] args) {
        Bookcase bookcase1 = new Bookcase();
        bookcase1.addBook("Сергей Мавроди", "Сын Люцифера", 2011);
        bookcase1.addBook("Сергей Мавроди", "ПираМММида", 1994);
        bookcase1.addBook("Сергей Мавроди", "Сын Люцифера-3", 2013);
        bookcase1.addBook("Салтыков-Щедрин", "История одного города", 1869);
        bookcase1.addBook("Салтыков-Щедрин", "Дикий помещик", 2011);
        bookcase1.addBook("Салтыков-Щедрин", "Губернские очерки", 1856);
        bookcase1.addBook("Гарри Гаррисон", "Рождение Стальной Крысы", 1985);
        bookcase1.addBook("Гарри Гаррисон", "Стальная Крыса спасает мир", 1972);
        bookcase1.addBook("Гарри Гаррисон", "Стальная Крыса отправляется в ад", 1996);
        bookcase1.findBookcase();
        System.out.println("Удаление книги с индексом 7");
        bookcase1.removeBook(7);
        bookcase1.findBookcase();


        System.out.println("Создаём итератор");
        Bookcase.Iterator myIterator = bookcase1.new Iterator();
        for (int i = 0; i < bookcase1.getSize(); i++)
            System.out.println(myIterator.checkBookcase());
        myIterator.checkBookcase();

    }
}
