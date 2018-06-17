package ch01.ex1_ATasteOfKotlin

data class Person(val name: String,
                  val age: Int? = null) //type뒤에 ?를 붙으면 nullable

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
                         Person("Bob", 29))

    val oldest = persons.maxBy { it.age ?: 0 } //it는 키워드 person -> person.age를 요약
                                                //?:엘비스 키워드 null이면 0으로 set
    println("The oldest is: $oldest")

    fun findAlice() = persons.find {it.name == "Alice"}

    println("${findAlice()}")
}

// The oldest is: Person(name=Bob, age=29)
