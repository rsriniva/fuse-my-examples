
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.helloworld.customer;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2015-06-09T09:42:48.833+05:30
 * Generated source version: 2.7.0.redhat-610379
 * 
 */

@javax.jws.WebService(
                      serviceName = "HelloWorldEndpointService",
                      portName = "HelloWorldService",
                      targetNamespace = "http://customer.helloWorld.com",
                      wsdlLocation = "file:/NotBackedUp/cpandey/Development/FUSE-WORKSPACES/MohitIssue/camel-blueprint-bean/src/main/resources/wsdl/HelloWorld.wsdl",
                      endpointInterface = "com.helloworld.customer.HelloWorldEndpoint")
                      
public class HelloWorldEndpointImpl implements HelloWorldEndpoint {

    private static final Logger LOG = Logger.getLogger(HelloWorldEndpointImpl.class.getName());

    /* (non-Javadoc)
     * @see com.helloworld.customer.HelloWorldEndpoint#helloWorld(com.helloworld.customer.InputHelloWorld  in )*
     */
    public com.helloworld.customer.OutputHelloWorld helloWorld(InputHelloWorld in) { 
        LOG.info("Executing operation helloWorld");
        System.out.println(in);
        try {
            com.helloworld.customer.OutputHelloWorld _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}