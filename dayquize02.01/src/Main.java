//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book redBook = new Book("나", 10, "국어책", 3000);
        Album redAlum = new Album("레드벨벳",25, "빨간맛", 10000);
        Movie redMovie = new Movie("봉준호","송강호",20,"기생충",20000 );

        redBook.ItemManager();
        redAlum.ItemManager();
        redMovie.ItemManager();
    }
}