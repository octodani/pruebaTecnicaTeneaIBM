package com.danielMirandaTorres.pruebaTecnica.proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> listProveedoresByClient(Long idCliente) {
        return proveedorRepository.findByClient(idCliente);
    }
}
