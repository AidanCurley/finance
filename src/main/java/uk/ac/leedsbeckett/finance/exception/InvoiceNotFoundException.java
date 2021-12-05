package uk.ac.leedsbeckett.finance.exception;

public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(Long id) {
        super("Could not find invoice " + id);
    }
}
