package com.kansche.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link T06WeeklyWork}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/23 16:50:33")
public class T06WeeklyWorkNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
    }

    /**
     * mondayDateのプロパティ名を返します。
     * 
     * @return mondayDateのプロパティ名
     */
    public static PropertyName<String> mondayDate() {
        return new PropertyName<String>("mondayDate");
    }

    /**
     * scheduleのプロパティ名を返します。
     * 
     * @return scheduleのプロパティ名
     */
    public static PropertyName<String> schedule() {
        return new PropertyName<String>("schedule");
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
     * keepPointのプロパティ名を返します。
     * 
     * @return keepPointのプロパティ名
     */
    public static PropertyName<String> keepPoint() {
        return new PropertyName<String>("keepPoint");
    }

    /**
     * problemPointのプロパティ名を返します。
     * 
     * @return problemPointのプロパティ名
     */
    public static PropertyName<String> problemPoint() {
        return new PropertyName<String>("problemPoint");
    }

    /**
     * tryPointのプロパティ名を返します。
     * 
     * @return tryPointのプロパティ名
     */
    public static PropertyName<String> tryPoint() {
        return new PropertyName<String>("tryPoint");
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
    public static class _T06WeeklyWorkNames extends PropertyName<T06WeeklyWork> {

        /**
         * インスタンスを構築します。
         */
        public _T06WeeklyWorkNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _T06WeeklyWorkNames(final String name) {
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
        public _T06WeeklyWorkNames(final PropertyName<?> parent, final String name) {
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
         * mondayDateのプロパティ名を返します。
         *
         * @return mondayDateのプロパティ名
         */
        public PropertyName<String> mondayDate() {
            return new PropertyName<String>(this, "mondayDate");
        }

        /**
         * scheduleのプロパティ名を返します。
         *
         * @return scheduleのプロパティ名
         */
        public PropertyName<String> schedule() {
            return new PropertyName<String>(this, "schedule");
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
         * keepPointのプロパティ名を返します。
         *
         * @return keepPointのプロパティ名
         */
        public PropertyName<String> keepPoint() {
            return new PropertyName<String>(this, "keepPoint");
        }

        /**
         * problemPointのプロパティ名を返します。
         *
         * @return problemPointのプロパティ名
         */
        public PropertyName<String> problemPoint() {
            return new PropertyName<String>(this, "problemPoint");
        }

        /**
         * tryPointのプロパティ名を返します。
         *
         * @return tryPointのプロパティ名
         */
        public PropertyName<String> tryPoint() {
            return new PropertyName<String>(this, "tryPoint");
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