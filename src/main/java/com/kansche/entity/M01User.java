package com.kansche.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * M01Userエンティティクラス
 * 
 */
@Entity
@Table(name = "m01_user")
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/12/23 16:50:29")
public class M01User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", precision = 10, nullable = false, unique = true)
    public Integer userId;

    /** userNameプロパティ */
    @Column(name = "user_name", length = 128, nullable = false, unique = false)
    public String userName;

    /** loginIdプロパティ */
    @Column(name = "login_id", length = 24, nullable = false, unique = false)
    public String loginId;

    /** passwordプロパティ */
    @Column(name = "password", length = 24, nullable = false, unique = false)
    public String password;

    /** adminFlgプロパティ */
    @Column(name = "admin_flg", precision = 10, nullable = false, unique = false)
    public Integer adminFlg;

    /** createdUserプロパティ */
    @Column(name = "created_user", length = 6, nullable = true, unique = false)
    public String createdUser;

    /** createdAtプロパティ */
    @Column(name = "created_at", nullable = true, unique = false)
    public Timestamp createdAt;

    /** updatedUserプロパティ */
    @Column(name = "updated_user", length = 6, nullable = true, unique = false)
    public String updatedUser;

    /** updatedAtプロパティ */
    @Column(name = "updated_at", nullable = true, unique = false)
    public Timestamp updatedAt;

    /** deleteFlgプロパティ */
    @Column(name = "delete_flg", precision = 10, nullable = false, unique = false)
    public Integer deleteFlg;
}