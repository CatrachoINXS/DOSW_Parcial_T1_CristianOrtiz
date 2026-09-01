package edu.dosw.parcial;

public class DisponibilidadFranjaValidator extends BaseValidator {

    @Override
    public void validate(String request) {
        System.out.println("[OK] Franja disponible");
        next.validate(request);
    }
    
}
