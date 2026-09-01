package edu.dosw.parcial;

public class App {

    public static void main(String[] args) {
        Validator chain = new DisponibilidadFranjaValidator();

        chain.setNext(new BarberoDisponibleValidator())
            .setNext(new DatosClienteValidator())
            .setNext(new ServicioPermitidoValidator())
            .setNext(new PasarelaPagoValidator());

        chain.validate(null);
    }
    
}
