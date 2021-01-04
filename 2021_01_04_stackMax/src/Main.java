public class Main {
    public static void main(String[] args) throws Exception {
        StackMax stackMax = new StackMax();
        stackMax.addLast(2);
        stackMax.addLast(8);
        stackMax.addLast(4);

        System.out.println(stackMax.getMax());
    }
}
