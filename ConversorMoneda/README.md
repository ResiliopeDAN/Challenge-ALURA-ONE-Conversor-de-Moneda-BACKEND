# Conversor de Monedas - Challenge ONE (Back End)

## Descripción
Este proyecto es parte del Challenge de Back End del programa **Oracle Next Education (ONE)**. Consiste en una aplicación de consola (CLI) en Java que realiza conversiones de monedas utilizando una API de tasas de cambio en tiempo real.

El proyecto ha sido diseñado siguiendo principios de **Programación Orientada a Objetos (POO)** y **Clean Code**, separando la lógica de negocio, la capa de acceso a datos (API) y la interacción con el usuario.

## Características
- Conversión de monedas en tiempo real.
- Soporte para las siguientes divisas:
  - Dólar Estadounidense (USD)
  - Peso Argentino (ARS)
  - Real Brasileño (BRL)
  - Peso Colombiano (COP)
- Menú interactivo en consola.
- Manejo de errores y excepciones.
- Historial de conversiones (implementación base en consola).

## Tecnologías Utilizadas
- **Java 20**: Lenguaje principal.
- **Maven**: Gestión de dependencias.
- **Gson**: Librería para parseo de JSON.
- **Java HttpClient**: Cliente HTTP nativo para consumir la API.
- **ExchangeRate-API**: Proveedor de tasas de cambio.

## Estructura del Proyecto
El código se organiza en los siguientes paquetes bajo `org.resili`:
- **`modelos`**: Contiene las clases de dominio (`Moneda`) y DTOs (`MonedaDTO`). Aquí reside la lógica de negocio como el cálculo de conversiones.
- **`servicios`**: Contiene `ConsultaMoneda` encargada de la comunicación con la API externa.
- **`principal`**: Contiene la clase `Main` con el punto de entrada y la lógica de interacción con el usuario.

## Cómo Ejecutar
### Requisitos
- Java JDK 17 o superior.
- Maven (opcional, si se usa un IDE con soporte integrado).

### Pasos
1. Clonar el repositorio o descargar el código.
2. Abrir el proyecto en su IDE de preferencia (IntelliJ IDEA recomendado).
3. Asegurarse de que las dependencias de Maven se hayan descargado (especialmente `com.google.code.gson:gson`).
4. Ejecutar la clase `org.resili.principal.Main`.
5. Seguir las instrucciones en la consola.

## Ejemplo de Uso
```text
Sea bienvenido/a al Conversor de Moneda =]

1) Dólar => Peso argentino
...
Elija una opción válida: 1
Ingrese el valor que deseas convertir: 100
El valor 100.00 USD corresponde al valor final de => 85000.00 ARS
```

## Autor
Desarrollado por **Resili** (Darío Q.Q.) como parte de la formación Alura Latam / Oracle.
