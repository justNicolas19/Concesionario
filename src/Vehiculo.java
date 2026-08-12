public class Vehiculo {
    protected String Placa;
    protected String Marca;
    protected String Modelo;
    protected String Anyo;
    protected String PrecioBase;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, String anyo, String precioBase) {
        Placa = placa;
        Marca = marca;
        Modelo = modelo;
        Anyo = anyo;
        PrecioBase = precioBase;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getAnyo() {
        return Anyo;
    }

    public void setAnyo(String anyo) {
        Anyo = anyo;
    }

    public String getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(String precioBase) {
        PrecioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Placa='" + Placa + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Anyo='" + Anyo + '\'' +
                ", PrecioBase='" + PrecioBase + '\'' +
                '}';
    }
}
