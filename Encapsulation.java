
class  voter{
    private  String voterName;
    private  int voterAge;

    voter(String name , int age){
        voterAge = age;
        voterName = name;
    }

    //Setter Method
    public  void  setVoterAge(int a) {
        if (a >= 1 && a <= 17) {
            voterAge = a;
            System.out.println("you are not eligible for vote");

        } else
            System.out.println("you are eligible for vote");
    }
    //Getter Method
    public  int getVoterAge(){
        return  voterAge;
    }

}

public  class Encapsulation
{
    public static void main(String[] args) {
        voter v1 = new voter("mohamed ",20);
        v1.setVoterAge(20);
        System.out.println("your age is : " + v1.getVoterAge());
    }
}