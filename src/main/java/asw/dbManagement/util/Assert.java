package asw.dbManagement.util;

import asw.dbManagement.entities.Agent;
import asw.factory.ErrorFactory;
import asw.factory.ErrorFactory.Errors;
import asw.inciProcessor.webService.CsvReader;

public class Assert {
	
	public static CsvReader instancia;
	
	public static boolean isLoginEmpty(String login) {
		if(login.trim().isEmpty())
			throw ErrorFactory.getError(Errors.REQUIRED_LOGIN);
		else
			return false;
	}
	public static boolean isPasswordEmpty(String password) {
		if(password.trim().isEmpty())
			throw ErrorFactory.getError(Errors.REQUIRED_PASSWORD);
		else
			return false;
	}
	/**
	 * Metodo que comprueba si el agente es null
	 * @param agent
	 * @return devuelve false si no es null o excepcion
	 */
	public static boolean isAgentNull(Agent agent){
		if (agent == null) {
			throw ErrorFactory.getError(Errors.USER_NOT_FOUND);
		}
		return false;		
	}
	
	/**
	 * Metodo que comprueba que la contraseña sea correcta
	 * @param password
	 * @param agent
	 * @return excepcion si es incorrecta, true si es correcta
	 */
	public static boolean isPasswordCorrect(String password,Agent agent){
		if (!password.equals(agent.getPassword())) {
			throw ErrorFactory.getError(Errors.INCORRECT_PASSWORD_DO_NOT_MATCH);
		}
		return true;
	}
	/*public static boolean isKindCorrect(String kind,Agent agent){
		if(!Application.instancia.checkType(kind, agent)) {
			throw ErrorFactory.getError(Errors.INCORRECT_KIND_DO_NOT_MATCH);
		}
		int numTipo = instancia.obtainType(kind);
		agent.setType(numTipo);
		return true;
	}*/
	public static boolean isKindEmpty(String kind) {
		if(kind.trim().isEmpty())
			throw ErrorFactory.getError(Errors.REQUIRED_KIND);
		else
			return false;
		
	}

	
	
	
	
	


}
