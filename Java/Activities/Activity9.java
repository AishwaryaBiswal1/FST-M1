package Activities;
import java.util.ArrayList;
public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("First");
        myList.add("Word");
        myList.add("Second");
        myList.add(3, "Third");
        myList.add(1, "Fourth");
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is fifth is in list: " + myList.contains("fifth"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Fourth");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
