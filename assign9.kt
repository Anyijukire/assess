fun evenIndices(names: List<String>): List<String>{
   var  namesList= mutableListOf<String>()

    names.forEach { name-> if (names.indexOf(name) % 2== 0) {
        namesList.add(name)
    } }
   
    return namesList
}
fun peopleHeights(heights: List<Double>):String{
    var average=heights.average()
    var total = heights.sum()
    return "$average is the average height and $total is the total height "
}
data class Person(var name: String, var age: Int, var height: Double, var weight:Double)
data class Car(var registration: String, var mileage: Int)
fun carObject(carList:List<Car>): Double{
    var carSum=0.0
    var filCars= carList.forEach { car -> carSum+=car.mileage }
    return carSum/carList.count()
}
fun main() {
    println(evenIndices(mutableListOf("Esther","Janet","Florence","James","Sandra","Bless","Frank","")))
    println(peopleHeights(mutableListOf(1.6,1.7,0.6,1.4,2.7,0.3)))
    var peopleList= mutableListOf<Person>(Person("Janet", 20, 1.5, 60.5),
    Person("Esther",18,0.9,55.4),
    Person("Flora",22,1.4, 70.7),
    Person("Bless", 12,0.7,30.4))
    var sortedpeople= peopleList.sortedByDescending { person -> person.age }
    println(sortedpeople)
    var anotherList= mutableListOf<Person>(Person("James",24, 1.7,56.8),
    Person("Peruth",17,1.4,67.9))
    peopleList.addAll(anotherList)

   println( carObject(mutableListOf<Car>(Car("UX34Z",5),
    Car("t#4V5",8),
    Car("RT45Z",9),
    Car("KT67V",6))))

}
