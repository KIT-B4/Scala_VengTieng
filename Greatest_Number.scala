object Greatest 
{
    def main(args: Array[String]) 
    {
        var a: Int = 25 ;
        var b: Int = 55 ;
        var c: Int = 88 ;

      
        if  (a > b)
        {
            if ((a> c) && (b>c))
            {
                println(a + "," + b + "," + c);
            }
            else 
            { 
                println(c + "," + a + "," + b);
            }
        }
        else 
        {
            if ((b> c) && (c>a))
                println(b + "," + c + "," + a);
            else 
                println(c + "," + b + "," + a);
        }    
    }
}