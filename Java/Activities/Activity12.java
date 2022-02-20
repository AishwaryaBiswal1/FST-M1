package Activities;

interface Addable {
    int add(int num1, int num2);
    }

public class Activity12 {
    public static void main(String[] args) {
        Addable add1 = (num1, num2) -> (num1 + num2);
        System.out.println(add1.add(15, 40));

        Addable add2 = (int num1, int num2) -> {
            return (num1 + num2);
        };

        System.out.println(add2.add(7,9));
    }
}
