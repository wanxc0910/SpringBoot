package com.example.aop.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 *
 * @author ：wanxc
 * @date ：Created in 2021/3/24 21:24
 * @description：
 */
public class ProxyTest {
    @Test
    public void test() {
        Class[] classes = {UserDao.class};

        /**
         * 三个参数
         * 1、ClassLoader
         * 方法需要动态生成一个类，这个类实现了UserDao接口，然后创建这个类的对象
         * 需要生成一个类，这个类也需要加载到方法区中，所以我们需要一个ClassLoader来加载该类
         *
         * 2、Class[] interfaces
         * 需要代理对象实现的数组
         *
         * 3、InvocationHandler
         * 调用处理器
         *
         * 代理对象实现的所有接口中的方法，内容都是调用InvocationHandler的invoke()方法
         */
        Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), classes, new MyProxyInvocationHandler(new UserDaoImpl()));

        UserDao userDao = (UserDao) obj;

        userDao.add();

        userDao.update();
    }

    /**
     * 创建类实现InvocationHandler
     */
    class MyProxyInvocationHandler implements InvocationHandler {

        private Object obj;

        // 有参构造注入
        public MyProxyInvocationHandler(Object obj) {
            this.obj = obj;
        }

        /**
         * 编写需要增强的逻辑
         *
         * @param proxy
         * @param method
         * @param args
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 前置增强
            System.out.println("执行" + method.getName() + "方法前");
            // 执行调用方法
            Object o = method.invoke(obj, args);

            if (method.getName().equals("add")) {
                System.out.println("执行" + method.getName() + "方法后，增强的特殊逻辑");
            }
            // 后置增强
            System.out.println("执行" + method.getName() + "方法后");

            return o;
        }
    }

    /**
     * 代理工厂测试
     */
    @Test
    public void testFactory() {
        ProxyFactory proxyFactory = new ProxyFactory();
        // 设置目标对象（需代理的对象）
        proxyFactory.setTargetObject(new UserDaoImpl());
        // 设置前置增强，可以不进行设置
        proxyFactory.setBeforeAdvice(new BeforeAdvice() {
            @Override
            public void before() {
                System.out.println("前置增强");
            }
        });
        // 设置后置增强，可以不进行设置
        proxyFactory.setAfterAdvice(new AfterAdvice() {
            @Override
            public void after() {
                System.out.println("后置增强");
            }
        });
        // 调用creatProxy()得到代理对象
        Object creatProxy = proxyFactory.creatProxy();
        // 代理对象强转
        UserDao userDao = (UserDao) creatProxy;
        // 执行需要增强的方法
        userDao.add();
    }
}
