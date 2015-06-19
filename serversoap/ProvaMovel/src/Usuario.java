import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Usuario {
	
	private String email;
	private String senha;
	private String cep;
	private String id_facebook;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email.length() == 0) {
			System.out.println("O campo Email é obrigatório!");
		} else {
		Pattern p = Pattern.compile("[a-z][a-z0-9_.-]+@[a-z]+.[a-z]{3,3}(.[a-z]{2,2})?");
		Matcher m = p.matcher(email);
		boolean b = m.matches();
		if (!b) {
			System.out.println("Insira um e-mail válido!");
		} else {
			this.email = email;
			System.out.println("Email cadastrado com sucesso!");
		}
	}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if (senha.length() == 0) {
			System.out.println("O campo senha é obrigatório!");
		} else {
		if (senha.length() < 8) {
			System.out.println("A senha deve conter no mínimo 8 caracteres.");
		}
		Pattern maiuscula = Pattern.compile("[A-Z]");
		java.util.regex.Matcher matcher;
		boolean b = false;
		for (int i = 0; i < senha.length(); i++) {
			matcher = maiuscula.matcher(senha.subSequence(i, i+1));
			b = matcher.matches();
			if  (b) {
				break;
			}
		}
		if (!b) {
			System.out.println("A senha deve possui pelo menos 1 caractere maiúsculo.");
		} else {
			this.senha = senha;
			System.out.println("Senha cadastrada com sucesso!");
		}
	}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() > 8 || cep.length() < 8) {
			System.out.println("Coloque um CEP válido!");
		}
		this.cep = cep;
	}

	public String getId_facebook() {
		return id_facebook;
	}

	public void setId_facebook(String id_facebook) {
		this.id_facebook = id_facebook;
	}

}
