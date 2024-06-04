public class Customer {
    public String userName;
    public String gender;
    public int custId;
    public Customer(String userName, String gender , int custId){
        this.userName = userName;
        this.gender = gender;
        this.custId = custId;
    }
    public  void show(){
       System.out.println(userName);
    }
    public static void main(String[] args) {
        Customer info = new Customer("guess", "male", 1020);
        info.show();
      
    }
}