/*
    1. ���
       1) �⺻��� : �Ϲ� (3800), �ɾ� (5000)
       2) �Ѽ��� : ������ ���
       3) ��� : �Ϲ� 100��/km, �ɾ� : �Ϲ� 150��/km

    2. ��� ���
    3. �ɾ� �ð� : 0 ~ 6��
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
        // super(); // ������� �ʾƵ� �ڵ������� �߰��Ǿ� �����. (��� ���迡����)
        reset();
    }

    public Taxi(String carName, String color, String maker) {
        super(carName, color, maker);
        reset();
    }

    /* Methods */
    // ��� ����
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

    // ������ ���� ��
    int calcPrice(int km) {
        currentPrice += (pricePerKm * km);
        return currentPrice;
    }

    // ���� ��
    void sumPrice() {
        totalPrice += currentPrice;
        currentPrice = 0;
        basicPrice = 0;
    }

    // �ӵ� ���� : 150
    @Override
    public int speedUp(int speed) {
        this.speed = super.speedUp(speed);

        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }

        return this.speed;
    }

    // ������ ���� �����ֱ�
    int showTotalPrice() {
        return totalPrice;
    }

    // ó�� ���� ����
    void reset() {
        initPrice();
        currentPrice = 0;
        totalPrice = 0;
        maxSpeed = 150;
    }

    @Override
    public String toString() {
        return super.toString() + "�ý�";
    }
}
