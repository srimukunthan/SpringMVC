package com.example;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.example.addition;
import com.example.HelloWorld;
 
public class HelloWorldClient{
 
	public static void main(String[] args) throws Exception {
 
	URL url = new URL("http://localhost:8080/additionWS/services/addition?wsdl");
 
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://example.com/", "additionService");
 
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        //addition hello = service.getPort("addRequest",addition.class);
 for (int i=0;i<20;i++){
        System.out.println(hello.add(i, i+1));
 }
    }
 
}
