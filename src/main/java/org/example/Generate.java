package org.example;

class Generate {
    int xxx = 6;

    public Generate(int xxx) {
        this.xxx = xxx;
        int x = 1;
        x += 2;
    }

    public Generate() {

    }

    public static void main(String[] args) {
        Generate test = new Generate();
        System.out.println(test.xxx);
        System.out.println("test1");

    }
}
