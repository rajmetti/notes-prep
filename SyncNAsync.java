

public class SyncNAsync {

  public static void main(String[] args) {

  }
}
class Account{
  synchronized void balance(){
    System.out.println("Your account holds: $ 90,000");
  }

  void stockBalance(){
    System.out.println("Your stock account holds: $ 100,000");
  }

}
