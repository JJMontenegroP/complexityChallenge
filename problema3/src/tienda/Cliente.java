package tienda;

public class Cliente {
    private String tipo;
    private String nombre;

    public Cliente(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int aplicarDescuento(int total) {
        switch (tipo) {
            case "Premium":
                return (int) (total * 0.9);
            case "VIP":
                return (int) (total * 0.8);
            default:
                return total;
        }
    }
}
