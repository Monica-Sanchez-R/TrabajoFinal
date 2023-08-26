# TrabajoFinal
Instalación
Clona el repositorio del proyecto utilizando el comando:
•	git clone https://github.com/tuusuario/tuproyecto.git
Requisitos y Configuración
•	Asegúrate de tener instalado Java 17 en tu sistema.
•	La versión del modelo es 4.0.0 y se utiliza Spring Boot 3.1.1.
•	El proyecto utiliza el lenguaje Java.
•	Se recomienda utilizar Spring Tool 4 como el IDE para trabajar con el proyecto.
•	Utiliza MySQL Workbench versión 8.0 para gestionar la base de datos.
•	En MySQL Workbench, crea una base de datos llamada "movies".
•	Dentro de esa base de datos, se crearan las siguientes tablas: "pelicula", "genero", "calificacion", "usuario".
Uso
1.	Abre Spring Tool 4 e importa el proyecto "trabajo_final_proyecto".
2.	Navega a la carpeta src/main/resources dentro del proyecto.
3.	Abre el archivo application.properties.
4.	En el archivo application.properties, configura los parámetros de conexión a la base de datos MySQL:
a.	spring.datasource.url=jdbc:mysql://localhost:3306/asesoria_de_riegos?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
•	spring.datasource.url: Cambia la URL para que coincida con tu configuración de MySQL. Asegúrate de ajustar el hostname y el puerto según sea necesario.
b.	spring.datasource.username=root
•	spring.datasource.username: Ingresa tu nombre de usuario de MySQL.

c.	spring.datasource.password=123456
•	spring.datasource.password: Ingresa tu contraseña de MySQL. Si no tienes una, deja este campo vacío.

Ejemplo de Uso de una Función
Después de configurar los parámetros de la base de datos, puedes comenzar a utilizar las funciones de la aplicación.
