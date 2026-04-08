class MathOp {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOp m = new MathOp();
        System.out.println(m.add(2, 3));       // 5
        System.out.println(m.add(2, 3, 4));    // 9
    }
}