package com.zane.domain.factory;

/**
 * @author: ps
 * @since: 2022/6/30  3:41 PM
 * @version: 1.0.0
 */
public class DomainFactory<T>{

    public static <T> T get(Class<T> entityClz){
        return ApplicationContextHelper.getBean(entityClz);
    }
}
