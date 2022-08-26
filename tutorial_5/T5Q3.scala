object sumAll extends App{

    printf("Enter a positive number: ")
    val a = scala.io.StdIn.readInt()

    def sum(n:Int):Int= n match{
        case 1 => 1
        case _ => n + sum(n-1)
    }

    printf("Sum of integers up to %d = ", a);
    println(sum(a))
}
