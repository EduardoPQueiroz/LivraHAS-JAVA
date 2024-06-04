package br.com.etec.has.livraria.exceptions;

public class ValorNegativoException extends RuntimeException{
    public ValorNegativoException(String message) {
        super(message);
    }
}
