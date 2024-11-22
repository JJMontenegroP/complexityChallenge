package tienda;

public class Tienda {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Producto libro1 = new Producto("libro1", 20000);
        Producto libro2 = new Producto("libro2", 30000);

        Producto[] productos = {libro1, libro2};

        Cliente cliente1 = new Cliente("Normal", "Jose");
        Cliente cliente2 = new Cliente("Premium", "Juan");
        Cliente cliente3 = new Cliente("VIP", "Pedro");

        tienda.imprimirRecibo(productos, cliente1);
        tienda.imprimirRecibo(productos, cliente2);
        tienda.imprimirRecibo(productos, cliente3);
    }

    public void imprimirRecibo(Producto[] productos, Cliente cliente) {
        int total = calcularTotal(productos);
        total = cliente.aplicarDescuento(total);
        System.out.println("Total para " + cliente.getNombre() + ": " + total);
    }

    private int calcularTotal(Producto[] productos) {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}