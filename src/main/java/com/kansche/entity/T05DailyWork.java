package com.kansche.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * T05DailyWorkエンティティクラス
 * 
 */
@Entity
@Table(name = "t05_daily_work")
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/12/23 16:50:29")
public class T05DailyWork implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(name = "user_id", precision = 10, nullable = false, unique = false)
    public Integer userId;

    /** workYmdプロパティ */
    @Id
    @Column(name = "work_ymd", length = 8, nullable = false, unique = false)
    public String workYmd;

    /** scheduleプロパティ */
    @Column(name = "schedule", length = 1024, nullable = true, unique = false)
    public String schedule;

    /** resultsプロパティ */
    @Column(name = "results", length = 1024, nullable = true, unique = false)
    public String results;

    /** keepPointプロパティ */
    @Column(name = "keep_point", length = 1024, nullable = true, unique = false)
    public String keepPoint;

    /** problemPointプロパティ */
    @Column(name = "problem_point", length = 1024, nullable = true, unique = false)
    public String problemPoint;

    /** tryPointプロパティ */
    @Column(name = "try_point", length = 1024, nullable = true, unique = false)
    public String tryPoint;

    /** startTimeHプロパティ */
    @Column(name = "start_time_h", length = 2, nullable = true, unique = false)
    public String startTimeH;

    /** startTimeMプロパティ */
    @Column(name = "start_time_m", length = 2, nullable = true, unique = false)
    public String startTimeM;

    /** finishTimeHプロパティ */
    @Column(name = "finish_time_h", length = 2, nullable = true, unique = false)
    public String finishTimeH;

    /** finishTimeMプロパティ */
    @Column(name = "finish_time_m", length = 2, nullable = true, unique = false)
    public String finishTimeM;

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