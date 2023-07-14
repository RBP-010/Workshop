package Workshop;



public class Patient {
    String name,city,state,department;
    int age;
    long phonenumber;
    void display(){
        System.out.println(name+" "+city+" "+state+" "+department+" "+age+" "+phonenumber);
    }
    Patient(String name,String city,String state,String department,int age,long phonenumber){
        this.name=name;
        this.city=city;
        this.state=state;
        this.department=department;
        this.age=age;
        this.phonenumber=phonenumber;
    }
    public static void main(String[] args) {
        Patient obj = new Patient("Rakesh","pune","Maharashtra","surgeon",31,12345678);
        Patient obj1 = new Patient("Seema","Panvel","Maharashtra","Orthopedic",28,2345678);
         obj.display();
         obj1.display();
    }

}
