package com.danielMirandaTorres.pruebaTecnica.proveedor;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    @Query("select p from Proveedor p where p.idCliente = :idCliente")
    public List<Proveedor> findByClient(Long idCliente);
}
