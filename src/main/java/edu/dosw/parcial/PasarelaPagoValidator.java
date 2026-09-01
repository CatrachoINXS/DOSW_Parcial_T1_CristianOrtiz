package edu.dosw.parcial;

public class PasarelaPagoValidator extends BaseValidator {

    @Override
    public void validate(String request) {
        System.out.println("[OK] Pasarela");
        if (next != null) {
            next.validate(request); 
        }
    }
    
}
