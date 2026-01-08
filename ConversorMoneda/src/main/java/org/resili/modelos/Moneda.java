package org.resili.modelos;

public class Moneda {
    private final String codigoBase;
    private final String codigoDestino;
    private final double tasaDeConversion;

    public Moneda(MonedaDTO monedaDTO) {
        this.codigoBase = monedaDTO.base_code();
        this.codigoDestino = monedaDTO.target_code();
        this.tasaDeConversion = monedaDTO.conversion_rate();
    }

    public String getCodigoBase() {
        return codigoBase;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public double getTasaDeConversion() {
        return tasaDeConversion;
    }

    public double calcularConversion(double monto) {
        return monto * tasaDeConversion;
    }

    @Override
    public String toString() {
        return String.format("Tasa de %s a %s: %.4f", codigoBase, codigoDestino, tasaDeConversion);
    }
}
