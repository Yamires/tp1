public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(100);

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();

        System.out.println(stack.toString());
    }
}
