object q1 {
  def main(args: Array[String]) = {
    val s = new Rational(3, 4)
    s.pri()
    s.neg()
  }
}

class Rational(x: Int, y: Int) {
  var p = x;
  var q = y

  def pri() = {
    println(p + "/" + q)
  }

  def neg() = {
    println("-" + p + "/" + q)
  }

}