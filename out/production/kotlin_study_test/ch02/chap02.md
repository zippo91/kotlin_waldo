# 코틀린 문법이나 특성
> - 함수를 선언할 때는 `fun` 키워드를 사용.
> - 파라미터 이름 뒤에 그 파라미터의 타입을 씀.
> - 함수를 최상위 수준에 정의할 수 있음. 꼭 자바처럼 Class 안에 넣을 필요가 없음.
> - System.out.println 대신 println을 사용. 코틀린 표준 라이브러리는 여러 표준 자바 라이브러리 함수를 간결하게 사용할 수 있게 감싼 wrapper를 제공
> - 줄 끝에 세미콜론을 안붙여도 됨.

# 코틀린 함수
<pre><code>
  fun max(a: Int, b: Int): Int {
     return if(a > b) a else b
   }
</code></pre>
> - 함수 선언은 fun 키워드로 시작.
> - 다음에는 함수 이름이 옴.
> - 이름 뒤에는 괄호 안에 파라미터 목록이 옴.
> - 함수의 반환 타입은 파라미터 후에 옴. 괄호와 반환타입 사이를 :로 구분

> - 코틀린에서 if는 식이다.

#문(statement)과 식(expression)의 구분
> - `statement`: 명령형 언어(imperative programming language)에서 어떤 동작을 수행하는 가장 기본이 되는 요소.
> - `expression`: 어떤 다른 값을 산출하는 값, 상수, 변수, 연산자, 함수의 조합.

> - `statement`는 값을 산출하지 않으며 부수효과(side effect)를 일으킨다. 콘솔에 메시지를 표시한다든지 파일에 값을 쓴다든지 하는 동작은 모두 부수효과라 할 수 있다. 
> - `expression`은 항상 값을 산출해 리턴하며 많은 경우 부수효과는 없다.

#변수
<pre><code>
 val question = "삶, 우주"
 val answer = 42
 val answer : Int = 42
</code></pre>

> - val - 변경 불가능한 참조를 저장하는 변수(value) - final 변수와 같음
> - var - 변경 가능한 참조를 저장하는 변수(variable)
> - 기본적으로 모든 변수를 val 키워드를 사용해 불변 변수로 선언 필요한 경우에만 var로 변경

> - val 참조 자체는 불변이라도 참조가 가리키는 객체의 내부 값은 변경 가능
<pre><code>
  val languages = arrayListOf("Java")
    languages.add("Kotlin")
</code></pre>
> - var 키워드는 변수의 값은 변경할 수 있지만 type은 변경 x
<pre><code>
  var answer = 42
  answer = "no answer" // 오류
</code></pre>

#클래스와 프로퍼티
<pre><code>
  class Person(
    val name: String,      // 읽기 전용 프로퍼티, (비공개) 필드와 필드를 읽는 단순한 (공개) getter를 만듦
    var isMarried: Boolean // 쓸 수 있는 프로퍼티, (비공개) 필드와 (공개) 게터, 세터를 만들어 냄.
  )
</code></pre>

#ENUM
<pre><code>
  enum class ColorType() {
      RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
  }
  
  enum class ColorType(val r: Int, val g: Int, val b: Int) {
      RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0),
      BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238); //여기는 반드시 세미콜론을 사
  
      fun rgb() = (r * 256 + g) * 256 + b
  
  }
</code></pre>

#스마트 캐스트
> 코틀린에서는 프로그래머 대신 컴파일러가 캐스팅. 어떤 변수가 원하는 타입인지 is로 검사하고 나면 캐스팅하지 않아도 처음부터 변수가 원하는 타입으로 선언된 것 처럼 사용할 수 있지만, 실제로는 컴파일러가 캐스팅을 수행.
> - IDE는 배경색으로 스마트 캐스트를 명시
> - val n = e as Num //as 키워드로 명시적으로 캐스팅
 