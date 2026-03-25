class Webclient{

    public void connect(){
        System.out.printf("URL: %s\nTimeout: %.1f\n", Config.url, Config.timeout);
    }

    static class Config{
        private static double timeout = 10.0;
        private static String url = "localhost";
    }
}

class Car{
    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;

    }

    public class Engine{
        void start(){
            System.out.printf("Starting with %s...\n", fuelType);
        }
    }
}

interface Message{
    void sendMessage();
}

class Library{
    private String[] titles;

    public Library(String[] titles) {
        this.titles = titles;
    }

    public class BookIterator{
        private int index;

        public BookIterator() {
            index = 0;
        }

        public boolean hasNext(){
            return index + 1 <= titles.length;
        }

        public String nextTitle(){
            if (hasNext()){
                return titles[index++];
            }
            throw new IndexOutOfBoundsException("No more books in the library!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Webclient wc = new Webclient();
        wc.connect();

        System.out.println("-----------------------------");

        Car c = new Car("benzine");
        Car.Engine e = c.new Engine();

        e.start();

        System.out.println("-----------------------------");

        sendMessage();

        System.out.println("-----------------------------");

        String[] books = {"Game of Thrones", "Lord of the Rings", "Harry Potter"};
        Library l = new Library(books);
        Library.BookIterator li = l.new BookIterator();
        System.out.println(li.hasNext());
        System.out.println(li.nextTitle());
        System.out.println(li.nextTitle());
        System.out.println(li.nextTitle());
        System.out.println(li.nextTitle());
        System.out.println(li.nextTitle());

    }

    public static void sendMessage(){
        Message m = new Message() {
            @Override
            public void sendMessage(){
                System.out.println("Hello from the inner world!");
            }
        };
        m.sendMessage();
    }
}
