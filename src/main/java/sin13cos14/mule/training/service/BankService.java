package sin13cos14.mule.training.service;

import sin13cos14.mule.training.MoneyRequest;
import sin13cos14.mule.training.MoneyResponse;

/**
 * Created by sin13cos14 on 2016/10/28  16:16.
 */
public class BankService {
    private final int MAX = 999999;

    private final int MIN = 100000;

    public MoneyResponse sendMoney(MoneyRequest request) {
        MoneyResponse response = new MoneyResponse();
        response.setSender(request.getSender());
        response.setReceiver(request.getReceiver());
        response.setAmount(request.getAmount());
        response.setOrigin(request.getOrigin());
        response.setDestination(request.getDestination());
        response.setConfirmationNumber((int) (Math.random() * (MAX - MIN) + MIN));
        return response;
    }
}
