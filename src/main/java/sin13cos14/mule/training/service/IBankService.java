package sin13cos14.mule.training.service;

import sin13cos14.mule.training.MoneyRequest;
import sin13cos14.mule.training.MoneyResponse;

import javax.jws.WebService;

/**
 * Created by sin13cos14 on 2016/10/28  16:14.
 */
@WebService
public interface IBankService {
    MoneyResponse sendMoney(MoneyRequest request);
}
