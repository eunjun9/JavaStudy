package javabasic.poly.pay1;

public class PayService {

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        
        // 결제수단을 선택하는 부분
        Pay pay = payStore.findPay(option);
        // 결제를 실행하는 부분
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}
