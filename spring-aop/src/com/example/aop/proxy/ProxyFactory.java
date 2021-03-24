package com.example.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyFactory用来生成代理对象
 * 需要所有的参数：目标对象，增强
 *
 * @author ：wanxc
 * @date ：Created in 2021/3/24 22:12
 * @description：
 * 1、创建代理工厂
 * 2、给工厂设置目标对象、前置增强、后置增强
 * 3、调用creatProxy()得到代理对象
 * 4、执行代理对象方法时，先执行前置增强，然后是目标方法，最后是后置增强
 *
 */
public class ProxyFactory {
    // 目标对象
    private Object targetObject;
    // 前值增强
    private BeforeAdvice beforeAdvice;
    // 后置增强
    private AfterAdvice afterAdvice;

    /**
     * 生成代理对象
     *
     * @return
     */
    public Object creatProxy() {
        /**
         * 给出三个参数
         */
        // 加载器
        ClassLoader classLoader = this.getClass().getClassLoader();
        // 获取当前类型所实现的所有接口类型
        Class[] interfaces = targetObject.getClass().getInterfaces();
        // 调用处理器
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * 在调用代理对象的方法时，会执行这里的内容
                 */
                // 执行前置增强
                if (beforeAdvice != null) {
                    beforeAdvice.before();
                }
                // 调用目标对象的目标方法
                Object result = method.invoke(targetObject, args);
                // 执行后置增强
                if (afterAdvice != null) {
                    afterAdvice.after();
                }
                // 返回目标对象的返回值
                return result;
            }
        };
        /**
         * 2、得到代理对象
         */
        Object proxyObject = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return proxyObject;
    }

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public BeforeAdvice getBeforeAdvice() {
        return beforeAdvice;
    }

    public void setBeforeAdvice(BeforeAdvice beforeAdvice) {
        this.beforeAdvice = beforeAdvice;
    }

    public AfterAdvice getAfterAdvice() {
        return afterAdvice;
    }

    public void setAfterAdvice(AfterAdvice afterAdvice) {
        this.afterAdvice = afterAdvice;
    }
}
