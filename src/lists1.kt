fun main(){
    println(peopleNames(listOf("jamari","fajiri","Alpha","Angela","Beth","Daisi","Mercy","Benso","Lucy","Larry")))
println(averageHeight(listOf(1.4,1.2,1.6,1.8,1.9) as MutableList<Double>))
    attributes()
    viumbe()
    var car=listOf(
        Car("UVW247",120),
        Car("WVU956",660))

}
fun peopleNames(name:List<String>):List<String>{
    var names=mutableListOf<String>()
    for (x in name){
        if (name.indexOf(x) % 2==0) {
            names.add(x)
        }
        }
    return names
    }
fun averageHeight(heights:MutableList<Double>):Double{
    var aver=heights.average()
    var together=heights.sum()
    println(together)
    return aver
}
data class Persons(var name:String,var age:Int,var height:Double,var weight:Double)
fun attributes(){
    var persons = listOf(
        Persons("Daisy",24,1.65,62.5),
        Persons("Larry",22,1.6,45.2),
        Persons("lucy",20,1.3,45.0),
        Persons("jamari",2,1.0,11.9)
    )
    var sortedAge=persons.sortedByDescending{persons->persons.age}
    println(sortedAge)


}
data class Watu(var name:String,var age:Int,var height:Double,var weight:Double)
fun viumbe(){
    var watu = mutableListOf(
        Watu("Daisy",24,1.65,62.5),
        Watu("Larry",22,1.6,45.2),
        Watu("lucy",20,1.3,45.0),
        Watu("jamari",2,1.0,11.9),
    )
        watu.addAll(listOf(
        Watu ("Birungi",15,1.68,15.7),
        Watu ("Edwin",17,1.45,72.5) ,
        ))
            println(watu)
            }
data class Car(var registration:String,var mileage:Int)
fun car(mileage:List<Int>):Int{
    var distance=mileage.average().toInt()
    return distance
}







