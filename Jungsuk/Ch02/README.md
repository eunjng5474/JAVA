# 변수
- 하나의 값을 저장할 수 있는 기억공간

## 변수의 타입
### 기본형
- 논리형 : boolean - True, False
- 문자형 : char
- 정수형 : byte, short, int, long
- 실수형 : float, double
### 참조형
- String, System ...
- 객체의 주소를 저장(4 byte)

## 변수의 선언 방법
- 타입 변수명;
```java
int score;
score = 100;
int score = 100;
Strign str = new String("abc");
       str = null;
```

## 명명규칙
1. 대소문자가 구분되며 길이에 제한이 없다.
- True != true
2. 예약어를 사용해서는 안 된다.
- true는 예약어라 사용할 수 없지만, True는 가능
3. 숫자로 시작해서는 안 된다.
- top10은 가능하지만, 7up은 불가능
4. 특수문자는 '_'와 '$'만을 허용한다
- $harp는 가능, S#arp는 불가능
[권장 사항]
1. 클래스 이름의 첫 글자는 항상 대문자로
- 변수와 메서드 이름의 첫 글자는 항상 소문자로
2. 여러 단어 이름은 단어의 첫 글자를 대문자로
- lastIndexOf, StringBuffer
3. 상수의 이름은 대문자로 한다. 단어는 '_'로 구분
- PI, MAX_NUMBER

## 변수, 상수, 리터럴
- 변수(variable) : 하나의 값을 저장하기 위한 공간
- 상수(constant) : 한 번만 값을 저장할 수 있는 공간
- 리터럴(literal) : 그 자체로 값을 의미하는 것
```java
int score = 100;
    score = 200;
char ch = 'A';
String str = "abc";
final int MAX = 100;
          MAX = 200;  // error. 상수의 값은 변경 불가
```
- 변수: score, ch, str
- 상수 : MAX
- 리터럴: 100, 200, 'A', "abc", 100, 200

