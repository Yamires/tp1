public class Main {
    public static void main(String[] args) {
        DoubleStackArray<Integer> stack = new DoubleStackArray<>();

        stack.push(true,5);
        stack.push(false,10);
        stack.push(true, 15);
        stack.push(false,52);
        stack.push(true,1);
        stack.push(true,52);
        stack.push(true,40);
        stack.push(false,1);
        stack.push(false,52);
        stack.push(false,41);

        //stack.pop(true);
        //stack.pop(false);
        System.out.println( stack.top(true));
        System.out.println( stack.top(false));
        System.out.println(stack.toString());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size(false));

}
}