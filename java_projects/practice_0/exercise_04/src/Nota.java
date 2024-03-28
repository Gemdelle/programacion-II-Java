public class Nota {
    // 01. ATTRIBUTES
    int numeroVendedor;
    int numeroProducto;
    int valorTotalProducto;

//      02. CONSTRUCTOR
    public Nota(int numeroVendedor, int numeroProducto, int valorTotalProducto) {
        this.numeroVendedor = numeroVendedor;
        this.numeroProducto = numeroProducto;
        this.valorTotalProducto = valorTotalProducto;
    }

//    03. SETTERS & GETTERS
    public int getNumeroVendedor() {
        return numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public int getValorTotalProducto() {
        return valorTotalProducto;
    }

    public void setValorTotalProducto(int valorTotalProducto) {
        this.valorTotalProducto = valorTotalProducto;
    }
}
