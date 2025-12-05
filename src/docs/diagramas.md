classdiagram
Class PointOfSale {
+int id
+String name
}

    class PuntoDeVentaService {
        +List<PuntoDeVenta> getAll()
        +PuntoDeVenta add(PuntoDeVenta p)
        +PuntoDeVenta update(int id, PuntoDeVenta p)
        +void delete(int id)
    }

class Cost{

int IdA
int IdB
double Cost

}
class Acreditaciones {
+int importe
+int  idPuntoDeVenta
+date  fechaPedido
+String nombrePuntoVenta}
}

