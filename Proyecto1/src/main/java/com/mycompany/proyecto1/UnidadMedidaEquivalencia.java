package com.mycompany.proyecto1;

import java.util.HashMap;
import java.util.Map;

public class UnidadMedidaEquivalencia {

    public enum TipoUnidad {
        VOLUMEN, PESO, CASERA
    }

    
    public enum Abreviaciones {
        MILILITRO("ml", 1.0, TipoUnidad.VOLUMEN),
        CENTILITRO("cl", 10.0, TipoUnidad.VOLUMEN),
        LITRO("l", 1000.0, TipoUnidad.VOLUMEN),
        CUCHARADITA("cdta", 5.0, TipoUnidad.VOLUMEN),
        CUCHARADA("cda", 15.0, TipoUnidad.VOLUMEN),
        TAZA("taza", 240.0, TipoUnidad.VOLUMEN),
        // Peso
        GRAMO("g", 1.0, TipoUnidad.PESO),
        KILOGRAMO("kg", 1000.0, TipoUnidad.PESO),
        ONZA("oz", 28.35, TipoUnidad.PESO),
        LIBRA("lb", 453.59, TipoUnidad.PESO),
        // Unidades caseras sin equivalencia precisa
        PIZCA("pizca", 0.5, TipoUnidad.CASERA),
        CHORRITO("chorrito", 2.0, TipoUnidad.CASERA);

        private final String abreviatura;
        private final double equivalencia;
        private final TipoUnidad tipo;

        // Constructor del enum
        Abreviaciones(String abreviatura, double equivalencia, TipoUnidad tipo) {
            this.abreviatura = abreviatura;
            this.equivalencia = equivalencia;
            this.tipo = tipo;
        }

        // Métodos getter
        public String getAbreviatura() {
            return abreviatura;
        }

        public double getEquivalencia() {
            return equivalencia;
        }

        public TipoUnidad getTipo() {
            return tipo;
        }
    }

    // hashmap {(clave, valor)}, no acepta claves repetidas
    private static final Map<String, Double> EQUIVALENCIAS = new HashMap<>();

    // Inicialización de equivalencias en el mapa
    static {
        EQUIVALENCIAS.put("ml", 1.0);
        EQUIVALENCIAS.put("cl", 10.0);
        EQUIVALENCIAS.put("l", 1000.0);
        EQUIVALENCIAS.put("cdta", 5.0);
        EQUIVALENCIAS.put("cda", 15.0);
        EQUIVALENCIAS.put("taza", 240.0);
        EQUIVALENCIAS.put("g", 1.0);
        EQUIVALENCIAS.put("kg", 1000.0);
        EQUIVALENCIAS.put("oz", 28.35);
        EQUIVALENCIAS.put("lb", 453.59);
        EQUIVALENCIAS.put("pizca", 0.5);
        EQUIVALENCIAS.put("chorrito", 2.0);
    }

    private String nombreEquivalenciaB;
    private String abreviacion;
    private TipoUnidad tipo;

    //Constructor para una unidad de medida
    public UnidadMedidaEquivalencia(String nombreEquivalenciaB, String abreviacion, TipoUnidad tipo) {
        this.nombreEquivalenciaB = nombreEquivalenciaB;
        this.abreviacion = abreviacion;
        this.tipo = tipo;
    }

    // Métodos de acceso
    public String getnombreEquivalenciaB() {
        return nombreEquivalenciaB;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public TipoUnidad getTipo() {
        return tipo;
    }

    // Método para convertir entre unidades
    public static double convertir(double cantidad, String origen, String destino) {
        if (!EQUIVALENCIAS.containsKey(origen) || !EQUIVALENCIAS.containsKey(destino)) {
            throw new IllegalArgumentException("Una de las unidades no es válida.");
        }
        return (cantidad * EQUIVALENCIAS.get(origen)) / EQUIVALENCIAS.get(destino);
    }

    public String getNombreEquivalenciaB() {
        return nombreEquivalenciaB;
    }

    public void setNombreEquivalenciaB(String nombreEquivalenciaB) {
        this.nombreEquivalenciaB = nombreEquivalenciaB;
    }
 
}
