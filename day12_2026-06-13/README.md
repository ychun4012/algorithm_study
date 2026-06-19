# 2026년 6월 13일 - DAY 8 조건문, 문자열 (일일 도전 과제)

## 논리 연산
∨는 OR, ∧는 AND 연산자임을 파악하고 삼항연산자로 간단하게 작성

### 배운 것
- `(x1 || x2) && (x3 || x4)` 자체가 이미 boolean이라 삼항연산자 없이도 바로 return 가능

## 인덱스로 문자열 만들기
String을 char 배열로 만들어 index_list의 값을 인덱스로 사용해 문자를 추출

### 배운 것
- String 더하기 대신 `StringBuilder` 사용하기!
```java
  sb.append(my_string.charAt(idx));
```
- `charAt(idx)` 로 char 배열 변환 없이 바로 접근 가능

## 9로 나눈 나머지
각 자리 숫자의 합을 9로 나눈 나머지를 이용

### 배운 것
- `Character.getNumericValue(ch)` - char를 숫자로 변환
- 더 간단한 방법: **아스키 코드 활용!**
```java
  sum += ch - '0';  // '1'(49) - '0'(48) = 1
```
  - '0'의 아스키 코드: 48
  - '1'의 아스키 코드: 49
  - char에서 '0'을 빼면 바로 숫자로 변환됨!