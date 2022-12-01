class Employee2{
    private  String name;
    private  int id;
    private  String role;

    //calling Constructor and assign the parameter values
    Employee2(String EmpName , int EmpID , String EmpRole){
        name = EmpName;
        id = EmpID;
        role = EmpRole;
    }

    //setter & Getter method name
    public  void setName(String n){
        name = n;
    }
    public String getName(){
        return  name;
    }

    //setter & Getter method id
    public  void  setId(int i){
        id =i;
    }
    public  int getId(){
        return  id;
    }

    //setter & Getter method in Job role
    public  void  setRole(String r){
        role = r;
    }
    public  String getRole(){
        return role;
    }

}

public  class EncapsulationEmployee
{
    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Mohamed",113,"Java");
        Employee2 e2 = new Employee2("Prabhu",114,"Angular");
        Employee2 e3 = new Employee2("Kannan",115,"Vue");
        e1.setName("Mohamed");
        e1.setId(113);
        e1.setRole("Java");
        System.out.println("Employee Name : " + e1.getName());
        System.out.println("Employee ID : " + e1.getId());
        System.out.println("Employee Role : " + e1.getRole());
        e2.setName("Prabhu");
        e2.setId(114);
        e2.setRole("Angular");
        System.out.println("Employee Name : " + e2.getName());
        System.out.println("Employee ID : " + e2.getId());
        System.out.println("Employee Role : " + e2.getRole());
        e3.setName("Kannan");
        e3.setId(115);
        e3 .setRole("Vue");
        System.out.println("Employee Name : " + e3.getName());
        System.out.println("Employee ID : " + e3.getId());
        System.out.println("Employee Role : " + e3.getRole());

    }
}