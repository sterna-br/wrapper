package br.gov.serpro.sterna.wrapper.pojo;

import static java.util.Collections.unmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author PauloGladson
 */
public class Properties {

    private static final Logger LOG = getLogger(Properties.class.getName());

    private String popupContent;
    private String group;
    private Long tstamp;
    private Integer vrs;
    private Map<String, String> tags = new HashMap<>();

    public String getPopupContent() {
        return popupContent;
    }

    public void setPopupContent(String popupContent) {
        this.popupContent = popupContent;
    }

    /**
     *
     * @return
     */
    public String getGroup() {
        return group;
    }

    /**
     *
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     *
     * @return
     */
    public Long getTstamp() {
        return tstamp;
    }

    /**
     *
     * @param tstamp
     */
    public void setTstamp(Long tstamp) {
        this.tstamp = tstamp;
    }

    /**
     *
     * @return
     */
    public Integer getVrs() {
        return vrs;
    }

    /**
     *
     * @param vrs
     */
    public void setVrs(Integer vrs) {
        this.vrs = vrs;
    }

    /**
     *
     * @return
     */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

}
