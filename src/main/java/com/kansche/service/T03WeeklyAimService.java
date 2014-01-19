package com.kansche.service;

import com.kansche.entity.T03WeeklyAim;
import java.util.List;
import javax.annotation.Generated;

import static com.kansche.entity.T03WeeklyAimNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link T03WeeklyAim}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class T03WeeklyAimService extends AbstractService<T03WeeklyAim> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param year
     *            識別子
     * @param month
     *            識別子
     * @param week
     *            識別子
     * @return エンティティ
     */
    public T03WeeklyAim findById(Integer userId, String year, String month, String week) {
        return select().id(userId, year, month, week).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<T03WeeklyAim> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(year()), asc(month()), asc(week())).getResultList();
    }
}