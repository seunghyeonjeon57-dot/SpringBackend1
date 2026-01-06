package org.example.Head03_OOP.example09;

public class PaymentServiceTest {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("E001");
        PaymentService paymentService = new PaymentService();
        userAccount.deposit(1000);
        System.out.println("초기 입금 완료. 잔액: " + userAccount.getBalance());

        try{
            userAccount.deposit(-1000);
        }catch (IllegalArgumentException e){
            System.out.println("잘못된 금액 입금: " + e.getMessage());
        }
        try{
            paymentService.processPayment(userAccount,-3000);
        }catch (IllegalStateException e){
            System.out.println("잘못된 금액 출금: " + e.getMessage());
        }

        try{
            paymentService.processPayment(userAccount,3000);
        }catch (IllegalStateException e){
            System.out.println("잔액부족:" + e.getMessage());
        }

        paymentService.processPayment(userAccount,5000);
        paymentService.processPayment(userAccount,3000);

    }
}
