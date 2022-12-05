package com.glop.mas_evenements.bo;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import javax.persistence.*;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_event", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;
    private String debut_event;
    private String fin_event;
    private String infos;
    private String datecreate;
    private String datemaj;
    private Integer statuscode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDebut_event() {
        return debut_event;
    }

    public void setDebut_event(String debut_event) {
        this.debut_event = debut_event;
    }

    public String getFin_event() {
        return fin_event;
    }

    public void setFin_event(String fin_event) {
        this.fin_event = fin_event;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    public String getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }

    public String getDatemaj() {
        return datemaj;
    }

    public void setDatemaj(String datemaj) {
        this.datemaj = datemaj;
    }

    public Integer getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }
}
