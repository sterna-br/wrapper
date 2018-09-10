/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper.pojo;

import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author PauloGladson
 */
public class Feature {

    private static final Logger LOG = getLogger(Feature.class.getName());

    private String type = "Feature";
    private Properties properties = new Properties();
    private Object geometry;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     *
     * @param properties
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     *
     * @return
     */
    public Object getGeometry() {
        return geometry;
    }

    /**
     *
     * @param geometry
     */
    public void setGeometry(Object geometry) {
        this.geometry = geometry;
    }

}
