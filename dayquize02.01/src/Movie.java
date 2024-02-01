public class Movie extends Item {
    String director;
    String actor;

    public Movie (String directorName,String actorName ,
                  int id,String name, int price ){
        super(id, name, price);
        this.director = directorName ;
        this.actor =  actorName;

    }

    String getDirector(){
        return director;
    }

    String getActor(){
        return actor;
    }

    @Override
    void ItemManager() {
        super.ItemManager();
        System.out.println("자식 객체의 DIRECTOR:"+this.director);
        System.out.println("자식 객체의 ACTOR:"+this.actor);
    }

}
