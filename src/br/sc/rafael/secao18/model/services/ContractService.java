package br.sc.rafael.secao18.model.services;

import java.util.Calendar;
import java.util.Date;

import br.sc.rafael.secao18.model.entities.Contract;
import br.sc.rafael.secao18.model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;
    
    public ContractService() {
    }

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
	public void processContract(Contract contract, Integer months){
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);
			
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
			
		}
    }
	private Date addMonths(Date date, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, month);
		return calendar.getTime();
	}
	
}
