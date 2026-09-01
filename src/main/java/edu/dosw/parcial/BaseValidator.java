package edu.dosw.parcial;

public abstract class BaseValidator implements Validator {
    
    protected Validator next;

    public Validator setNext(Validator validator) {
        this.next = validator;
        return validator;
    }
}
