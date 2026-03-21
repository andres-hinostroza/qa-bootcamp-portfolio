# 04 - Performance Testing con JMeter

## Descripción
Pruebas de performance usando Apache JMeter 5.6.3 sobre la API pública JSONPlaceholder.

## Herramientas
- Apache JMeter 5.6.3
- JSONPlaceholder API (https://jsonplaceholder.typicode.com)

## Escenarios probados

### Escenario 1 — Carga Normal
| Parámetro | Valor |
|-----------|-------|
| Usuarios  | 50    |
| Ramp-up   | 10s   |
| Endpoint  | GET /users |

**Resultados:**
| Métrica | Valor |
|---------|-------|
| Average | 492ms |
| Min     | 201ms |
| Max     | 2148ms |
| Error % | 0.0%  |
| Throughput | 5.14/s |

### Escenario 2 — Carga Alta
| Parámetro | Valor |
|-----------|-------|
| Usuarios  | 200   |
| Ramp-up   | 20s   |
| Endpoint  | GET /posts |

**Resultados:**
| Métrica | Valor |
|---------|-------|
| Average | 366ms |
| Min     | 195ms |
| Max     | 1381ms |
| Error % | 0.0%  |
| Throughput | 9.47/s |

## Criterios de aceptación
- Error % < 1% ✅
- Average < 1000ms ✅
- Max < 3000ms ✅

## Conceptos cubiertos
- Thread Group: usuarios, ramp-up, loop count
- HTTP Request Sampler
- Listeners: View Results Tree, Summary Report
- Métricas: average, min, max, error %, throughput
- Ramp-up period vs carga instantánea

## Cómo ejecutar
1. Instalar Apache JMeter 5.6.3
2. Abrir `jsonplaceholder-load-test.jmx` en JMeter
3. Click en ▶ Play