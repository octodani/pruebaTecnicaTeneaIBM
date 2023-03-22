package com.danielMirandaTorres.pruebaTecnica.util;

import com.danielMirandaTorres.pruebaTecnica.mensajes.Mensajes;
import com.danielMirandaTorres.pruebaTecnica.proveedor.Proveedor;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class GeneradorFichero {

    private String fileDirectory = "C:/Informes de clientes/";
    private String fileName = "Informe de proveedores del cliente ";

    public String getFileName() {
        return fileDirectory + fileName;
    }

    public void generarFichero(List<Proveedor> proveedores, Long idCliente) throws IOException {

        this.fileName += idCliente + ".txt";

        Files.createDirectories(Paths.get(fileDirectory));

        FileWriter fileWriter = new FileWriter(fileDirectory + fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        printWriter.println(Mensajes.INFORME.getMensaje() + idCliente);
        printWriter.println();
        for(Proveedor proveedor: proveedores) {
            printWriter.printf("Id del proveedor: %s\n", proveedor.getIdProveedor());
            printWriter.printf("Nombre del proveeddor: %s\n", proveedor.getNombre());
            printWriter.printf("Fecha de alta del proveedor: %s\n", formatter.format(proveedor.getFechaDeAlta()));
            printWriter.println();
        }
        printWriter.close();
    }
}
