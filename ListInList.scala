object list
{
    def main(args: Array[String]): Unit = {
        var LineList = List (1,2,3,4,5)
        var PageList = List (LineList,12,42)
        var BookList = List (PageList,"animalbook")
        var CategoryList = List(BookList,"Science")
        var LibraryList = List(CategoryList,"Fiction");
       
        println(LibraryList);
        println(LineList(1));
    }
}