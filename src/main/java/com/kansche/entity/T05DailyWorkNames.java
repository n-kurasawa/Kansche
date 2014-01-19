package com.kansche.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link T05DailyWork}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/23 16:50:33")
public class T05DailyWorkNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
    }

    /**
     * workYmdのプロパティ名を返します。
     * 
     * @return workYmdのプロパティ名
     */
    public static PropertyName<String> workYmd() {
        return new PropertyName<String>("workYmd");
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
     * startTimeHのプロパティ名を返します。
     * 
     * @return startTimeHのプロパティ名
     */
    public static PropertyName<String> startTimeH() {
        return new PropertyName<String>("startTimeH");
    }

    /**
     * startTimeMのプロパティ名を返します。
     * 
     * @return startTimeMのプロパティ名
     */
    public static PropertyName<String> startTimeM() {
        return new PropertyName<String>("startTimeM");
    }

    /**
     * finishTimeHのプロパティ名を返します。
     * 
     * @return finishTimeHのプロパティ名
     */
    public static PropertyName<String> finishTimeH() {
        return new PropertyName<String>("finishTimeH");
    }

    /**
     * finishTimeMのプロパティ名を返します。
     * 
     * @return finishTimeMのプロパティ名
     */
    public static PropertyName<String> finishTimeM() {
        return new PropertyName<String>("finishTimeM");
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
    public static class _T05DailyWorkNames extends PropertyName<T05DailyWork> {

        /**
         * インスタンスを構築します。
         */
        public _T05DailyWorkNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _T05DailyWorkNames(final String name) {
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
        public _T05DailyWorkNames(final PropertyName<?> parent, final String name) {
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
         * workYmdのプロパティ名を返します。
         *
         * @return workYmdのプロパティ名
         */
        public PropertyName<String> workYmd() {
            return new PropertyName<String>(this, "workYmd");
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
         * startTimeHのプロパティ名を返します。
         *
         * @return startTimeHのプロパティ名
         */
        public PropertyName<String> startTimeH() {
            return new PropertyName<String>(this, "startTimeH");
        }

        /**
         * startTimeMのプロパティ名を返します。
         *
         * @return startTimeMのプロパティ名
         */
        public PropertyName<String> startTimeM() {
            return new PropertyName<String>(this, "startTimeM");
        }

        /**
         * finishTimeHのプロパティ名を返します。
         *
         * @return finishTimeHのプロパティ名
         */
        public PropertyName<String> finishTimeH() {
            return new PropertyName<String>(this, "finishTimeH");
        }

        /**
         * finishTimeMのプロパティ名を返します。
         *
         * @return finishTimeMのプロパティ名
         */
        public PropertyName<String> finishTimeM() {
            return new PropertyName<String>(this, "finishTimeM");
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