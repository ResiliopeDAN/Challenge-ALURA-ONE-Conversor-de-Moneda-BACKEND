# Challenge: Conversor de Monedas - Oracle Next Education (ONE)

## 🌟 Descripción del Proyecto
Este proyecto es un **Conversor de Monedas** desarrollado en Java como parte del primer desafío del programa **Oracle Next Education (ONE)** en la especialización de **Backend**. El objetivo es crear una herramienta de línea de comandos que consuma datos reales de una API de tasas de cambio para realizar conversiones de divisas de manera eficiente y con una estructura robusta de Programación Orientada a Objetos (POO).

## 🚀 Estado Actual del Proyecto
- [x] **Inicialización del Repositorio:** Estructura base configurada.
- [x] **Entorno de Desarrollo:** Java 20 (Amazon Corretto) + Maven.
- [x] **Arquitectura:** Estructura de paquetes definida (`modelos`, `servicios`, `principal`) siguiendo el patrón "Screenmatch".
- [x] **Modelado de Datos:**
    - `MonedaDTO` (Record): Mapeo exacto de la respuesta JSON.
    - `Moneda` (Clase): Entidad de dominio con lógica de encapsulamiento.
- [x] **Capa de Servicios:**
    - `ConsultaMoneda`: Cliente HTTP nativo implementado.
    - Integración con **ExchangeRate-API** usando una clave válida.
    - Parsing de JSON implementado con **Gson**.
- [ ] **Interfaz de Usuario (CLI):** Pendiente implementación del menú interactivo y flujo de control.

## 🛠️ Tecnologías y Conceptos Aplicados
*   **Java 20:** Uso de `Records` y `HttpClient` nativo.
*   **Maven:** Gestión de dependencias.
*   **Gson (Google):** Deserialización de JSON.
*   **ExchangeRate-API:** Fuente de datos de tasas de cambio.
*   **POO:** Separación estricta entre DTOs, Entidades y Servicios.
*   **Manejo de Errores:** Excepciones personalizadas para fallos de red y validación de datos.

## 📈 Próximos Pasos
1.  Implementar el bucle principal (`Main.java`) con un menú interactivo.
2.  Agregar la lógica matemática de conversión (Cantidad * Tasa).
3.  Validar entradas de usuario y finalizar documentación.

---
*Este proyecto es parte del aprendizaje continuo en la formación Backend de Alura Latam y Oracle.*
