object List
{
    def main(args: Array[String]) 
    {

var Animal = List[String]("Tiger","Lion","Wolf","Elephant","Ant");
// var t = "Shark" :: Animal;      //

var x = Animal.slice(1,3);
var (l,r) = Animal.splitAt(2);
var y = Animal.tail;
// var t = "Shark" :: Animal;
// Animal+="Dog";
var re = Animal.reverse;


    println(Animal);
    // println(t);
    println(l);
    println(r);
    println(x);
    println(y);
    println(re);    //reverse 

    

    }
}