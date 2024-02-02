public interface DoubleStack<E> {
    public void push(boolean one, E e);
    public E pop(boolean one);
    public E top(boolean one);
    public  boolean isFull();

}
