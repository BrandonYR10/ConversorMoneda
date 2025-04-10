# ConversorMoneda

# 💱 Conversor de Moneda

Aplicación en Java para convertir monedas utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/). Esta app interactúa con el usuario mediante consola, realiza solicitudes HTTP y procesa respuestas en formato JSON usando la biblioteca Gson.

## 🚀 Funcionalidades

- Menú interactivo en consola para elegir monedas de origen y destino
- Conversión en tiempo real utilizando tasas de cambio actuales
- Soporte para las siguientes monedas:
  - ARS - Peso argentino
  - BOB - Boliviano boliviano
  - BRL - Real brasileño
  - CLP - Peso chileno
  - COP - Peso colombiano
  - USD - Dólar estadounidense
- Entrada de valores por teclado (usando `Scanner`)
- Manejo de JSON con la librería Gson

## 🛠️ Tecnologías

- Java 17+
- IntelliJ IDEA
- Maven
- Gson
- ExchangeRate-API
- HttpClient (de Java)

## 🧠 Estructura del proyecto

```plaintext
ConversorMoneda/
├── src/
│   └── main/
│       └── java/
│           └── lad/
│               └── com/
│                   └── alura/
│                       └── conversormoneda/
│                           ├── ConversorApp.java
│                           └── Conversor.java
├── pom.xml
