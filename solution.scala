object Solution {

    def f(x:Int): Int = List.range(2,x+1).foldLeft(1)(_*_)
    def e(x:Double):Double = List.range(0,10).foldLeft(0.0)((a:Double,i)=> a + math.pow(x,i)/f(i))
    def main(args: Array[String]) {
        for (x <- io.Source.stdin.getLines().to[List].tail.map(_.toDouble) )
         println(e(x))
    }
}
