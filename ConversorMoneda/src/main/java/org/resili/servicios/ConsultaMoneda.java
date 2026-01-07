package org.resili.servicios;

import com.google.gson.Gson;
import org.resili.modelos.MonedaDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/2f636205d76282ffadebda13/pair/";
    private final HttpClient cliente;
    private final Gson gson;

    public ConsultaMoneda() {
        this.cliente = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public MonedaDTO buscarMoneda(String monedaBase, String monedaTarget) {
        String url = BASE_URL + monedaBase + "/" + monedaTarget;
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            MonedaDTO monedaDTO = gson.fromJson(respuesta.body(), MonedaDTO.class);
            if (monedaDTO == null || monedaDTO.base_code() == null || monedaDTO.target_code() == null) {
                throw new RuntimeException("No se encontró la moneda solicitada.");
            }
            return monedaDTO;
        } catch (IOException e) {
            throw new RuntimeException("No fue posible conectar con el servicio de tasas.", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("La consulta de tasas fue interrumpida.", e);
        }
    }
}
