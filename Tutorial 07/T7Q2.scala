object q2 {

  class Rational(x: Int, y: Int) {
    var p = x;
    var q = y

    def pri() = {
      println(p + "/" + q)
    }
  }
  
  def add(n:Rational, m:Rational)={

    val p = n.p*m.q-m.p*n.q;
    val q = n.p*m.q;

    val ans = new Rational(p,q);
    ans.pri();
  }
  
  def main(args: Array[String])={
    val s = new Rational(1, 2);
    val t = new Rational(1, 2);
    add(s,t);
  }
}