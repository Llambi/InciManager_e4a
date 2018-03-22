package asw.inciProcessor.webService.responses.errors;

public abstract class ErrorResponse extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public abstract String getMessageJSONFormat();

	public abstract String getMessageStringFormat();

}
