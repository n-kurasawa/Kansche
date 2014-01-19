package com.kansche.service;

import com.kansche.entity.T06WeeklyWork;
import java.util.List;
import javax.annotation.Generated;

import static com.kansche.entity.T06WeeklyWorkNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link T06WeeklyWork}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class T06WeeklyWorkService extends AbstractService<T06WeeklyWork> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param mondayDate
     *            識別子
     * @return エンティティ
     */
    public T06WeeklyWork findById(Integer userId, String mondayDate) {
        return select().id(userId, mondayDate).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<T06WeeklyWork> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(mondayDate())).getResultList();
    }
}