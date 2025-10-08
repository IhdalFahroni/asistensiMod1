public class App {
    public static void main(String[] args) throws Exception {
        DLL list = new DLL();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        list.insertAfter(3, 2);
        list.display();
        list.deleteByData(3);
        list.display();
    }
}
