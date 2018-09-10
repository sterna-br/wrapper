/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper.dao;

import br.gov.serpro.sterna.wrapper.Config;
import br.gov.serpro.sterna.wrapper.pojo.Category;
import br.gov.serpro.sterna.wrapper.pojo.Features;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author PauloGladson
 */
@RequestScoped
public class Ways {

    @Inject
    private Config config;

    /**
     *
     * @return
     */
    public List listCategory() {
        HttpURLConnection c = null;
        try {
            URL u = new URL(config.getUrl() + "api/ways/category");
            c = (HttpURLConnection) u.openConnection();
            c.setRequestMethod("GET");
            c.setRequestProperty("Content-length", "0");
            c.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            c.setRequestProperty("Accept-Charset", "UTF-8");
            c.setUseCaches(false);
            c.setAllowUserInteraction(false);
            c.connect();
            int status = c.getResponseCode();

            switch (status) {
                case 200:
                case 201:
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream(), "UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    br.close();
                    return (new Gson().fromJson(sb.toString(), List.class));
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (c != null) {
                try {
                    c.disconnect();
                } catch (Exception ex) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return null;
    }

    /**
     *
     * @return
     */
    public List<Category> summary() {
        HttpURLConnection c = null;
        try {
            URL u = new URL(config.getUrl() + "api/ways/summary");
            c = (HttpURLConnection) u.openConnection();
            c.setRequestMethod("GET");
            c.setRequestProperty("Content-length", "0");
            c.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            c.setRequestProperty("Accept-Charset", "UTF-8");
            c.setUseCaches(false);
            c.setAllowUserInteraction(false);
            c.connect();
            int status = c.getResponseCode();

            switch (status) {
                case 200:
                case 201:
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream(), "UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    br.close();
                    return (new Gson().fromJson(sb.toString(), List.class));
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (c != null) {
                try {
                    c.disconnect();
                } catch (Exception ex) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return null;
    }

    /**
     *
     * @param value
     * @return
     */
    public List listGroup(String value) {
        return null;
    }

    /**
     *
     * @param lat
     * @param lng
     * @param rad
     * @return
     */
    public Features searchByGeo(Double lat, Double lng, Double rad) {
        return null;
    }

    /**
     *
     * @param category
     * @param lat
     * @param lng
     * @param rad
     * @return
     */
    public Features searchByCategory(String category, Double lat, Double lng, Double rad) {
        return null;
    }

    /**
     *
     * @param category
     * @param group
     * @param lat
     * @param lng
     * @param rad
     * @return
     */
    public Features searchByCategoryGroup(String category, String group, Double lat, Double lng, Double rad) {
        return null;
    }

    /**
     *
     * @param category
     * @param description
     * @return
     */
    public Features searchByCategoryDescription(String category, String description) {
        return null;
    }

    /**
     *
     * @param category
     * @param group
     * @param description
     * @return
     */
    public Features searchByCategoryGroupDescription(String category, String group, String description) {
        return null;
    }

    /**
     *
     * @param description
     * @return
     */
    public Features searchByDescription(String description) {
        return null;
    }

}
