
fun main() {
    println(isEven(55))
    println(isEven(66))
    println( myFunction("carrot"))
    println(myFunction("maize"))
    println(myFunction("banana"))
    var category1=Product("apples ",5,600,"gloceries")
    println(category1)
    var category2=Product("drugs",2,400,"hygien")
    println(category2)
    var category3=Product("knife",1,200,"other")
    println(category3)
    println(friendNames(arrayOf("Florence","Bless","Janet","Esther","Peruth")))
}

fun isEven(x: Int): Boolean {
    if (x % 2 == 0) {
        return true
    }
    return false
    //return x%2==0
}
data class Product( var name:String, var weight:Int,var price:Int,var category:String) {
    fun product(name:Product) {
        var gloceryList = mutableListOf<Product>()
        var hygieneList = mutableListOf<Product>()
        var otherList = mutableListOf<Product>()
        when ("category") {
            "gloceries"  -> println( gloceryList.add(name))
            "hygiene" -> println(hygieneList.add(name))
            else-> println(otherList.add(name))
        }
       // println("${name}:${category}")
        println(gloceryList)
        println(hygieneList)
        println(otherList)
    }
}

fun myFunction(x: String):String{
    var xList=""
    for(character in x){
        if(x.indexOf(character)%2==0){
            xList+=character

        }
    }
    return xList
}

fun friendNames(names:Array<String>):MutableList<String>{
    var myNamesList= mutableListOf<String>()
    for (name in names){
        if (name.length%2==0) {
            myNamesList.add(name)
        }
    }
    return myNamesList
}
