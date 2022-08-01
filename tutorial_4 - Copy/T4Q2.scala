object T4Q2
{
	def main(args: Array[Int])={
		val input:Int = args(0).toInt
		//for(arg<-args)
		//{
			//println("hi");
			input match{
			case x if x<0 => println("Input is negative");
			case x if x==0 => println("Input is zero");
			case x if x%2==0 => println("Input is even");
			case x if x%2!=0 => println("Input is odd");
			}
		//}
	}
}
