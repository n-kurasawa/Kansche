package com.kansche.entity;

import com.kansche.entity.M01UserNames._M01UserNames;
import com.kansche.entity.T01YearlyAimNames._T01YearlyAimNames;
import com.kansche.entity.T02MonthlyAimNames._T02MonthlyAimNames;
import com.kansche.entity.T03WeeklyAimNames._T03WeeklyAimNames;
import com.kansche.entity.T04DailyAimNames._T04DailyAimNames;
import com.kansche.entity.T05DailyWorkNames._T05DailyWorkNames;
import com.kansche.entity.T06WeeklyWorkNames._T06WeeklyWorkNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2012/12/23 16:50:33")
public class Names {

    /**
     * {@link M01User}の名前クラスを返します。
     * 
     * @return M01Userの名前クラス
     */
    public static _M01UserNames m01User() {
        return new _M01UserNames();
    }

    /**
     * {@link T01YearlyAim}の名前クラスを返します。
     * 
     * @return T01YearlyAimの名前クラス
     */
    public static _T01YearlyAimNames t01YearlyAim() {
        return new _T01YearlyAimNames();
    }

    /**
     * {@link T02MonthlyAim}の名前クラスを返します。
     * 
     * @return T02MonthlyAimの名前クラス
     */
    public static _T02MonthlyAimNames t02MonthlyAim() {
        return new _T02MonthlyAimNames();
    }

    /**
     * {@link T03WeeklyAim}の名前クラスを返します。
     * 
     * @return T03WeeklyAimの名前クラス
     */
    public static _T03WeeklyAimNames t03WeeklyAim() {
        return new _T03WeeklyAimNames();
    }

    /**
     * {@link T04DailyAim}の名前クラスを返します。
     * 
     * @return T04DailyAimの名前クラス
     */
    public static _T04DailyAimNames t04DailyAim() {
        return new _T04DailyAimNames();
    }

    /**
     * {@link T05DailyWork}の名前クラスを返します。
     * 
     * @return T05DailyWorkの名前クラス
     */
    public static _T05DailyWorkNames t05DailyWork() {
        return new _T05DailyWorkNames();
    }

    /**
     * {@link T06WeeklyWork}の名前クラスを返します。
     * 
     * @return T06WeeklyWorkの名前クラス
     */
    public static _T06WeeklyWorkNames t06WeeklyWork() {
        return new _T06WeeklyWorkNames();
    }
}