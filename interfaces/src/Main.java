public class Main {

    public static void main(String[] args) {
    //ICustomerDal customerDal=new OracleCustomerDal(); //Bu yapı polymorphism örnek olarak gösterilebilir.

//        CustomerManager customerManager=new CustomerManager();
//        customerManager.customerDal=new MySqlCustomerDal();
//        customerManager.add();
//        customerManager.customerDal=new OracleCustomerDal();
//        customerManager.add();

        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}
