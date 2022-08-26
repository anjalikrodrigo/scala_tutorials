object evenSum extends App{

    println("Enter a number: ")
    val a = scala.io.StdIn.readInt()

    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    def sumEven(n:Int):Int = n match{
        case 0 => 0
        case -1 => 0
        case _ => sumEven(n-2) + n
    }


    if(isEven(a))
    {
        println(sumEven(a - 2))
    }
    else
    {
        println(sumEven(a - 1))
    }
}