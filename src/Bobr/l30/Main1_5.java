package Bobr.l30;

class Main1_5 {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Пока из анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здравствуйте!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Досвидания!");
            }
        };

        Greeting greeting3 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Да пошёл ты!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Иди давай, не оглядывайся!");
            }
        };

        greeting1.sayHello();
        greeting2.sayHello();
        greeting3.sayHello();
        greeting1.sayGoodBye();
        greeting2.sayGoodBye();
        greeting3.sayGoodBye();
    }
}