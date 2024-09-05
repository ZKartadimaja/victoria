public class Calculator {
    float a;
    float b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public float add() {
        return a + b;
    }

    public float subtraction() {
        return a - b;
    }

    public float multiply() {
        return a * b;
    }

    public float divide() {
        if (b == 0) {
            System.out.println("Error: Second Number Cannot 0");
            return 0;
        } else {
            return a / b;
        }
    }
}
