object list
{
    def main(args: Array[String]): Unit = 
    {
        var list1 = List ("Alex","Aloha","Hola","Bob","John");
        
    // 1.print all elements in list that starts with letter 'A'
        for( i <- 0 to list1.length -1)
        {
            if(list1(i).charAt(0) == 'A')
            {
                println(list1(i));
            }
        }

    // 2.print "Yes" when element has 4 characters
        list1.foreach( x =>
        {
            if(x.length == 4)
            println("Yes");
            else 
            println("No"));
        }

    // 3.print "Yes" when element has more than 3 characters
        list1.foreach(x => 
        if(x.length>3)
         print("Yes ") 
         else print("No "));
    }
}