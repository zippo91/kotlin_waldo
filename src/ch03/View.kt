package ch03

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
} //button 클래스가 오버라이드

//확장 함수는 클래스의 일부가 아니어서 클래스 밖에 선언. 오버라이드 되지 않는다.

