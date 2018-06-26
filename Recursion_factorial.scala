object Factorial
{
    
    def main(args: Array[String]) 
    {
    // println("Enter number to input: ");
        var facto : Int = fac(5);
        println("The result of factorial is: " + fac(5));
    }  
    def fac( p:Int )    : Int =
    {
       
        if(  p == 0)
        {
            return 1;
        }
        else
        {
            return p*fac(p-1);
        }
    }     
}



//  def main(args: Array [String])      // Main function
//     {
//         println("Name is: " + addname("John"));
//         println("The id is: " + addid(55) );
//     }
//     def addid( id:Int)  : Int =
//     {
//         val id: Int = 55;
//         return id;
//     }
//     def addname(name:String)    : String =
//     {
//         val name: String = "John";
//         return name;
//     }