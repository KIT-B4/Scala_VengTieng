object ScoreToWin
{
    def main(args: Array[String]): Unit = 
    {
        var s = Array(5,10)
        var j = Array(6,6)
        var x = Array(20,15)
        var y = Array(35,45)

        if (s(0)!= s(1))
        println("Round 1: 1" )
        if (j(0)!= j(1))
        println("Round 2: 1")
        if (x(0)!= x(1))
        println("Round 3: 1")
        if (y(0)!= y(1))
        println("Round 4: 1")
    }
}