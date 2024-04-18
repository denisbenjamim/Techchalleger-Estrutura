package br.com.fiap.estrutura.exception;

public class BusinessException extends Exception {
	
	private static final long serialVersionUID = 3106470499819974992L;

	public BusinessException(final String message){
        super(message);
    }
}
