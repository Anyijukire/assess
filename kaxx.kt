fun main() {
    println(isEven(33))
    println(isEven(12))
    println(string("Janet"))
    var product1=Product("banana", 56.7.toFloat(),507800, "gloceries")
    var product2=Product("soap",2.0.toFloat(),4000,"hygien")
    var product3=Product("maize",56.3.toFloat(),5860,"gloceries")
    var product4=Product("vim",3.6.toFloat(),4658,"hygien")
    println(string("florence"))
    println(string("mother mary"))
    var x=peopleNames(arrayOf("Janet","Peruth","Ruth","Frank"))
    println(x)
    println(product1.glocerieslist)
}

fun isEven(num: Int): Boolean {
    if (num % 2 == 0) {
        return true
    } else {
        return false
    }
}

data class Product(var name: String, var weight: Float, var price: Int, var category: String) {
    var glocerieslist = mutableListOf<String>()
    var hygienlist = mutableListOf<String>()
    fun productAssign(product: String) {
        when (product) {
            "gloceries" -> glocerieslist.add(category)
            "hygien" -> hygienlist.add(category)
        }
    }
}
fun string(text:String): String{
    var text=""
    for (i in text)
        if (text.indexOf(i) % 2 == 0){
         text+=i
        }

   return text
}
fun peopleNames(name:Array<String>): MutableList<String>{
    var namesList= mutableListOf<String>()
    for (nam in name){
     if (nam.length%2==0){
         namesList.add(nam)
     }
    }
    return namesList
}
