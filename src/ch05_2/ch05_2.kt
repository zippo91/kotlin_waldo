package ch05_2

import ch05.Book
import ch05.Person

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Kim", 28), Person("Lee", 29))
    val books = listOf(Book("Alice", listOf("Lee", "Kim", "Park")), Book("Bob", listOf("Lee", "Wal", "Song")))

    println(people.filter { it.age >= 30 })//원하지 않는 원소 제거
    println(people.map { Person::name })

    val maxAge = people.maxBy(Person::age)!!.age //null이라면 exception

    val numbers = mapOf(0 to "zero", 1 to "one")

    println(numbers.mapValues { it.value.toUpperCase() })

    println(people.all { p: Person -> p.age <= 27 })
    println(people.filter { p: Person -> p.age <= 27 }.size)

    println(books.flatMap { it.authors }.toSet())
    println(books.flatMap { it.authors }.toList())

    println(people.asSequence().map { person: Person -> person.age }.filter { it >= 27 }.toList())

    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)"); it * it }
            .filter { print("filter($it"); it % 2 == 0 }

    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }.toList()
    println()

    println(listOf(1, 2, 3, 4).asSequence().map { it * it }.find { it > 3 })
}
