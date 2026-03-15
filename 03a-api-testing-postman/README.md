# 03a - API Testing con Postman

## Descripción
Ejercicios prácticos de API Testing usando Postman sobre la API pública JSONPlaceholder.

## Herramientas
- Postman
- JSONPlaceholder API (https://jsonplaceholder.typicode.com)

## Endpoints probados
| Método | Endpoint  | Status esperado |
|--------|-----------|-----------------|
| GET    | /users    | 200 OK          |
| POST   | /posts    | 201 Created     |
| DELETE | /posts/1  | 200 OK          |

## Tests automatizados
- Validación de status code en los 3 endpoints
- Validación de estructura del body (GET y POST)
- Validación de respuesta vacía en DELETE
- 7/7 tests passing en Collection Runner

## Cómo usar
1. Importar `bootcamp-collection.json` en Postman
2. Importar `jsonplaceholder-environment.json` en Postman
3. Activar el entorno "JSONPlaceholder ENV"
4. Ejecutar la colección con Collection Runner
```

Guarda con `Ctrl + S`.

---

La estructura final debe ser:
```
03a-api-testing-postman\
├── README.md
├── bootcamp-collection.json
└── jsonplaceholder-environment.json