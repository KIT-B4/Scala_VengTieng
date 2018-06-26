object num
{

    def main(args: Array[String])
    {
        var i =0 ;
        var list1 = List [Int](25,44,13)
        var list2 = List [Int](44,123,5,18)

        println("list1: " +list1);
        println("list2: " +list2);

        /*concatinate list1 & list2 */
        var con = list1 ++ list2;
        println("Concatinate list1 & list2: " + con);
        
        /*reverse the concatination */
        var re = con.reverse;
        // var con1 = list1.concat(list2);
        println("Reverse the concatinate: "+ re);

        // to print the odd values of concatination
        println("Odd number of the reverse: ")
        for ( i <- 0 until con.length)
    {
        if( (con(i)) %2 !=0)
        {
        println(con(i));
        }
    }

        //Make a list of lists
    var list3 = List(23,14,22,11);
    var AllList = List(list1,list2,list3);
    println("The overall list is: " + AllList);


        //convert list1 to string
        println("Converting list1 to string: ");
        println("\nlist1: "+ list1);
        var str = list1.toString;
        println("list1 in string: "+ str);

        //print all the elements of list3 except the last one
        println("list3: "+ list3);
        var ex = list3.init;
        println("All elements in list3 except last one: " + ex);

        
    
    }

        
}