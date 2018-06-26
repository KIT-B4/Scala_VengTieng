object function
{

  def main(args: Array[String]): Unit =
{
  var n=4 ;
  var m=5 ;
  var x=0 ;
  println("The square is: " + square(n))
  println("The sum of square is: " + SumofSquare(n,m))
  println("Please input your guess: ");
  x= scala.io.StdIn.readInt();
  guess(n,x);
}

// 1. Square(n)
  def square(n: Int):Integer =
   {
        var sum = n* n;
        return sum ;
    }
    def square1(m: Int): Integer =
    {
        var sum1 = m* m;
        return sum1 ;
    }

// 2.Sum of squares (n,m)
  def SumofSquare (n: Int, m: Int): Long =
  {
      var sums = square(n) + square1(m);
      return sums;
  }

// 3.Guess(n,x)
    def guess (n: Int, x: Int): Unit =
    {
        if((n*n)-x==1 || (n*n)-x==0 || (n*n)-x==(-1))
        {
             println("Good job...");
        }
        else 
        {
            println("You are off by: "+((n*n)-x));
        }
    }

}


