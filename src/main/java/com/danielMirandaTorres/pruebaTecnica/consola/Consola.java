package com.danielMirandaTorres.pruebaTecnica.consola;

import com.danielMirandaTorres.pruebaTecnica.mensajes.Mensajes;
import com.danielMirandaTorres.pruebaTecnica.proveedor.ProveedorService;
import com.danielMirandaTorres.pruebaTecnica.util.GeneradorFichero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consola implements CommandLineRunner {

    @Autowired
    ProveedorService proveedorService;

    @Autowired
    GeneradorFichero generadorFichero;

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0) {
            System.out.println(Mensajes.ARGS.getMensaje() + args[0]);
            if(proveedorService.listProveedoresByClient(Long.valueOf(args[0])).isEmpty()) {
                System.out.println(Mensajes.NO_RESULTS.getMensaje());
            } else {
                generadorFichero.generarFichero(proveedorService.listProveedoresByClient(Long.valueOf(args[0])), Long.valueOf(args[0]));
                System.out.println(Mensajes.DESTINO.getMensaje() + generadorFichero.getFileName());
            }
        } else {
            System.out.println(Mensajes.NO_ARGS.getMensaje());
        }
    }
}
