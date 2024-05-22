import static java.lang.System.out;

class Main {
    int xxx = 5;

    public Main() {
        this.xxx = xxx;
    }

    public static void main(String[] args) {
        Main test = new Main();
        out.println(test.xxx);//test
        out.println("test");
    }
}
