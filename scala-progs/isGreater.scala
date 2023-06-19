object Main extends App {
	def isGreater(num1: Int, num2: Int): Unit = {
		if (num1 > num2) {
			println(s"$num1 is greater that $num2")
		} 
		else if (num1 < num2) {
			println(s"$num2 is grater than $num1")
		}
		else println("Both are equal")
	}
	
	isGreater(10,12)
}

