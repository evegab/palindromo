# Palíndromo
_Creación de Aplicación Spring Boot para exponer API REST. La API expone un endpoint el cual recibe una cadena y la aplicación, por medio de un algoritmo desarrollado, busca el palindromo más grande si existe y lo retorna. La aplicación exige autenticación y para el servicio se exige autorización por medio de un token jwt._

## Installation

Clonar el siguiente repositorio: [https://github.com/evegab/palindromo](https://github.com/evegab/palindromo)

Para la instalación y ejecución del proyecto basta con seguir los siguientes comandos:
en la carpeta en la cual **descargó** el repositorio abrir la terminal y ejecutar: 
```sh
cd /palindromo
./mvnw spring-boot:run
```
_La aplicación comenzará a ejecutarse sobre el puerto 8080_ 
_Pruebe en su navegador o herramientas como Postman: http://localhost:8080/ y encontrá la página de inicio de la aplicación._
```sh
http://localhost:8080/
```
## Acerca del algoritmo

- Se usa estructura de datos List
- El concepto de Cola (Queue Data Structure)
- El concepto de árbol (Tree Data Structure)
- Busqueda sobre árboles Búsqueda en Amplitud
- El concepto de agente (AI) para la expansión del árbol

_El algoritmo busca la solución apoyánsode en la estrategía divide y conquistarás: para determinar si una cadena es palíndromo se necesita la cadena completa, sin embargo, lo que si se busca es devidir la cadena en subcadenas más pequeñas. Lo primero es verificar si la cadena original de tamaño n es palindromo, de ser cierto el problema está resuelto, pero si no es palíndromo, el algoritmo busca la subcadena más grade menor a tamaño n, es decir, las subcadenas de tamaño n-1 y solo existen 2 cadenas de tamaño n-1 en una cadena de tamaño n. Y en ese punto se hace uso del concepto de recursión para la busqueda del palindromo más grande o de las demás subcadenas._


![N|Solid](https://jariasf.files.wordpress.com/2012/02/animated_bfs.gif)

# DEFINICIÓN DE API

_Consultar archivo swargger.yaml en la raíz del repositorio_

