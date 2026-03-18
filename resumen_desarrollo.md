# Resumen del Desarrollo - Proyecto Brisca

Este documento resume las preguntas y soluciones aplicadas durante el desarrollo del proyecto "Brisca".

---

### 1. ¿Cómo generar los `INSERT` iniciales para la base de datos?

**Pregunta:**
> Generame en data.sql los INSERTS

**Solución:**
Se crearon sentencias `INSERT` en el archivo `src/main/resources/data.sql` para poblar la base de datos con datos iniciales al arrancar la aplicación.

Los datos insertados incluyen:
- **Cartas**: Las 40 cartas de la baraja española con su valor y palo.
- **Jugadores**: Varios jugadores de ejemplo.
- **Partidas**: Un registro de partida histórica.
- **Manos Jugadas**: Una simulación de una mano en una partida.

**Ejemplo de `INSERT` para una carta:**
```sql
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (1, 'OROS', 11.0);
```

---

### 2. ¿Cómo corregir el error "Ambiguous handler methods"?

**Pregunta:**
> Corrígeme el error: `Ambiguous handler methods mapped for '/api/cartas/1'`

**Análisis del Error:**
El error se producía porque dos métodos en `CartaController` tenían mapeos de URL que entraban en conflicto. Ambos `getCartaPorId` y `getByPalo` estaban mapeados a un patrón como `/api/cartas/{variable}`. Spring no sabía a cuál de los dos dirigir una petición como `/api/cartas/1`.

**Solución:**
Se modificó la ruta del endpoint `getByPalo` para evitar la ambigüedad, añadiendo un prefijo.

**Código Corregido en `CartaController.java`:**
```java
// Mapeo original (conflictivo)
// @GetMapping("/{palo}")

// Mapeo corregido
@GetMapping("/palo/{palo}")
public Optional<Carta> getByPalo(@PathVariable String palo) {
    return repositorio.findByPalo(palo);
}
```
Ahora las rutas son únicas:
- `GET /api/cartas/{id}` para buscar por ID.
- `GET /api/cartas/palo/{palo}` para buscar por palo.

---

### 3. ¿Qué JSON se necesita para un `POST` en Postman?

**Pregunta:**
> ¿Cuál sería el JSON que habría que mandar para hacer un POST en Postman?

**Solución:**
Para crear una nueva carta mediante una petición `POST` a `/api/cartas`, se debe enviar un cuerpo (body) en formato JSON. El `id` no es necesario, ya que es autogenerado por la base de datos.

**Ejemplo de JSON para Postman:**
```json
{
  "numeroValido": 7,
  "palo": "ESPADAS",
  "puntosValorJuego": 0.0
}
```
**Instrucciones para Postman:**
1.  **Método:** `POST`
2.  **URL:** `http://localhost:8080/api/cartas`
3.  **Body:** `raw` > `JSON`
4.  **Headers:** `Content-Type: application/json`

---

### 4. ¿Cuál es el nombre de la base de datos?

**Pregunta:**
> ¿Cómo se llamará la base de datos de este proyecto?

**Solución:**
Revisando el archivo `src/main/resources/application.properties`, se determinó que el proyecto utiliza una base de datos **H2 en memoria**.

El nombre de la base de datos es **`brisca`**, según se define en la URL de conexión:
```properties
spring.datasource.url=jdbc:h2:mem:brisca
```
Esto significa que la base de datos se crea al iniciar la aplicación y se elimina al detenerla, lo cual es ideal para entornos de desarrollo y pruebas.
