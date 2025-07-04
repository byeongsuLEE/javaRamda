# Collector


1. collect(Collector.toMap)
- toMap(key 람다, value 람다)
- 중복된 키를 넣을 때 에러가 발생한다.
- 이를 해결하기 위해서 toMap(key 람다, value 람다, 중복될 떄 처리할 람다)

2. 그룹과 분할
- collect(Collectors.groupingBy(람다 기준))
  - 람다 기준으로 그룹핑 하기
- collect(Collector.partitioningBy(람다 조건))
  - 람다 조건으로 true, false 분리

3. Collectors.reduce 
- 값을 줄이는 것
- string.join(",")
- Collectors.joining(",")
