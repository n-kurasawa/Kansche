package com.kansche.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * T03WeeklyAimエンティティクラス
 * 
 */
@Entity
@Table(name = "t03_weekly_aim")
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/12/23 16:50:29")
public class T03WeeklyAim implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(name = "user_id", precision = 10, nullable = false, unique = false)
    public Integer userId;

    /** yearプロパティ */
    @Id
    @Column(name = "year", length = 4, nullable = false, unique = false)
    public String year;

    /** monthプロパティ */
    @Id
    @Column(name = "month", length = 2, nullable = false, unique = false)
    public String month;

    /** weekプロパティ */
    @Id
    @Column(name = "week", length = 1, nullable = false, unique = false)
    public String week;

    /** aimプロパティ */
    @Column(name = "aim", length = 1024, nullable = true, unique = false)
    public String aim;

    /** resultsプロパティ */
    @Column(name = "results", precision = 10, nullable = true, unique = false)
    public Integer results;

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