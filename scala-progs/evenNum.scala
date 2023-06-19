// Finding out number of even numbers in a specific range
object Main extends App {
	def evenNum(num: Int): Unit = {
		for(w <- 1 to num) {
			if(w % 2 == 0) println(s"Even numbers are $w")
		}
	}
	evenNum(100)
}
