package com.kansche.service;

import com.kansche.entity.T04DailyAim;
import java.util.List;
import javax.annotation.Generated;

import static com.kansche.entity.T04DailyAimNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link T04DailyAim}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class T04DailyAimService extends AbstractService<T04DailyAim> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param year
     *            識別子
     * @param month
     *            識別子
     * @param day
     *            識別子
     * @return エンティティ
     */
    public T04DailyAim findById(Integer userId, String year, String month, String day) {
        return select().id(userId, year, month, day).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<T04DailyAim> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(year()), asc(month()), asc(day())).getResultList();
    }
}