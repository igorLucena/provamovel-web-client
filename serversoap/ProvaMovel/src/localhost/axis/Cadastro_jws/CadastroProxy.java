package localhost.axis.Cadastro_jws;

public class CadastroProxy implements localhost.axis.Cadastro_jws.Cadastro {
  private String _endpoint = null;
  private localhost.axis.Cadastro_jws.Cadastro cadastro = null;
  
  public CadastroProxy() {
    _initCadastroProxy();
  }
  
  public CadastroProxy(String endpoint) {
    _endpoint = endpoint;
    _initCadastroProxy();
  }
  
  private void _initCadastroProxy() {
    try {
      cadastro = (new localhost.axis.Cadastro_jws.CadastroServiceLocator()).getCadastro();
      if (cadastro != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cadastro)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cadastro)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cadastro != null)
      ((javax.xml.rpc.Stub)cadastro)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.axis.Cadastro_jws.Cadastro getCadastro() {
    if (cadastro == null)
      _initCadastroProxy();
    return cadastro;
  }
  
  public void setSenha(java.lang.String senha) throws java.rmi.RemoteException{
    if (cadastro == null)
      _initCadastroProxy();
    cadastro.setSenha(senha);
  }
  
  public java.lang.String getSenha() throws java.rmi.RemoteException{
    if (cadastro == null)
      _initCadastroProxy();
    return cadastro.getSenha();
  }
  
  public void setEmail(java.lang.String email) throws java.rmi.RemoteException{
    if (cadastro == null)
      _initCadastroProxy();
    cadastro.setEmail(email);
  }
  
  public java.lang.String getEmail() throws java.rmi.RemoteException{
    if (cadastro == null)
      _initCadastroProxy();
    return cadastro.getEmail();
  }
  
  public void setNomeUsuario(java.lang.String nomeUsuario) throws java.rmi.RemoteException{
    if (cadastro == null)
      _initCadastroProxy();
    cadastro.setNomeUsuario(nomeUsuario);
  }
  
  public java.lang.String getNomeUsuario() throws java.rmi.RemoteException{
    if (cadastro == null)
      _initCadastroProxy();
    return cadastro.getNomeUsuario();
  }
  
  
}