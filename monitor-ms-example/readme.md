# Microservicio de Ejemplo
Microservicio usado con fines de prueba de concepto de nuevas tecnologías y componentes que vayan a componer la plataforma de monitorización.

## Capas SOA
Siguiendo una arquitectura SOA, las capas que componen el microservicio serán:
### Api
Capa que identificará todos los elementos de comunicación comunes a todas las capas que componen la arquitectura.
Debe de utilizar tipos básicos de Java e interfaces para definir la comunicación entre capas.
### Boot
Capa de inicialización del microservicio. Contendrá todo lo referente al sistema de arranque y configuración, así como el perfilado y parametrización.
### Model
Define el modelo de datos del microservicio. Contiene todo lo referente a acceso a datos (Repository, Entity, JdbcTemplate...).
### Ms
Capa de acceso a servicios de mensajería (MQ, Kafka...). Capa para definir las subscripciones o publicaciones en sistemas de mensajería.
### Ws
Capa de acceso a servicios externos así como de definición de los propios servicios que contiene el microservicio.