En visual estudio code:
1.- Click en "Archivo" --> "Abrir Carpeta", seleccionar la carpeta del proyecto clonado y click en el boton azul "Abrir"
2.- Desde un archivo .java del proyecto ejecutar "f5" o click en el Menú "Ejecutar" --> "Iniciar depuración" 
Nota: si lo inicias desde cualquier otro archivo el visual studio code te va a pedir un plugin de depuración.

El proyecto corre en el puerto 8080, si deseas cambiarlo lo puedes hacer en el archivo "application.properties" dentro de la carpeta "resources" del proyecto

Dependencia Principal
<dependency>
  <groupId>org.json</groupId>
  <artifactId>json</artifactId>
  <version>20231013</version>
  <type>jar</type>
</dependency>


Post
localhost:8080/api/v1/contacto/email

Headers
Key -> Conten-Type, Value -> application/json 

Body - Raw - JSON
{
    "email": "achale@bcv.org.ve"
}

BD

create database posold01;

create table CUSG.CONTACTO (
   CO_CONTACTO          serial                     not null,
   IN_TP_CONTACTO       character varying(1)           not null default 'C'
      check (IN_TP_CONTACTO in ('R','T','C','W')),
   TX_CONTACTO          character varying(100)         not null
);
