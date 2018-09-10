/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper.dao;

import br.gov.serpro.sterna.wrapper.Config;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author PauloGladson
 */
@RequestScoped
public class Tiles {

    @Inject
    private Config config;

    /**
     *
     * @param type
     * @param zoom
     * @param coluna
     * @param linha
     * @return
     */
    public byte[] getTile(String type, Integer zoom, Integer coluna, Integer linha) {

        return null;
    }

    /**
     *
     * @param lat
     * @param lon
     * @param zoom
     * @return
     */
    public String parserToXYZ(final double lat, final double lon, final int zoom) {
        return null;
    }
}
