/**
 * CadastroServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.axis.Cadastro_jws;

public class CadastroServiceLocator extends org.apache.axis.client.Service implements localhost.axis.Cadastro_jws.CadastroService {

    public CadastroServiceLocator() {
    }


    public CadastroServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CadastroServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Cadastro
    private java.lang.String Cadastro_address = "http://localhost:8080/axis/Cadastro.jws";

    public java.lang.String getCadastroAddress() {
        return Cadastro_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CadastroWSDDServiceName = "Cadastro";

    public java.lang.String getCadastroWSDDServiceName() {
        return CadastroWSDDServiceName;
    }

    public void setCadastroWSDDServiceName(java.lang.String name) {
        CadastroWSDDServiceName = name;
    }

    public localhost.axis.Cadastro_jws.Cadastro getCadastro() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Cadastro_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCadastro(endpoint);
    }

    public localhost.axis.Cadastro_jws.Cadastro getCadastro(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.axis.Cadastro_jws.CadastroSoapBindingStub _stub = new localhost.axis.Cadastro_jws.CadastroSoapBindingStub(portAddress, this);
            _stub.setPortName(getCadastroWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCadastroEndpointAddress(java.lang.String address) {
        Cadastro_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.axis.Cadastro_jws.Cadastro.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.axis.Cadastro_jws.CadastroSoapBindingStub _stub = new localhost.axis.Cadastro_jws.CadastroSoapBindingStub(new java.net.URL(Cadastro_address), this);
                _stub.setPortName(getCadastroWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Cadastro".equals(inputPortName)) {
            return getCadastro();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/axis/Cadastro.jws", "CadastroService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/axis/Cadastro.jws", "Cadastro"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Cadastro".equals(portName)) {
            setCadastroEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
