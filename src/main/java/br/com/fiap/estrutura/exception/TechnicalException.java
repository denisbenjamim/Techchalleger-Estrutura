package br.com.fiap.estrutura.exception;

public class TechnicalException extends RuntimeException {
	private static final long serialVersionUID = -8220544041663728658L;

	public TechnicalException(Throwable throwable){
        super(throwable);
        throwable.printStackTrace();
    }

}
