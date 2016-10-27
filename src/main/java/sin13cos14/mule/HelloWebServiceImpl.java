package sin13cos14.mule;

/**
 * Created by sin13cos14 on 2016/10/27  18:29
 */
public class HelloWebServiceImpl implements HelloWebService {
    public String test(String name) {
        return "test:" + name;
    }
}
