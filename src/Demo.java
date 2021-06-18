public class Demo {
    public static void main(String[] args) {
        Caller caller1 = new Caller("Peter");
        Caller caller2 = new Caller("Michael");

        new Thread(new Runnable() {
            @Override
            public void run() {
                caller1.call(caller2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                caller2.call(caller1);
            }
        }).start();
    }
}
