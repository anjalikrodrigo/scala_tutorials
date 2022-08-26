object printPrime extends App{

    printf("Enter a positive number: ")
    val a = scala.io.StdIn.readInt()

    def GCD(a:Int,b:Int):Int=b match{
        case 0 => a
        case x if x>a => GCD(x,a)
        case x if x<a => GCD(x,a%x)
        case x if x==a => GCD(x,a%x)
    }

    def prime(p:Int,n:Int=2):Boolean= n match {
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    def fun(n:Int,i:Int):Unit={
        if(n==i) {
            return
        }

        if(prime(i,2)){
            println(i)
        }

        fun(n,i+1)
    }

    println(fun(a,2))
}