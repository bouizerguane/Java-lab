package TP7.Ex1;

public interface PaymentMethod {
    boolean pay(double amount);
    boolean refund(double amount);
    String getName();
}
