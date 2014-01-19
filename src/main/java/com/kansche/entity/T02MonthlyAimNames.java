package com.kansche.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link T02MonthlyAim}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/23 16:50:32")
public class T02MonthlyAimNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
    }

    /**
     * yearのプロパティ名を返します。
     * 
     * @return yearのプロパティ名
     */
    public static PropertyName<String> year() {
        return new PropertyName<String>("year");
    }

    /**
     * monthのプロパティ名を返します。
     * 
     * @return monthのプロパティ名
     */
    public static PropertyName<String> month() {
        return new PropertyName<String>("month");
    }

    /**
     * aimのプロパティ名を返します。
     * 
     * @return aimのプロパティ名
     */
    public static PropertyName<String> aim() {
        return new PropertyName<String>("aim");
    }

    /**
     * resultsのプロパティ名を返します。
     * 
     * @return resultsのプロパティ名
     */
    public static PropertyName<Integer> results() {
        return new PropertyName<Integer>("results");
    }

    /**
     * createdAtのプロパティ名を返します。
     * 
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Timestamp> createdAt() {
        return new PropertyName<Timestamp>("createdAt");
    }

    /**
     * updatedAtのプロパティ名を返します。
     * 
     * @return updatedAtのプロパティ名
     */
    public static PropertyName<Timestamp> updatedAt() {
        return new PropertyName<Timestamp>("updatedAt");
    }

    /**
     * deleteFlgのプロパティ名を返します。
     * 
     * @return deleteFlgのプロパティ名
     */
    public static PropertyName<Integer> deleteFlg() {
        return new PropertyName<Integer>("deleteFlg");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _T02MonthlyAimNames extends PropertyName<T02MonthlyAim> {

        /**
         * インスタンスを構築します。
         */
        public _T02MonthlyAimNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _T02MonthlyAimNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _T02MonthlyAimNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<Integer> userId() {
            return new PropertyName<Integer>(this, "userId");
        }

        /**
         * yearのプロパティ名を返します。
         *
         * @return yearのプロパティ名
         */
        public PropertyName<String> year() {
            return new PropertyName<String>(this, "year");
        }

        /**
         * monthのプロパティ名を返します。
         *
         * @return monthのプロパティ名
         */
        public PropertyName<String> month() {
            return new PropertyName<String>(this, "month");
        }

        /**
         * aimのプロパティ名を返します。
         *
         * @return aimのプロパティ名
         */
        public PropertyName<String> aim() {
            return new PropertyName<String>(this, "aim");
        }

        /**
         * resultsのプロパティ名を返します。
         *
         * @return resultsのプロパティ名
         */
        public PropertyName<Integer> results() {
            return new PropertyName<Integer>(this, "results");
        }

        /**
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Timestamp> createdAt() {
            return new PropertyName<Timestamp>(this, "createdAt");
        }

        /**
         * updatedAtのプロパティ名を返します。
         *
         * @return updatedAtのプロパティ名
         */
        public PropertyName<Timestamp> updatedAt() {
            return new PropertyName<Timestamp>(this, "updatedAt");
        }

        /**
         * deleteFlgのプロパティ名を返します。
         *
         * @return deleteFlgのプロパティ名
         */
        public PropertyName<Integer> deleteFlg() {
            return new PropertyName<Integer>(this, "deleteFlg");
        }
    }
}