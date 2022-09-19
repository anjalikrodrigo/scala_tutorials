import scala.math._

case class Point(a:Double, b:Double){
    var x = a;
    var y = b;
    
    def move(dx:Double, dy:Double)={
        x += dx;
        y += dy;
    }

    def invert()={
        var z = x;
        x = y;
        y = z;
    }

    def pri()={
        println("(" + x + ", " + y + ")")
    }
}

def add(a:Point, b:Point):Point={
    var c = new Point(a.x + b.x, a.y + b.y);
    return c;
}

def distance(a:Point, b:Point):Double={
    var c = ((a.x - b.x)*(a.x - b.x)) + ((a.y - b.y)*(a.y - b.y))
    return sqrt(c);
}

def main(args: Array[String])={
        var g = new Point(1, 2)
        var f = new Point(2, 3)
        g.pri()
        f.pri()
        var i = add(g, f)
        i.pri()
        g.move(1, 2)
        g.pri()
        var j = distance(g,f)   //currently g=(2,4), f=(2,3)
        println(j)
        g.invert()
        g.pri()
    }