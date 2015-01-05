package com.example;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.HelloWorld")
public class addition implements HelloWorld{

	public int add(int n1,int n2)  
    {  
        return n1+n2;  
    }  
	
	public int sub(int n1,int n2)  
    {  
        return n1-n2;  
    }  
	
}
