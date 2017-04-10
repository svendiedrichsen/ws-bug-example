package ws.bug;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "fault")
public class FaultService {

    @WebMethod(operationName = "throwFault")
    public void throwFault() throws Exception {
        throw new Exception("this is intentional");
    }

}
