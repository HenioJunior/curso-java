package _15_tratamento_excecoes._142_excecoes_personalizadas.exceptions;

public class DomainException extends RuntimeException {

    public DomainException(String msg) {
        super(msg);
    }
}
