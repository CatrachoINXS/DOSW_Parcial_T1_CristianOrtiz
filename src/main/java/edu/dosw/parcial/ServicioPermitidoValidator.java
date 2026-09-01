package edu.dosw.parcial;

public class ServicioPermitidoValidator extends BaseValidator {

    @Override
    public void validate(String request) {
        System.out.println("[OK] Servicio en catalogo");
        next.validate(request);
    }
    
}
