# Brisca
![CI/CD](https://github.com/Fraile256/brisca/actions/workflows/build.yml/badge.svg)

Aplicación API REST dockerizada de un juego de cartas llamado brisca hecha con Spring, Hibernate y MAVEN. 

## Tecnologias

| Tecnologia | Version | Uso |
|------------|---------|-----|
| Java | 21      | Lenguaje principal |
| Spring Boot | 4.0.3   | Framework backend |
| JPA/Hibernate | -       | Persistencia (ORM) |
| PostgreSQL | 42.7.10 | Base de datos (Docker) |
| H2 | -       | Base de datos (desarrollo) |
| Docker | 29.2.1  | Contenedorizacion |
| GitHub Actions | -       | CI/CD |
| Swagger/OpenAPI | 2.8.6   | Documentacion API |

## Arquitectura

```mermaid
classDiagram
    direction RL
    class PartidaHistorico {
        +Long Id
        +LocalDateTime fechaHoraInicio
        +String tipoJuego
        +double boteApostado
    }
    class ManoJugada {
        +Long Id
        +int ordenTurno
        +boolean manoGanadora
    }
    class Jugador {
        +Long Id
        +String aliasJugador
        +double saldoFichas
    }
    class Carta {
        +Long id
        +Long numeroValido
        +PaloBaraja palo
        +double puntosValorJuego
    }

    PartidaHistorico "1" -- "N" ManoJugada : contiene
    Jugador "1" -- "N" ManoJugada : realiza
    Carta "1" -- "N" ManoJugada : se juega en
```
## API Endpoints
### Jugadores
| Metodo | URL                   | Descripcion                |
|--------|-----------------------|----------------------------|
| GET | `/api/jugadores`      | Listar todos los jugadores |
| GET | `/api/jugadores/{id}` | Obtener jugadores por ID   |
| POST | `/api/jugadores`      | Crear nuevo jugador        |
| PUT | `/api/jugadores/{id}` | Actualizar jugadores       |
| DELETE | `/api/jugadores/{id}` | Eliminar jugadores         |
### Cartas
| Metodo | URL          | Descripcion            |
|--------|--------------|------------------------|
| GET | `/api/cartas` | Listar todos las cartas |
| GET | `/api/cartas/{id}` | Obtener cartas por ID  |
| POST | `/api/cartas` | Crear nueva carta      |
### PARTIDAS_HISTORICO
| Metodo | URL                 | Descripcion                          |
|--------|---------------------|--------------------------------------|
| GET | `/api/partidas_historico` | Listar el historico de partidas      |
| GET | `/api/partidas_historico/{id}`        | Obtener el historico partidas por ID |
| POST | `/api/partidas_historico`       | Crear un nuevo historico partidas    |

## Screenshot Swagger

![swagger](MiSwagger.png)

## Como ejecutar
```powershell
docker-compose up -d --build
```
La url de la API es:
[http://localhost:8087/api/cartas](http://localhost:8087/api/cartas)
## Autor:
Alejandro Fraile del Olmo — Curso IFCD0014