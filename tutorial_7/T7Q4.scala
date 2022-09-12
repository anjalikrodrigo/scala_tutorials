object q4 {

    class Account(x: Int, y: Double) {
        var accNo = x;
        var accBal = y

        def pri() = {
            println("Account #" + accNo + " balance = " + accBal)
        }
    }

    def sum(n: List[Account])={
        var sum = 0.0;
        for(x <- n)
        {
            sum += x.accBal;
        }
        println("Sum = " + sum)
    }

    def negBal(n: List[Account])={
        println("Accounts with negative balances:")
        for(x <- n){
            if(x.accBal < 0){
                println("Account #" + x.accNo)
            }
        }
    }

    def finalBal(n: List[Account])={
        println("Final account balances after the interest is calculated:")
        for(x <- n){
            if(x.accBal < 0){
                x.accBal += x.accBal*0.1
            }
            else{
                x.accBal += x.accBal*0.5
            }
            x.pri()
        }
    }
  
    def main(args: Array[String])={
        val a = new Account(1, 100);
        val b = new Account(2, 200);
        val c = new Account(3, 300);
        val d = new Account(4, -100);
        val e = new Account(5, -200);
        val f = new Account(6, -200);
        val Bank: List[Account] = List(a, b, c, d, e, f)
        sum(Bank)
        negBal(Bank)
        finalBal(Bank)
    }
}