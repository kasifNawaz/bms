package BMS.Service;

import BMS.Model.Customer;
import BMS.Model.PaymentStatus;

public class PaymentService {

	private BMS.Model.Payment payment;

	public PaymentService(BMS.Model.Payment payment) {
		this.payment = payment;
	}

	public PaymentStatus MakePayment(double amount, Customer customer) {
		
		// TODO rest call to payment gateway.
		
		PaymentStatus ps = PaymentStatus.COMPLETED;
		return ps;

	}
}
