package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentsService onlinePaymentsService;

    public ContractService(OnlinePaymentsService onlinePaymentsService) {
        this.onlinePaymentsService = onlinePaymentsService;
    }

    public void processContract(Contract contract, Integer mounth){
        double basicQuota = contract.getTotalValue() / mounth;
        for(int i=1; i <=mounth; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentsService.interest(basicQuota, i);
            double fee = onlinePaymentsService.paymentFee(basicQuota + interest);
            double quota = basicQuota +interest+fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
