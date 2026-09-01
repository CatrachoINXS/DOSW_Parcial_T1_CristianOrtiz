package edu.dosw.parcial;

public class BarberoDisponibleValidator extends BaseValidator {

    @Override
    public void validate(String request) {
        System.out.println("[OK] Barbero disponible");
        next.validate(request);
    }
    
}
