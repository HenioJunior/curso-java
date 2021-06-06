package _15_tratamento_excecoes._146_account.model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg){
		super(msg);
	}
	
}
