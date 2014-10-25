package com.example;

import javax.xml.ws.Endpoint;
import com.example.addition;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/additionWS/services/addition", new addition());
    }
 
}