object Creating_class 
{
    def main(args: Array [String]) : Unit =     // Main function
    {
        println("Name is: " + addname("John"));
        println("The id is: " + addid(55) );
    }
    def addid( id:Int)  : Int =
    {
        val id: Int = 55;
        return id;
    }
    def addname(name:String)    : String =
    {
        val name: String = "John";
        return name;
    }
}


// class Point(val xc: Int, val yc: Int) {
//    var x: Int = xc
//    var y: Int = yc
//    def move(dx: Int, dy: Int) {
//       x = x + dx
//       y = y + dy
//       println ("Point x location : " + x);
//       println ("Point y location : " + y);
//    }
// }

// object Demo {
//    def main(args: Array[String]) {
//       val pt = new Point(10, 20);

//       // Move to a new location
//       pt.move(10, 10);
//    }
// }


// object Demo 
// {
//    def main(args: Array[String]) 
//    {
//       println( "Returned Value : " + addInt(5,7) );
//    }
   
//    def addInt( a:Int, b:Int ) : Int = 
//    {
//       var sum:Int = 0
//       sum = a + b

//       return sum
//    }
// }



//    def main(args: Array[String]) {
//       println( greeting )
//    }