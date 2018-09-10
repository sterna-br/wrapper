/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper.pojo;

import java.util.ArrayList;
import static java.util.Collections.unmodifiableList;
import java.util.List;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author PauloGladson
 */
public class Features {

    private static final Logger LOG = getLogger(Features.class.getName());

    private String type = "FeatureCollection";
    private List<Feature> features = new ArrayList<>();

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
    public List<Feature> getFeatures() {
        return (features);
    }

    /**
     *
     * @param features
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

}
