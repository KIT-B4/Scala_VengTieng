object Demo 
{
   def main(args: Array[String]) 
   {
      var a = 0;
      
      // for loop execution with a range
      
      for( a <- 1 to 100)
      {
          if (a% 15 == 0)
            println("FooBar");
          else if(a %3 == 0)
        println( "Foo" );
            else if (a%5 == 0)
            println("Bar");
        
            else 
            println( a );

      }
   }
}