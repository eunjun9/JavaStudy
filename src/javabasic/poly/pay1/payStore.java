package javabasic.poly.pay1;

public abstract class payStore {

    // 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("payco")) {
            return new Payco();
        } else {
            return new DefaultPay();
        }
    }
}
