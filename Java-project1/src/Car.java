class Car {

    String company = "volvo";
    String model;
    int maxspeed = 300;
    int currentSpeed = 0;
    public Car(){

    }

    public Car(String companyName, int maxSpeed){
        this.company = companyName;
        this.maxspeed = maxSpeed;
    }

    void printSpec(){
        System.out.println("이차는 "+ company+ "에서 제조 되었습니다." + "최고 속도는 "+ maxspeed + "입니다");

    }
    void changeSoftware(){

    }
    void setModel(String model){
        this.model = model;
    }

    void addSpeed(int speed){
        if(currentSpeed + speed < 300) {
            currentSpeed += speed;
            System.out.println("현재 속도는 "+ currentSpeed+ "입니다.");
        }

    }



}