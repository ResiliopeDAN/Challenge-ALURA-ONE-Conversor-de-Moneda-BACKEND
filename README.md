# Challenge: Conversor de Monedas - Oracle Next Education (ONE)

## 🌟 Descripción del Proyecto
Este proyecto es un **Conversor de Monedas** desarrollado en Java como parte del primer desafío del programa **Oracle Next Education (ONE)** en la especialización de **Backend**. El objetivo es crear una herramienta de línea de comandos que consuma datos reales de una API de tasas de cambio para realizar conversiones de divisas de manera eficiente y con una estructura robusta de Programación Orientada a Objetos (POO).

## 🚀 Estado Actual del Proyecto
- [x] **Inicialización del Repositorio:** Estructura base configurada.
- [x] **Entorno de Desarrollo:** Configurado con **Java 20 (Amazon Corretto)**.
- [x] **Gestión de Dependencias:** Proyecto inicializado con **Maven**.
- [x] **Documentación de Contexto:** Se ha establecido un plan de arquitectura basado en el proyecto "Screenmatch" de Alura, integrando el uso de `Records` como DTOs y clases de dominio para la lógica de negocio.
- [ ] **Configuración de Dependencias (Gson):** Pendiente de inyectar en `pom.xml`.
- [ ] **Consumo de API:** Pendiente implementación con `HttpClient`.

## 🛠️ Tecnologías y Conceptos Aplicados
*   **Java 20:** Uso de características modernas como `Records`.
*   **Maven:** Para la gestión de dependencias y construcción del proyecto.
*   **Gson (Google):** Biblioteca para la manipulación y parsing de archivos JSON provenientes de la API.
*   **ExchangeRate-API:** Servicio externo utilizado para obtener las tasas de cambio en tiempo real.
*   **POO:** Aplicación de encapsulamiento, separación de responsabilidades y patrones de diseño observados durante el curso.

## 📈 Próximos Pasos
1.  Inyección de la dependencia de **Gson** en el archivo `pom.xml`.
2.  Creación de la estructura de paquetes: `modelos`, `servicios` y `principal`.
3.  Implementación del Record `MonedaDTO` y la clase de dominio `Moneda`.
4.  Desarrollo de la clase de servicio para el consumo de la API mediante `HttpClient`.
5.  Construcción del menú interactivo para el usuario en la consola.

---
*Este proyecto es parte del aprendizaje continuo en la formación Backend de Alura Latam y Oracle.*