classDiagram

%% =================== MODELOS ===================
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

%% =================== CACHES ===================
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

class Camino {
+List<Integer> path
+int costo
}

%% =================== CONTROLLERS ===================
class PuntoVentaController {
+getAll()
+create(req)
+update(id,req)
+delete(id)
}

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

%% =================== REPOSITORY ===================
class AcreditacionRepository {
<<interface>>
+save(a)
+findAll()
}

%% ======= CONEXIONES =======
PuntoVentaController --> CachePuntosVenta : usa
CostosController --> CacheCostos : usa
AcreditacionController --> CachePuntosVenta : valida PV
AcreditacionController --> AcreditacionRepository : guarda en BD

CachePuntosVenta --> PuntoVenta : contiene
AcreditacionRepository --> Acreditacion : persiste
CacheCostos --> Camino : genera camino mínimo

%% ======= CONEXIONES =======
PuntoVentaController --> CachePuntosVenta : usa
CostosController --> CacheCostos : usa
AcreditacionController --> CachePuntosVenta : valida PV
AcreditacionController --> AcreditacionRepository : guarda en BD

CachePuntosVenta --> PuntoVenta : contiene
AcreditacionRepository --> Acreditacion : persiste
CacheCostos --> Camino : genera camino mínimo
```