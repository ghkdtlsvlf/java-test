public class Book extends Item {
    String author;

    public Book (String author_name, int id,String name, int price ){
        super(id, name, price);
        this.author = author_name ;

    }

    String getAuthor(){
        return author;
    }
    @Override
    void ItemManager() {
        super.ItemManager();
        System.out.println("자식 객체의 AUTHOR:"+this.author);

    }
}
