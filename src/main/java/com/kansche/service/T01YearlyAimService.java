package com.kansche.service;

import com.kansche.entity.T01YearlyAim;
import java.util.List;
import javax.annotation.Generated;

import static com.kansche.entity.T01YearlyAimNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link T01YearlyAim}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class T01YearlyAimService extends AbstractService<T01YearlyAim> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param year
     *            識別子
     * @return エンティティ
     */
    public T01YearlyAim findById(Integer userId, String year) {
        return select().id(userId, year).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<T01YearlyAim> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(year())).getResultList();
    }
}