package com.glop.mas_evenements.bo;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import javax.persistence.*;

@Entity
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_comp", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id_comp;
    private String libelle_comp;

    private String olympic_best;
    private String world_best;
    private String infos;
    private String datecreate;
    private String datemaj;
    private Integer statuscode;

    @OneToOne
    @JoinColumn(name = "id_cat_id_cat")//TODO A corriger
    private Categorie id_cat;

    public Categorie getId_cat() {
        return id_cat;
    }

    public void setId_cat(Categorie id_cat) {
        this.id_cat = id_cat;
    }

    public Long getId_comp() {
        return id_comp;
    }

    public void setId_comp(Long id_comp) {
        this.id_comp = id_comp;
    }

    public String getLibelle_comp() {
        return libelle_comp;
    }

    public void setLibelle_comp(String libelle_comp) {
        this.libelle_comp = libelle_comp;
    }

    public String getOlympic_best() {
        return olympic_best;
    }

    public void setOlympic_best(String olympic_best) {
        this.olympic_best = olympic_best;
    }

    public String getWorld_best() {
        return world_best;
    }

    public void setWorld_best(String world_best) {
        this.world_best = world_best;
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
