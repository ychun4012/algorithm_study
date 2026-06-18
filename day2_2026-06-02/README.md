# 2026년 6월 2일 - DAY 1 출력 (일일 도전 과제)

## 문자열 출력
a를 출력했다.

## 정수 출력
a와 b를 예시에 맞게 출력했다.

## 문자열 반복 출력
for문을 통해 n번 반복하는 코드를 만들었다. 일렬로 출력하기 위해 print 함수를 사용.

## 대소문자 변환
- `a.charAt(i)` - String에서 i index의 글자를 char로 전환
- `Character.isLowerCase`, `Character.toUpperCase` 등을 검색을 통해 발견
- 자주 쓰는 wrapper Class의 method들을 배워야겠다고 생각

## 특수문자 출력
`\`을 추가해 역슬래시와 큰따옴표를 출력하였다.

# 2026년 6월 2일 - DAY 2 출력, 연산 (일일 도전 과제)

## 덧셈식 출력
주어진 레이아웃에 맞게 출력코드 작성

## 문자열 이어붙이기
공백없이 이어서 출력되도록 print 함수 이용

## 문자열 시계방향 90도 출력
`a.charAt(i)`으로 a를 하나씩 가져와 수직으로 프린트

## 짝수 홀수 출력
if로 n 나누기 2의 나머지가 0이면 짝수 출력, 아니면 홀수 출력

## 문자열 뒤덮기
for문으로 s까지의 my_string을 넣고 그 뒤로 overwrite_string을 넣고
my_string이 더 남아있다면 for문으로 그 뒤에 남은 my_string을 넣음

### 배운 것
- `substring(n, m)` - n부터 m까지 자르기
- `substring(n)` - n부터 끝까지 자르기
- `toCharArray()` - String을 char 배열로 변환

### 시도한 것들 (실패)
- `answer = my_string[0:s] + overwrite_string` → 실패