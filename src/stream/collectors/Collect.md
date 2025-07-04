# Collector


1. collect(Collector.toMap)
- toMap(key 람다, value 람다,  )
- 중복된 키를 넣을 때 에러가 발생한다.
- 이를 해결하기 위해서 toMap(key 람다, value 람다, 중복될 떄 처리할 람다)
