import com.konylabs.middleware.common.JavaService2;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.controller.DataControllerResponse;
import com.konylabs.middleware.dataobject.Param;
import com.konylabs.middleware.dataobject.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger implements JavaService2 {

    private static final Logger LOG = LogManager.getLogger(TestLogger.class);
    @Override
    public Object invoke(String s, Object[] objects, DataControllerRequest dataControllerRequest,
                         DataControllerResponse dataControllerResponse) throws Exception {

        //LOG.error("request.getServicesManager().getIdentityHandler().getUserId(); customerId = " + customerId);
        //LOG.info("HASAN: Test Logger class invoked");
        //LOG.trace("HASAN: Test logger trace");
        LOG.error("HASAN: Test Logger class invoked");
        String orgTitle = dataControllerRequest.getParameter("orgTitle");
        Result result = new Result();
        //result.addParam(new Param("Title","Fast","double"));
        //result.addParam(new Param("Title","Fast","collection"));
        result.addParam(new Param("Title", orgTitle,"string"));
        result.addParam(new Param("IsActive","false","boolean"));
        result.addParam(new Param("Strength","95000","int"));
        result.addParam(new Param("Population","95000","number"));
        //LOG.debug("HASAN: Test logger debug");
        LOG.error("HASAN: population has exceeded limit");
        //LOG.warn("HASAN: Test Logger class about to finish");
        LOG.error("HASAN: Test Logger class about to finish");
        //return null;
        return result;
    }
    //Libraries added in lib folder: middleware-api-9.3.1.6.jar, log4j-api-2.17.1.jar
    //Java version: 11.0.2
    //Reference:
    /*
        1- https://logging.apache.org/log4j/2.x/javadoc/log4j-api/org/apache/logging/log4j/Logger.html
        2- https://docs.kony.com/konylibrary/integration/MiddlewareAPI/com/konylabs/middleware/dataobject/Param.html#setValue-java.lang.String-
    */

    //For remote debugging:
    /*
    1- Goto top menu Run -> Edit configuration -> Add New Configuration -> Remote JVM Debug -> Set URL and Port of host -> Apply
    */
}
