fun main(){
    var ten = 10
    println("ten = $ten")
    val n1 = Person("Boss",9)
    println(n1.name)
    println(sum(1,5))
    var x = 1
    var y = 2
//    if(x > y){
//        println(x)
//    }else if (x < y){
//        println("This is $y")
//    }else{
//        println("End")
//    }
    when(y){
        1 -> println("one")
        2 -> println("two")
    }

    val items = listOf("apple","banana","Kiwi")
//    for(item in items){
//        println(item)
//    }

    for(index in items.indices){
        println("index: $index is ${items[index]}")
    }

    val notNullText: String = "Definitely not null"
    val nullableText1: String? = "Might be null"
    val nullableText2: String? = null

    funny(nullableText2)
    println(nullableText2)

    val a: String? = "Kotlin"
    val b: String? = null
    println(a?.length)
    println(b?.length)


    fizzBuzz(5)
    fizzBuzz(3)
    fizzBuzz(15)







}

//fun sum(x:Int, y:Int) :Int{
//    return x+y
//}

fun funny(text: String?){
    if (text != null){
        println(text)
    }else{
        println("Nothing to print :(")
    }
}
fun fizzBuzz(num: Int){
    if(num % 3 == 0 && num % 5 == 0){
        println("Fizz Buzz")
    }else if(num % 5 == 0){
        println("Buzz")
    }else{
        println("Fizz")
    }
}

fun randomNumber(){

}

fun sum(a:Int, b:Int) = a+b

data class Person(var name:String, var Id:Int){

}