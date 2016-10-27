package sin13cos14.mule;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;
import org.mule.transport.NullPayload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by sin13cos14 on 2016/10/27  23:19
 */
public class SendingJsonDataToJMSQueueTest extends FunctionalTestCase {
    private static String MESSAGE;

    @Rule
    public DynamicPort port = new DynamicPort("http.port");

    @Override
    protected String getConfigResources()
    {
        return "json-to-jms.xml";
    }
    @BeforeClass
    public static void init() {
        try {
            MESSAGE = FileUtils.readFileToString(new File("./src/test/resources/message.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void httpGetToFlowUrlSentMessage() throws Exception
    {
        MuleClient client = new MuleClient(muleContext);
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("http.method", "POST");
        MuleMessage result = client.send("http://localhost:" + port.getNumber() + "/sales", MESSAGE, props);
        assertNotNull(result);
        assertFalse(result.getPayload() instanceof NullPayload);
        assertEquals("200", result.getInboundProperty("http.status"));

        MuleMessage response = muleContext.getClient().request("jms://sales", 1500);
        assertNotNull(response);
        assertNotNull(response.getPayload());
    }


}