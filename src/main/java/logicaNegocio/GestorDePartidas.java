/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.io.*;
import java.util.HashMap;

public class GestorDePartidas {
    private static final String ARCHIVO_DATOS = "partidas.dat";
    private HashMap<String, String> partidas;

    public GestorDePartidas() {
        partidas = cargarPartidas();
    }

    private HashMap<String, String> cargarPartidas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_DATOS))) {
            return (HashMap<String, String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new HashMap<>(); // Si no existe el archivo, crea un nuevo mapa
        }
    }

    public void guardarPartida(String espacio, String datos) {
        partidas.put(espacio, datos);
        guardarEnArchivo();
    }

    public String cargarPartida(String espacio) {
        return partidas.getOrDefault(espacio, "Espacio vacío");
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_DATOS))) {
            oos.writeObject(partidas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

