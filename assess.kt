fun main() {


}
fun introduction(name:String, age:Int){
 println("My name is $name and I am $age years old.")
}
fun machine(age:Int){
    if (age<6){
        println("Serve a glass of milk")
    }
    else if(age>6 && age<15){
        println("serve a bottle of fanta")
    }
    else{
        println("serve cocacola")
    }
}
fun name():Int{
    var names=arrayOf("Janet", "Esther","Tom", "Sandra")
    for (nam in names){
        if (nam.length<5){
          println(names.size)
        }
    }
    return names.size
}
fun calc(a:Int, b:Int):Int{
    var multiply= a*b
    var divide= a/b
    var modulus=a%b
    return multiply
    return divide
    return modulus
}
class Human(var name: String, var age: Int, var weight: Float){

    fun eat(foodWeight: Int){
        println( "I am eating $foodWeight kgs of food" )
        weight+=foodWeight
    }
    fun speak(speech: String){
        println("$speech")
    }
    fun birthday( ){
        age++
    }
}
fun comparison(){
    
}