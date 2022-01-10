package Activities;


abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {

        return title;
    }

}
class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5 {

        public static void main(String []args) {
            String title = "New Novel title";
            Book newNovel = new MyBook();
            newNovel.setTitle(title);
            System.out.println("Title is: " + newNovel.getTitle());
        }


}
