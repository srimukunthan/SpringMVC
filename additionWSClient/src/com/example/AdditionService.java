/**
 * AdditionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example;

public interface AdditionService extends javax.xml.rpc.Service {
    public java.lang.String getadditionAddress();

    public com.example.Addition getaddition() throws javax.xml.rpc.ServiceException;

    public com.example.Addition getaddition(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
