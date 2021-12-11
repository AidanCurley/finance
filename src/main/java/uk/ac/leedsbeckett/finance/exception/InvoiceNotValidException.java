package uk.ac.leedsbeckett.finance.exception;

public class InvoiceNotValidException extends RuntimeException {

    public InvoiceNotValidException() {
        super("Not a valid invoice.");
    }
}