public class CustomerManager {

//    ICustomerDal customerDal; //Bu ne demek; CustomerManager'ın customerDal'ı var ve biz onun Add'i çağırıyoruz.Aşağıdaki kodda görüldüğü üzere.
//    public void add(){ //Bu operasyonda iş kodları yazılır.
//      //  OracleCustomerDal oracleCustomerDal=new OracleCustomerDal(); //Bu sadece sistem oracle da çalışyor demek ve bağımlı olacağımızdan istenen bir durum değildir.
//    customerDal.Add();
//    }

    //Yukardakinden farklı ve en sağlıklı yöntem;

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal=customerDal;
    }

    public void add(){
        //iş kodları
        customerDal.Add();
    }

}
