# Brisca

![CI/CD](https://github.com/Fraile256/brisca/actions/workflows/build.yml/badge.svg)

Descripcion breve de una linea: que hace la aplicacion y para quien.

## Tecnologias

| Tecnologia | Version | Uso |
|------------|---------|-----|
| Java | 17 | Lenguaje principal |
| Spring Boot | 4.0.x | Framework backend |
| JPA/Hibernate | 6.x | Persistencia (ORM) |
| PostgreSQL | 16 | Base de datos (Docker) |
| H2 | - | Base de datos (desarrollo) |
| Docker | - | Contenedorizacion |
| GitHub Actions | - | CI/CD |
| Swagger/OpenAPI | - | Documentacion API |

## Arquitectura

(Aqui va un diagrama Mermaid con las capas: Controller > Service > Repository > BD)

## API Endpoints

| Metodo | URL | Descripcion |
|--------|-----|-------------|
| GET | `/api/recurso` | Listar todos |
| GET | `/api/recurso/{id}` | Obtener por ID |
| POST | `/api/recurso` | Crear nuevo |
| PUT | `/api/recurso/{id}` | Actualizar |
| DELETE | `/api/recurso/{id}` | Eliminar |

## Screenshot Swagger

(Aqui va la imagen capturada con GoFullPage)

## Como ejecutar

### Opcion 1: Docker Compose (recomendado)

(Instrucciones con docker compose up)

### Opcion 2: Desde Docker Hub (sin clonar)

(Instrucciones con docker pull + docker run)

### Opcion 3: Desde IntelliJ (desarrollo)

(Instrucciones con IntelliJ)

## Autor

Nombre — Curso IFCD0014