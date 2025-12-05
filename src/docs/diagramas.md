#DIAGRAMAS
```mermaid
classDiagram


class PuntoVenta {
+Integer id
+String nombre
}


class Acreditacion {
+Long id
+BigDecimal importe
+Integer idPuntoVenta
+String nombrePuntoVenta
+LocalDateTime fechaRecepcion
}


class CachePuntosVenta {
-ConcurrentHashMap<Integer,PuntoVenta> cache
+getAll()
+get(id)
+add(pv)
+update(id,pv)
+delete(id)
}


class CacheCostos {
-ConcurrentHashMap<Integer, ConcurrentHashMap<Integer,Integer>> costos
+addCosto(idA,idB,costo)
+removeCosto(idA,idB)
+vecinos(idA)
+caminoMinimo(idA,idB)
}
```
```mermaid
classDiagram
#Controllers#
class PuntoVentaController {
+getAll()
+create(req)
+update(id,req)
+delete(id)
}


classDiagram
class CostosController {
+add(req)
+delete(idA,idB)
+vecinos(id)
+caminoMinimo(idA,idB)
}


class AcreditacionController {
+crear(req)
+listar()
}
```markdown
#Services#

#Repository
```mermaid
class AcreditacionRepository {
<<interface>>
+save(a)
+findAll()
}
```
```mermaid

##DIAGRAMA BBDD##

erDiagram
    ACREDITACIONES {
        BIGINT id PK
        DECIMAL importe
        INT idPuntoVenta
        VARCHAR nombrePuntoVenta
        TIMESTAMP fechaRecepcion
    }