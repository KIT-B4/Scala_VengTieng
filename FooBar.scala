object Demo 
{
   def main(args: Array[String]) 
   {
      var r1 = Range(1,31);
      
      // for loop execution with a range
      
      for( a <- r1)
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