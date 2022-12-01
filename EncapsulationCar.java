class Cars{
    private  String name;
    private int price;
    private  int speed;


    Cars(String carName, int carPrice , int carSpeed){
        name = carName;
        price = carPrice;
        speed = carSpeed;
    }

    public  void  setName(String n){
        name =n;
    }
    public  String getName()
    {
        return name;
    }

    public  void  setPrice(int p){
        price = p;
    }
    public  int getPrice(){
        return  price;
    }

    public  void  setSpeed(int s){
        speed = s;
    }
    public  int getSpeed(){
        return  speed;
    }
}

public  class EncapsulationCar
{
    public static void main(String[] args) {
        Cars c = new Cars("Hyundai",70000, 170);
        c.setName("Hyundai");
        c.setPrice(700000);
        c.setSpeed(170);
        System.out.println("Car name : " + c.getName() + "  Car Price : " + c.getPrice() + "  Car Speed " + c.getSpeed());
        System.out.println("Some changes is update");
        c.setPrice(750000);
        c.setSpeed(180);
        System.out.println("Car name : " + c.getName() + "  Car Price : " + c.getPrice() + "  Car Speed " + c.getSpeed());

    }
}