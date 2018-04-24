package com.zgiot.common.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 用户会话上下文
 * Created by yc on 2017/3/25.
 */
@Component
public class SessionContext {
    private static final Logger logger = LoggerFactory.getLogger(SessionContext.class);

    private static ThreadLocal<CurrentUser> currentUserThreadLocal = new ThreadLocal<>();

    private SessionContext sessionContext;

    @PostConstruct
    public void init() {
        sessionContext = this;
    }

    /**
     * 设置会话
     * 每次请求server, 验证通过则将redis中当前用户信息加载到ThreadLocal
     * 供本次请求后续方法中使用
     *
     * @param currentUser
     */
    public static void setSession(CurrentUser currentUser) {
        currentUserThreadLocal.set(currentUser);
    }

    /**
     * 模拟session, 用于非登录情况
     * 一个语义化的方法, 作用域setSession完全一样
     *
     * @param currentUser
     */
    public static void mockSession(CurrentUser currentUser) {
        setSession(currentUser);
    }

    /**
     * 获取会话
     * 从ThreadLocal中获取会话
     *
     * @return
     */
    public static CurrentUser getCurrentUser() {
        return currentUserThreadLocal.get();
    }

    /**
     * 清除
     */
    public static void clear() {
        currentUserThreadLocal.remove();
    }
}
