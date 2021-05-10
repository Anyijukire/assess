fun main(){
    println(names(namesArray = arrayOf("Janet","Esther","tom","James","Caroline")))
}
fun names(namesArray: Array<String>): Int{
    var count=0
    for (t in namesArray){
        if (t.length>5){
            count++
        }

    }
    return count
}