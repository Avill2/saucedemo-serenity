Proyecto de compras en Saucedemo.
La automatizacion E2E permitio validar el flujo completo de compra, serenity facilita los resultados con reportes visuales.

Tecnologías:
- Java 11
- Maven 3.9
- Serenity BDD 3.9.8
- Selenium 4
Se implemento el patron de Page Object Model (POM)
- las paginas (Login, productos, carrito, checkout)
- los pasos de negocio (Steps)
- las definiciones de pasos (step definitions)

Se identificacion y resolvieron errores de configuracion, principalmente relacionados con:
- Dependencias de Maven
- Carga incorrecta de Serenity BDD
- versiones incompatibles JDK 11

Ejecución:
1. Clonar repositorio
2. mvn clean verify
3. Abrir target/site/serenity/index.html

Se aprendió que Serenity BDD depende bastante de la configuracion correcta del POM.XML

