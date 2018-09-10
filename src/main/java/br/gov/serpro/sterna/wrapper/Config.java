/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper;

import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import org.demoiselle.jee.configuration.annotation.Configuration;

/**
 *
 * @author PauloGladson
 */
@Configuration(prefix = "sterna")
public class Config {

    private static final Logger LOG = getLogger(Config.class.getName());

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
