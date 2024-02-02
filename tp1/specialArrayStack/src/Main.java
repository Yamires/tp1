public class Main {
    public static void main(String[] args) {
        SpecialArrayStack<Integer> stack = new SpecialArrayStack<>();


        stack.push(10);
        stack.push(15);
        stack.push(52);
        stack.push(1);
        stack.push(40);

        stack.pop();
        //System.out.println( stack.top());
        //System.out.println("Max is " + stack.getMax());
        System.out.println(stack.toString());
        //System.out.println(stack.top());
    }
}