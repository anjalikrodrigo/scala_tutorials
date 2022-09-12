object q3 {

  class Account(x: Int, y: Int) {
    var accNo = x;
    var accBal = y

    def pri() = {
      println("Account #" + accNo + " funds = " + accBal)
    }
  }
  
  def transfer(n:Account, m:Account, amt:Int)={
    n.accBal -= amt;
    m.accBal += amt;

    n.pri();
    m.pri();
  }
  
  def main(args: Array[String])={
    val s = new Account(1, 100);
    val t = new Account(2, 200);
    transfer(s, t, 50);
  }
}