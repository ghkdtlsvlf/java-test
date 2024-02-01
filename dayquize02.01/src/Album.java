public class Album extends Item {
    String artist_name;

   public Album (String artistName, int id,String name, int price ){
        super(id, name, price);
        this.artist_name = artistName ;

   }

   String getArtist_name(){
       return artist_name;
   }

    @Override
    void ItemManager() {
        super.ItemManager();
        System.out.println("자식 객체의 ARTIST:"+this.artist_name);
   }
}