# 2026년 7월 14일 - DAY 12 리스트(배열) (일일 도전 과제)

## 구간 이어 붙이기
두 구간에 해당하는 배열을 앞뒤로 붙여 새 배열 만들기

### 풀이
이중 for문으로 intervals[0], intervals[1] 순서로 arr 원소를 list에 추가

## 쿼리로 배열 자르기
짝수 인덱스 쿼리는 뒷부분 제거, 홀수 인덱스 쿼리는 앞부분 제거

### 풀이
- 처음에 remove로 시도했지만 list 길이가 줄어들어 인덱스 계산 불가
- `subList`로 필요한 부분만 잘라 list를 새로 갱신하는 방식으로 해결!

### 배운 것
- `list.subList(s, e)` - s부터 e-1까지 부분 리스트 반환
- `new ArrayList<>(list.subList(...))` - subList 결과를 새 ArrayList로 복사
- remove로 원소를 지우면 인덱스가 밀리므로 subList로 통째로 교체하는 게 안전!