Este proyecto implementa un sistema completo para gestionar contenido audiovisual utilizando Programación Orientada a Objetos (POO) en Java, siguiendo buenas prácticas de diseño, principios SOLID, manejo de archivos, el patrón MVC, y pruebas unitarias con JUnit.
El sistema permite administrar distintos tipos de contenido como:

🎬 Películas
🎞️ Series de TV
📚 Documentales
🎙️ Podcasts
🖥️ Webinars
👤 Actores
🧪 Investigadores
📅 Temporadas

Toda la información se almacena en archivos CSV dentro de la carpeta data/ y puede cargarse y manipularse mediante gestores especializados.
🎯 Objetivos del Proyecto
✔️ 1. Manejo de Archivos (CSV)

El sistema puede:

Guardar objetos en archivos CSV
Cargar datos desde archivos
Crear directorios automáticamente
Manejar excepciones y archivos inexistentes

✔️ 2. Refactorización & Código Limpio

Eliminación de duplicación de código
Métodos pequeños y específicos
Nombres claros y autoexplicativos
Separación de responsabilidades

✔️ 3. Principios SOLID

Se aplicaron de forma directa:

✔ SRP – Single Responsibility
Cada clase hace solo UNA cosa:
Pelicula modela una película
PeliculaGestor la guarda/carga
ArchivoManager maneja archivos

✔ OCP – Open/Closed

Agregar nuevos tipos de contenido no obliga a modificar código existente.
Solo se extiende GestorBase.

✔ LSP – Liskov Substitution

✔ ISP – Interface Segregation
