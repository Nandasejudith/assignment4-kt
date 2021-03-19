import java.awt.datatransfer.StringSelection
import java.util.*

fun main(){
food() //calling the function food to print out the array of food

    capitalCities()//capitalizing each first letter of the names of cities

    tryMath()

    tryMath()

//declariring names bellow in the main fun
    println( Arrays .toString(createArray("Judith","Mercy","Linda") ) )
}

fun food(){
    var varietyArray = arrayOf ("posho","irish","rice","bananas")
    println (Arrays.toString(varietyArray)) //expecting an output of arrays of all the names
}

fun capitalCities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { town->  //form a new name.
        println(town .capitalize())  //expecting all the first letters in carpital
    }

}


fun tryMath(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (numbers.get(1) + numbers.get(4))      //Using an inbuilt function to get the needed numbers
    println(sum)

    println (numbers.indexOf(158))

    println ( Arrays .toString(numbers .sortedArray() ))  //expecting output from smallest to biggest in array
}

//passed parameters
fun createArray (name1:String, name2:String, name3:String): Array <String> {
    return arrayOf (name1,name2,name3) //called it in the main fun with names
}
