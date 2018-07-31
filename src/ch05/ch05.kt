package ch05

fun salute() = println("Salute!") // 최상위함수

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    println(people.maxBy { it.age }) // maxBy kotlin에서 제공하는 collection
    //it는 자동 생성된 파라미터 이름

//    println(people.maxBy(Person::age))  //멤버 참조
//    println(people.maxBy { person: Person-> person.age })
//    println(people.maxBy { person: Person-> person.age})
    //컴파일러가 타입추론 Person 생략가능
    println(people.maxBy { person-> person.age})

    val getAge = {person : Person -> person.age} //람다를 변수에 저장할 때는 타입을 넣어줘야함

    //val names = people.joinToString(separator = " ", transform = {person: Person -> person.name })
    val names = people.joinToString(" ") {person: Person -> person.name }
    println(names)

    val error = listOf("403 Forbidden", "404 Not Found", "500 Internal Server Error")

    printMessagesWithPrefix(error, "Error")
    printProblemCounts(error)

    run(::salute) //최상위 함수도 멤버 참조로 참조가능

    val action = {person: Person, message: String -> sendMail(person, message)}

    val createPerson = ::Person
    val p = createPerson("Lee", 2)
    println(p)
    val predicate = Person::isAdult // 확장함수도 멤버 함수와 같이 참조가능
}

fun sendMail(person: Person, message: String) : String {
    return "To. ${person.name} contents : $message"
}

fun printMessagesWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(message: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    //함수안의 변수는 함수가 끝나면 반환

    message.forEach {
        if(it.startsWith("4")) {
            clientErrors++
        } else if(it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}