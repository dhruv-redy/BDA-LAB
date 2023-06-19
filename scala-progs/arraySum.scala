object Main extends App {
    def arraySum(arr: Array[Int]): Unit = {
        var len: Int = arr.length - 1 
        var sum = 0
        for(w <- 0 to len) {
            sum = sum + arr(w)
        } 
        println(sum)
    }
    arraySum(Array(1,2,3,4))
}