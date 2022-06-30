package com.zane.domain.factory;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author: ps
 * @since: 2022/6/30  8:29 PM
 * @version: 1.0.0
 * 用于标识领域对象
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public @interface DomainEntity {
}
