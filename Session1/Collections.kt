import java.util.stream.IntStream.range

// Reference : https://kotlinlang.org/docs/reference/collections-overview.html

fun main(){
    // List
    val languages : List<String> = listOf("C++",
        "Kotlin",
        "C#",
        "Javascript",
        "Java")

    // For loop
    println("Languages : ")
    for (i in range(0, languages.size)){
        println(languages[i])
    }

    for (i in languages.size-1 downTo 1){
        print(i)
    }

    // Mutable list
    println("\nPlatforms : ")
    val list = mutableListOf("Android", "iOS")

    /**List Operations **/
    val firstItem = list[0]
    val secondItem = list[1]
    list.add(2, "Windows")
    /** TODO : ADD all possible methods (last, middle)**/

    // Printing new list
    for(os in list){
        println(os)
    }

    // ForEach with indexed values
    println("\nPrinting all elements using forEachIndexed : ")
    languages.forEachIndexed{ index, it->
        println("Index = $index Value = $it")
    }
}
