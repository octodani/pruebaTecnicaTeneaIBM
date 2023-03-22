# pruebaTecnicaTeneaIBM
Prueba técnica para la vacante de Tenea/IBM


### Ejecución del programa:

En la cosola se debe ejecutar el siguiente comando: java -jar consultarProveedores.jar + el ID del cliente que se quiera consultar:

![ejecucion](https://github.com/octodani/pruebaTecnicaTeneaIBM/blob/master/assets/ejecucion.png)

Si no se introduce ningún ID de cliente se muestra el siguiente mensaje:

![no args](https://github.com/octodani/pruebaTecnicaTeneaIBM/blob/master/assets/no%20args.png)

Si el ID del cliente introducido no tiene ningún proveedor asignado se muestra el siguiente mensaje:

![no proveedores](https://github.com/octodani/pruebaTecnicaTeneaIBM/blob/master/assets/no%20proveedores.png)

Si el ID del cliente tiene proveedores asignados se muestra el siguiente mensaje con la ruta donde se ha generado el fichero con el informe:

![con proveedores](https://github.com/octodani/pruebaTecnicaTeneaIBM/blob/master/assets/con%20proveedores.png)

El informe tiene el siguiente aspecto:

![informe](https://github.com/octodani/pruebaTecnicaTeneaIBM/blob/master/assets/informe.png)

### Ruta del fichero generado:
C:/Informes de clientes/

### Dependencias
Spring Data JPA  
MySQL Driver

Poyecto generado con Spring Boot v3.0.4
