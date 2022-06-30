package com.zane.domain.factory;

/**
 * @author: ps
 * @since: 2022/6/30  3:41 PM
 * @version: 1.0.0
 */
public class DomainFactory<T> {

    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

}
