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
public class Category {

    private static final Logger LOG = getLogger(Category.class.getName());

    private String description;
    private Integer groups;
    private List list = new ArrayList<>();

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public Integer getGroups() {
        return groups;
    }

    /**
     *
     * @param groups
     */
    public void setGroups(Integer groups) {
        this.groups = groups;
    }

    /**
     *
     * @return
     */
    public List getList() {
        return (list);
    }

    /**
     *
     * @param list
     */
    public void setList(List list) {
        this.list = list;
    }

}
