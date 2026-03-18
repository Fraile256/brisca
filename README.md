# Brisca
![CI/CD](https://github.com/Fraile256/brisca/actions/workflows/build.yml/badge.svg)

Aplicación dockerizada de un juego de cartas hecha con Spring, Hibernate y MAVEN. 

## Tecnologias

| Tecnologia | Version | Uso |
|------------|---------|-----|
| Java | 17 | Lenguaje principal |
| Spring Boot | 4.0.x | Framework backend |
| JPA/Hibernate | 6.x | Persistencia (ORM) |
| PostgreSQL | 42.7.10 | Base de datos (Docker) |
| H2 | - | Base de datos (desarrollo) |
| Docker | - | Contenedorizacion |
| GitHub Actions | - | CI/CD |
| Swagger/OpenAPI | - | Documentacion API |

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

| Metodo | URL                   | Descripcion |
|--------|-----------------------|-------------|
| GET | `/api/jugadores`      | Listar todos |
| GET | `/api/jugadores/{id}` | Obtener por ID |
| POST | `/api/jugadores`      | Crear nuevo |
| PUT | `/api/jugadores/{id}` | Actualizar |
| DELETE | `/api/jugadores/{id}` | Eliminar |

## Screenshot Swagger

![swagger](MiSwagger.png)

## Como ejecutar
```powershell
docker-compose up -d --build
```
[localhost:8087/api/cartas](http://localhost:8087/api/cartas)
## Autor:
Alejandro Fraile del Olmo — Curso IFCD0014