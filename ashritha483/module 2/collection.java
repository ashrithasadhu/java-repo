import java.util.ArrayList;
public class collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("good morning");
        {
        System.out.println("print elements:" + list);
        System.out.println( list.get(0));
        list.remove("Hello");
        System.out.println("after removal:" + list);
        int updateIndex=list.indexOf("World");
        list.set(updateIndex,"everyone");
        System.out.println("after update:" + list);
        }
    }
}