public class Main {
    public static final String MY_CONST = "Hello";
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>("String");
        LinkedList<Integer> li = new LinkedList<>(10);
        LinkedList<Boolean> lb = new LinkedList<>(false);

        ls.add("1 str");
        ls.add("2 str");
        ls.add("3 str");

        setItemToNull(ls.getItem(2));

        System.out.println(ls.getValue(2));
        System.out.println(ls.getValue(1));
    }

    private static <T> void setItemToNull(LinkedList<T> item) {
        item.value = null;
    }
}
