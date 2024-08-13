### Tabla seleccionada: customer

### EndPoints
- entidad/saveEntidad
- entidad/deleteEntidad/{id}
- entidad/updateEntidad/{id}
- entidad/allEntidad
- entidad/getEntidad/{id}
  
ejem: 

http://localhost:8080/customer/saveCustomer

{
 "id":"1",
 "nameCustoer":"a",
 "lastNameCustomer":"a",
 "emailCustomer":"emailCustomer",
 "birthDate":"1990-05-15",
 "longCustomer":"1",
 "latitudCustomer":"1",
 "city":{"id":"1"}
}

http://localhost:8080/customer/deleteCustomer/1

http://localhost:8080/customer/getCustomer/1

http://localhost:8080/customer/updateCustomer/1

http://localhost:8080/customer/allCustomer
