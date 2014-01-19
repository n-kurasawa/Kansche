package com.kansche.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link T01YearlyAim}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/23 16:50:32")
public class T01YearlyAimNames {

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
    public static PropertyName<String> results() {
        return new PropertyName<String>("results");
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
    public static class _T01YearlyAimNames extends PropertyName<T01YearlyAim> {

        /**
         * インスタンスを構築します。
         */
        public _T01YearlyAimNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _T01YearlyAimNames(final String name) {
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
        public _T01YearlyAimNames(final PropertyName<?> parent, final String name) {
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
        public PropertyName<String> results() {
            return new PropertyName<String>(this, "results");
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