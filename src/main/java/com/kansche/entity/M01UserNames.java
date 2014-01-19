package com.kansche.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link M01User}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/23 16:50:32")
public class M01UserNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
    }

    /**
     * userNameのプロパティ名を返します。
     * 
     * @return userNameのプロパティ名
     */
    public static PropertyName<String> userName() {
        return new PropertyName<String>("userName");
    }

    /**
     * loginIdのプロパティ名を返します。
     * 
     * @return loginIdのプロパティ名
     */
    public static PropertyName<String> loginId() {
        return new PropertyName<String>("loginId");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * adminFlgのプロパティ名を返します。
     * 
     * @return adminFlgのプロパティ名
     */
    public static PropertyName<Integer> adminFlg() {
        return new PropertyName<Integer>("adminFlg");
    }

    /**
     * createdUserのプロパティ名を返します。
     * 
     * @return createdUserのプロパティ名
     */
    public static PropertyName<String> createdUser() {
        return new PropertyName<String>("createdUser");
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
     * updatedUserのプロパティ名を返します。
     * 
     * @return updatedUserのプロパティ名
     */
    public static PropertyName<String> updatedUser() {
        return new PropertyName<String>("updatedUser");
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
    public static class _M01UserNames extends PropertyName<M01User> {

        /**
         * インスタンスを構築します。
         */
        public _M01UserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _M01UserNames(final String name) {
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
        public _M01UserNames(final PropertyName<?> parent, final String name) {
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
         * userNameのプロパティ名を返します。
         *
         * @return userNameのプロパティ名
         */
        public PropertyName<String> userName() {
            return new PropertyName<String>(this, "userName");
        }

        /**
         * loginIdのプロパティ名を返します。
         *
         * @return loginIdのプロパティ名
         */
        public PropertyName<String> loginId() {
            return new PropertyName<String>(this, "loginId");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * adminFlgのプロパティ名を返します。
         *
         * @return adminFlgのプロパティ名
         */
        public PropertyName<Integer> adminFlg() {
            return new PropertyName<Integer>(this, "adminFlg");
        }

        /**
         * createdUserのプロパティ名を返します。
         *
         * @return createdUserのプロパティ名
         */
        public PropertyName<String> createdUser() {
            return new PropertyName<String>(this, "createdUser");
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
         * updatedUserのプロパティ名を返します。
         *
         * @return updatedUserのプロパティ名
         */
        public PropertyName<String> updatedUser() {
            return new PropertyName<String>(this, "updatedUser");
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