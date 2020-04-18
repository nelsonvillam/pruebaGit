# Desafío 1: Periodos perdidos Por Nelson Villamizar


Este programa corresponde a la opcion Nivel 1:

Es una aplicacion stand alone que recibe como parametro un nombre de archivo con contenido Json,
opcionalmente recibe un nombre de archivo para guardar la salida;
si no hay parámetro de archivo de salida entonces la salida se imprime en la consola.

# Detalle de los sistemas

Java 8
Spring-Boot 1.5.9.RELEASE
Maven 3.2.2


# Compilar y ejecutar el proyecto

Para compilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *ApiPeriodos* ejecutar el siguiente comando *maven*

```bash
mvn package
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```bash
java -jar .\desafio-uno-1.0.0.jar nombre_archivo_entrada nombre_archivo_salida
 
```

También se puede ejecutar así
```bash
java -jar .\desafio-uno-1.0.0.jar nombre_archivo_entrada > nombre_archivo_salida
 ```
