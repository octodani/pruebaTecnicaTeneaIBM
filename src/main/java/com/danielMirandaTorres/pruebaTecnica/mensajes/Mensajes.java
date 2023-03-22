package com.danielMirandaTorres.pruebaTecnica.mensajes;

public enum Mensajes {
    ARGS("Consultando los proveedores del cliente "),
    NO_ARGS("Es necesario introducir un id de cliente."),
    NO_RESULTS("El cliente no tiene proveedores asignados."),
    DESTINO("Informe generado en el fichero: "),
    INFORME("Informe de proveedores del cliente ");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
