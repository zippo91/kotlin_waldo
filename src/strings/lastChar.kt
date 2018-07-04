package strings

//확장 함수
fun String.lastChar(): Char = get(length - 1)
//fun String.lastChar(): Char = this.get(this.length -1)
//String은 수신 객체 타입 this는 수신 객체

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }
