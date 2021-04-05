# Microservicio de Ejemplo
Microservicio usado con fines de prueba de concepto de nuevas tecnolog�as y componentes que vayan a componer la plataforma de monitorizaci�n.

## Capas SOA
Siguiendo una arquitectura SOA, las capas que componen el microservicio ser�n:
### Api
Capa que identificar� todos los elementos de comunicaci�n comunes a todas las capas que componen la arquitectura.
Debe de utilizar tipos b�sicos de Java e interfaces para definir la comunicaci�n entre capas.
### Boot
Capa de inicializaci�n del microservicio. Contendr� todo lo referente al sistema de arranque y configuraci�n, as� como el perfilado y parametrizaci�n.
### Model
Define el modelo de datos del microservicio. Contiene todo lo referente a acceso a datos (Repository, Entity, JdbcTemplate...).
### Ms
Capa de acceso a servicios de mensajer�a (MQ, Kafka...). Capa para definir las subscripciones o publicaciones en sistemas de mensajer�a.
### Ws
Capa de acceso a servicios externos as� como de definici�n de los propios servicios que contiene el microservicio.