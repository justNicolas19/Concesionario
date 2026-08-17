public class CamionCarga extends Vehiculo{
    private double capacidadToneladas;

    public CamionCarga(String placa, String marca, String modelo, int anio, double precioBase, double capacidadToneladas) {
        super(placa, marca, modelo, anio, precioBase);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Este metodo es para calcular el precio final del camion de carga");
        return 0;
    }


}
