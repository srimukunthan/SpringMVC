package com.example;

public class AdditionProxy implements com.example.Addition {
  private String _endpoint = null;
  private com.example.Addition addition = null;
  
  public AdditionProxy() {
    _initAdditionProxy();
  }
  
  public AdditionProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdditionProxy();
  }
  
  private void _initAdditionProxy() {
    try {
      addition = (new com.example.AdditionServiceLocator()).getaddition();
      if (addition != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addition)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addition)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addition != null)
      ((javax.xml.rpc.Stub)addition)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.Addition getAddition() {
    if (addition == null)
      _initAdditionProxy();
    return addition;
  }
  
  public int add(int n1, int n2) throws java.rmi.RemoteException{
    if (addition == null)
      _initAdditionProxy();
    return addition.add(n1, n2);
  }
  
  public int sub(int n1, int n2) throws java.rmi.RemoteException{
    if (addition == null)
      _initAdditionProxy();
    return addition.sub(n1, n2);
  }
  
  
}