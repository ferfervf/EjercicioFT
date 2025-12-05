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