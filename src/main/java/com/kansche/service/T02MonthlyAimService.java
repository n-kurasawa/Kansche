package com.kansche.service;

import com.kansche.entity.T02MonthlyAim;
import java.util.List;
import javax.annotation.Generated;

import static com.kansche.entity.T02MonthlyAimNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link T02MonthlyAim}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class T02MonthlyAimService extends AbstractService<T02MonthlyAim> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param year
     *            識別子
     * @param month
     *            識別子
     * @return エンティティ
     */
    public T02MonthlyAim findById(Integer userId, String year, String month) {
        return select().id(userId, year, month).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<T02MonthlyAim> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(year()), asc(month())).getResultList();
    }
}