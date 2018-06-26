object Fibonacci
{
    def main(args: Array[String]): 
    {
        val a: Int =0 ;
        val b: Int =1 ;
        var result : Int ;
        var fabon : Int = fa(6);
        println("The result is: " + fa(6));
    }
    def fa( a: Int)
    {
        if ( a == 0)
        {
            return 0;
        }
        else 
        {
            result = a+b ;
            return result;
        }
    }
}