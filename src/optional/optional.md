# 옵션
- null 일 수 도 있다라는  명시성과 코드의 단순성을 위해 사용함
- 값이 없을 수 도 있다는 상황을 명시적으로 처리하도록 유도하고
- 사전에 null pointException 사전을 예 방하기 도입 되었다.
- 자바 8 이후 부터 사용할 수 있다.


# Optional.get()
- 예외 발생이 되기 떄문에 orElse, orElseGet(), orElseThrow를 사용하자


# Optional.orElse()
- null이면 () 안의 값이 만들어진다.
- orElse() 
  - 즉시 평가 () 매개변수의 연산이 즉시로 실행된다.

- orElseGet() : 매개변수로 람다를 넣을 수 있따.
  - 람다를 두기 떄문에 연산을 지연 할 수 있다.
  - 사용시기 : 매개변수의 연산의 비용이 클때 사용 , 람다를 이용하기 떄문에 연산을 나중에 하여 지연 평가를 진행할 수 있음
  
- orElseThrow () : 예외를 발생시킬 수 있음

# Optional 값 처리 메서드

##  ifPresent(Consumer< ? super T > action)
- 값이 존재하면 action 실행
- 값이 없음년 아무것도 안함

## ifPresentOrElse(Consumer action , Runnable emptyAction)
- 값이 존재하면 action 실행
- 없으면 emptyAction 실행

## map ( Fucntion mapper)
- 값이 있으면 mapper를 적용한 결과 (Optional<U>) 반환
- 값이 없으면 Optional.empty() 반환

