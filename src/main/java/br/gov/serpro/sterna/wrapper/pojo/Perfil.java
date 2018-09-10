package br.gov.serpro.sterna.wrapper.pojo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author PauloGladson
 */
public enum Perfil {

    /**
     *
     */
    ADMINISTRADOR("Administrador"),

    /**
     *
     */
    GERENTE("Gerente"),

    /**
     *
     */
    USUARIO("Usuario"),

    /**
     *
     */
    VISITANTE("Visitante");

    private final String value;

    private Perfil(String value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return this.value;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.value;
    }

    /**
     *
     * @return
     */
    public static Map getMap() {
        Map<Perfil, String> map = new ConcurrentHashMap<>();
        for (Perfil userType : Perfil.values()) {
            map.put(userType, userType.toString());
        }
        return map;
    }

}
