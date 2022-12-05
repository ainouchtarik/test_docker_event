package com.glop.mas_evenements.bo;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import javax.persistence.*;

@Entity
public class Epreuve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_epreuve", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    private String libelle_epreuve;
    private boolean finale;

    private String debut_epreuve;
    private String datecreate;
    private String datemaj;
    private Integer statuscode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
