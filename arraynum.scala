object sumofarray
{
    def main(args: Array[String])
    {
        var arr1 = new Array[Int](6);
        var arr2 = new Array[Int](6);
        var i=0;
        var sum= 0;
        var max =0;
        
        println("Please enter element for first array: ");
        for(i <- 0 to 4)    //try arr.length() = array.length -1
        {
            arr1(i)=scala.io.StdIn.readInt();
        }
        
        println("All the elements in first array: ");
        for ( i <- 0 to 4)
        {
            println("array"+ (i) + "=" + arr1(i));
        }

        println("Please enter element for second array: ");
        for(i <- 0 to 4)    //try arr.length() = array.length -1
        {
            arr2(i)=scala.io.StdIn.readInt();
        }
        
        println("All the elements in second array: ");
        for ( i <- 0 to 4)
        {
            println("array"+ (i) + "=" + arr2(i));
        }
        
        var arr3 = Array.concat(arr1,arr2);
        for ( i <- 0 to arr3.length() )
        {
            println("The concatinate array is: " + arr(i));
        }

        //Sum of first array
        for ( i <- 0 to 4)
        {
          	sum = sum + arr1(i);
        }

        //maximum of first array
        for ( i <- 0 to 4)
        {
            if ( arr1(i)<= arr1(i+1))
            {
                max= arr1(i+1);
            }
        }

        println("Sum of first array is: " + sum);
        println("The maximum number of array is: " + max);


    }
}