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

        System.out.println("se calculara el precio final del automovil");
        return 0;}
}