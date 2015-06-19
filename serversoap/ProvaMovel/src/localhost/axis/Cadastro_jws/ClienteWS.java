package localhost.axis.Cadastro_jws;

public class ClienteWS {
	public static void main(String[] args) {
		try{
			Cadastro cadastroService = (Cadastro) new CadastroServiceLocator().getCadastro();
			cadastroService.setEmail("igor");
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}
