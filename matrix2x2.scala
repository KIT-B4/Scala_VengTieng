object matrix
{
    var x=0;
    var y=0;

    def main(args: Array[String]) 
    {
        var m1=Array.ofDim[Int](2,2)
        var m2=Array.ofDim[Int](2,2)
        var sum=Array.ofDim[Int](2,2)
        var i=0;
        var j=0;

        println("Please enter element for first array: ");
        for (i <- 0 to 1)
        {
            for (j <- 0 to 1)
            {
                m1(i)(j)=scala.io.StdIn.readInt();
            }
        }

        println("Please enter element for second array: ");
        for (i <- 0 to 1)
        {
            for (j <- 0 to 1)
            {
                m2(i)(j)=scala.io.StdIn.readInt();
            }
        }

        //sum of m1 and m2
        for (i <- 0 to 1)
        {
            for (j <- 0 to 1)
            {
                sum(i)(j) = m1(i)(j) + m2(i)(j);
            }
        }

        println("The sum of matrix are: ")
        for (i <- 0 to 1)
        {
            for (j <- 0 to 1)
            {
                println(sum(i)(j) + "");
            }
            println("\n");
        }        
    }
}