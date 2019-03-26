/*
    1. 요금
       1) 기본요금 : 일반 (3800), 심야 (5000)
       2) 총수입 : 누적된 요금
       3) 요금 : 일반 100원/km, 심야 : 일반 150원/km

    2. 요금 계산
    3. 심야 시간 : 0 ~ 6시
*/

import java.util.*;

public class Taxi extends Car {

    /* Global variables */
    int basicPrice;
    int totalPrice;
    int currentPrice;
    int pricePerKm;

    int maxSpeed;

    /* Constructors */
    public Taxi() {
        // super(); // 명시하지 않아도 자동적으로 추가되어 실행됨. (상속 관계에서만)
        reset();
    }

    public Taxi(String carName, String color, String maker) {
        super(carName, color, maker);
        reset();
    }

    /* Methods */
    // 출발 직전
    void initPrice() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour < 6) {
            basicPrice = 5000;
            pricePerKm = 150;
        } else {
            basicPrice = 3800;
            pricePerKm = 100;
        }

        currentPrice = basicPrice;
    }

    // 목적지 도착 시
    int calcPrice(int km) {
        currentPrice += (pricePerKm * km);
        return currentPrice;
    }

    // 하차 시
    void sumPrice() {
        totalPrice += currentPrice;
        currentPrice = 0;
        basicPrice = 0;
    }

    // 속도 제한 : 150
    @Override
    public int speedUp(int speed) {
        this.speed = super.speedUp(speed);

        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }

        return this.speed;
    }

    // 누적된 수익 보여주기
    int showTotalPrice() {
        return totalPrice;
    }

    // 처음 운행 개시
    void reset() {
        initPrice();
        currentPrice = 0;
        totalPrice = 0;
        maxSpeed = 150;
    }

    @Override
    public String toString() {
        return super.toString() + "택시";
    }
}
