public class Item {
    int id = 0;
    String name = "default";
    int price = 0;

    Item(){

    }
    Item (int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId(){
        return id;
    }
    int getPrice(){
        return price;
    }

    String getName() {
        return  name;
    }

   void ItemManager(){
       System.out.println("객체의 ID: "+this.id);
       System.out.println("객체의 NAME: "+this.name);
       System.out.println("객체의 PRICE: "+this.price);

   }
}
