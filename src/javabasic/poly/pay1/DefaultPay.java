package javabasic.poly.pay1;

// null object pattern (null 대신에 객체 사용)
public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}

