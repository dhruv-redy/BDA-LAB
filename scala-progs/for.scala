// Program to search a number
object Main extends App {
    def search(num: Int, listGiven: List[Int]): Unit = {
        var length = listGiven.length - 1
        for(w <- 0 to length) {
            if(num == listGiven(w)) {
                println(s"Number found at pos" + " " + listGiven.zipWithIndex.filter(pair => pair._1 == 2).map(pair => pair._2))
            }
        }
    }

    search(2,List(1,2,3,4,2,5,2))
}
