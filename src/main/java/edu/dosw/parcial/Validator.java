package edu.dosw.parcial;

public interface Validator {
    
    Validator setNext(Validator validator);
    void validate(String request);
}
