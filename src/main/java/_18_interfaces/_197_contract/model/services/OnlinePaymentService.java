package _18_interfaces._197_contract.model.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interest(double amount, int months);
}
