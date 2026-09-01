package edu.dosw.parcial;

public class DatosClienteValidator extends BaseValidator {

    @Override
    public void validate(String request) {
        System.out.println("[OK] Datos cliente validos");
        next.validate(request);
    }
    
}
