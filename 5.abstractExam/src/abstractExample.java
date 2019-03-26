public class abstractExample {

    // 추상클래스 (Abstract class)

    // 1. 정의 : 추상메소드를 하나 이상 가진 클래스
    //           abstract 키워드 사용

    // 2. 형식 : 접근제어자 abstract class ClassName {

    //                변수(field)
    //                접근 제어자 DataType varName;

    //                생성자
    //                접근제어자 ClassName([args]) {

    //                }

    //                메소드(method)
    //                접근제어자 ReturnType methodNAme([args]) { // 구현 메소드
    //                      ...
    //                }

    //                접근제어자 abstract ReturnType methodName([args]);  // 추상 메소드  (어떻게 구현될 지는 자세히 모름)
    //           }

    // 3 ~ 5번은 묶어서 정리

    // 3. 추상 클래스는 하위 클래스를 제어하기 위해 사용.

    //                  예금 - 입금() {+m}, 출금() {-m}, 이자() {0}         // 이자는 예금 종류마다 계산방법이 다름

    //          일반예금            정기예금            펀드예금
    //           이자() {            리자() {            benefit() {
    //              0.5                 0.7                 0.8
    //           }                   }                   }

    // -> 에러는 나지 않지만 정상적으로 구현은 되지 않았음

    //         abstract 예금 - 입금() {+m}, 출금() {-m}, abstract 이자();

    //          일반예금            정기예금            펀드예금
    //           이자() {            리자() {            benefit() {
    //              0.5                 0.7                 0.8
    //           }                   }                   }

    // -> 정기예금, 펀드예금은 에러가 발생 (override가 되지 않았으므로)


    // 4. 추상 클래스는 자신의 생성자를 이용하여 객체 생성 불가능.  (추상 클래스에서 미구현된 부분이 있기 때문에)
    //    -> 추상 클래스를 하위 클래스에 상속 시킨 후 "반드시" 추상메소드를 override 후 사용
    //    -> 하위 클래스를 참조하여 상위(추상) 클래스의 객체를 생성. (다형성)

    // 5. 객체 생성 방법 (일반 Class에서도 적용)
    //    a. 하위 클래스 참조
    //    b. 자신의 객체를 return하는 static method 이용  ( ex) Clock.fixed() )
    //    c. 외부 클래스를 참조  ( ex) Runtime, Process 클래스 )
    //    d. 자신의 생성자를 이용


    public static void main(String[] args) {

    }
}