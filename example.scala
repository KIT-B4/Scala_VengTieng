var sum: Int =0;
var str= ""
var t= ("hejngkd", 7586, 8689, 90309, "njfdjjkdfk")

t.productIterator.foreach{
    case i: Int => sum = sum +i;
    case s: String => str= str + s;
}
println(sum)