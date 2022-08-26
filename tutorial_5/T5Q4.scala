object evenOdd extends App{

    println("Enter a number: ")
    val a = scala.io.StdIn.readInt()

    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    if(isEven(a))
    {
        println("Even")
    }
    else
    {
        println("Odd")
    }
}
