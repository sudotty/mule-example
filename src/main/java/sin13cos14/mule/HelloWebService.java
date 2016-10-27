package sin13cos14.mule;

import javax.jws.WebService;

/**
 * Created by sin13cos14 on 2016/10/27  18:27
 */
@WebService
public interface HelloWebService {
    public String test(String name);
}
