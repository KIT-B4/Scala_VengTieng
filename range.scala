object arrays 
{
    def main(args: Array[String]): Unit = {
        var myNumArray = Range(0,10,2)  //Range ( start, stop, plus)
        var myStrArray = Range('A','K')

        for(i <- myNumArray)
        {
            println(i);
        }
        for(j <- myStrArray)
        {
        println(j);
        }
    }
}