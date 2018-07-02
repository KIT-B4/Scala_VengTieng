object append
{
    def main(args: Array[String]): Unit = {
        var list = ("Hello",5,10.2f,"Hey",12.3f,8)

        // list = list :+ 4;    //add at the back of the list
        // list = 4  :: list;     // add at the front of the list

    var integer: Int = 0;
    var str = "";
    var float: Float= 0.0f;
     

    list.productIterator.foreach        //productIterator = to scan 1 by 1
    {
        case i:Int => integer = integer + i;            
        case s:String => str = str + s;   
        case f:Float => float = float + f;            
    };
    var sum = integer + float;
    println("Sum of int and float in tuple is: "+ sum);
    println(list);
    
    }
}


