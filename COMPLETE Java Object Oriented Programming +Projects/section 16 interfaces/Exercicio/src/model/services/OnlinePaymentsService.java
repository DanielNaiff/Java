package model.services;

public interface OnlinePaymentsService {
    double paymentFee(Double amount);
    double interest(Double amount, Integer months);
}
