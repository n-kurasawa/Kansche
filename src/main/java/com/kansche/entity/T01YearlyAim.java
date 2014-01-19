package com.kansche.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * T01YearlyAimエンティティクラス
 * 
 */
@Entity
@Table(name = "t01_yearly_aim")
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/12/23 16:50:29")
public class T01YearlyAim implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(name = "user_id", precision = 10, nullable = false, unique = false)
    public Integer userId;

    /** yearプロパティ */
    @Id
    @Column(name = "year", length = 4, nullable = false, unique = false)
    public String year;

    /** aimプロパティ */
    @Column(name = "aim", length = 1024, nullable = true, unique = false)
    public String aim;

    /** resultsプロパティ */
    @Column(name = "results", length = 1, nullable = true, unique = false)
    public String results;

    /** createdAtプロパティ */
    @Column(name = "created_at", nullable = true, unique = false)
    public Timestamp createdAt;

    /** updatedAtプロパティ */
    @Column(name = "updated_at", nullable = true, unique = false)
    public Timestamp updatedAt;

    /** deleteFlgプロパティ */
    @Column(name = "delete_flg", precision = 10, nullable = false, unique = false)
    public Integer deleteFlg;
}