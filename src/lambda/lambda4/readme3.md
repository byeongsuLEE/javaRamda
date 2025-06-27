# 섹션 3~4강의

#### 람다 + 제네릭
1. 제네릭을 쓰면 타입변환 생략가능
2. 타입을 추상화하여 다양한 기능 추가 가능


# 람다와 타켓 타입
- 람다는 값을 초기화 할떄 타입이 결정되고 타입이 결정됨
- 서로 다른 인터페이스 대입
FunctionA = FunctionB 이런거 안된다.


#### 문제 해결방법
java.util.function에서 기본 인터페이스를 제공해준다.
같은 function interface라서 대입이 가능하다.

# 기본 함수형 인터페이스
- function 입력 o 리턴 o
- consumer 입력 o 리턴 x
- supplier 입력 x 리턴 o
- runnable 입력 x 리턴 x

# 특화 함수형 인터페이스
- Predicate :조건을 판단하는 함수
  - 입력 o 반환 boolean
  - 입력값을 받아 조건 판단
  - function < T , boolean> 으로 대체할 수 있지만 의도를 명시하기 위해 사용
- Operator()   입력 o  반환 o
  - 동일한 타입의 연산 수행, 입력과 같은 타입을 반환하는 연산 용도
  - 수학에만 쓰이는 것이 아님! 동일한 타입 입력과 반환 동일하게 하기 위해서 씀!
  - UnaryOperator<T> : 같은 타입 , 같은 반환 = 단항연산 (피연산자 한개)
  - BinaryOperator<T> : 같은 입력 타입 2개 , 같은 타입 반환 = 이항 연산(두개의 피연산자)
  - BiFunction<T,T,T> : 앞의 두개는 입력, 뒤에는 반환타입 
  - 의도의 명시성, 가독성과 유지보수성을 위해 위의 2가지를 만듬


# 기타 함수형 인터페이스
매개변수가 2개 이상이면 앞에 BI를 붙이자
BiFunction<T,T>
BiConsumer<T,T>
BiPredicate <T,T>

매개변수가 3개면 직접 만드십시오

# 기본형 지원 함수형 인터페이스

사용이유
wrapper쓰면 오토박싱/언박싱으로 인한 성능 비용 줄이기 위함
- intFunction 매개변수가 기본형 int다
- ToIntFunction은 변환 타입이 기본형 int다
- IntToLongFunction은 매개변수가 int , 반환 타입이 long이다.
- intointFunction은 없다 intOperator 를 사용
기타
- intOperator 입력 int, 반환 int
- intConsumer 입력 int
- IntSupplier 반환값 int
- IntPredicate 입력 int 반환 boolean

