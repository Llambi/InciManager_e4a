package asw.inciProcessor.webService.request;

public class PeticionInfoREST {

	private String login;
	private String password;
	private String kind;

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public PeticionInfoREST() {

	}
	
	public PeticionInfoREST(String login,String password, String kind){
		this.login = login;
		this.password = password;
		this.kind = kind;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getKind() {
		return kind;
	}


}
