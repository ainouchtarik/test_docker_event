package com.glop.mas_evenements.bo;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cat", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id_cat;
    private String libelle_cat;
    private String datecreate;
    private String datemaj;
    private int statuscode;


}
