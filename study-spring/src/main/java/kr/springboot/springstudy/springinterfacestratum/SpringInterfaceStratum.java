package kr.springboot.springstudy.springinterfacestratum;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigRegistry;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.ResolvableType;

public class SpringInterfaceStratum {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
    AnnotationConfigRegistry annotationConfigRegistry = new AnnotationConfigApplicationContext();
    GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
    BeanDefinitionRegistry beanDefinitionRegistry = new AnnotationConfigApplicationContext();

    /**
     * 추상화 단계에 들어왔고
     * getAutowireCapableBeanFactory를 사용해 @Autowire를 사용할 수 있게 됨.
     * BeanFactory를 상속한 AutowireCapableBeanFactory를 사용함.
     */
    AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext();

    // Application을 상속 하고 있음.
    ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext();

    // 스프링 컨테이너
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

    // ListableBeanFactory 는 구현 해야 한다
    ListableBeanFactory listableBeanFactory = new AnnotationConfigApplicationContext();
    // BeanFactory 를 상속 받고 있음.
    HierarchicalBeanFactory hierarchicalBeanFactory = new AnnotationConfigApplicationContext();
    // BeanFactory는 최상위 인터페이스임
    BeanFactory beanFactory = new BeanFactory() {
        @Override
        public Object getBean(String name) throws BeansException {
            return null;
        }

        @Override
        public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
            return null;
        }

        @Override
        public Object getBean(String name, Object... args) throws BeansException {
            return null;
        }

        @Override
        public <T> T getBean(Class<T> requiredType) throws BeansException {
            return null;
        }

        @Override
        public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
            return null;
        }

        @Override
        public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) {
            return null;
        }

        @Override
        public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
            return null;
        }

        @Override
        public boolean containsBean(String name) {
            return false;
        }

        @Override
        public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
            return false;
        }

        @Override
        public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
            return false;
        }

        @Override
        public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
            return false;
        }

        @Override
        public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
            return false;
        }

        @Override
        public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
            return null;
        }

        @Override
        public Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
            return null;
        }

        @Override
        public String[] getAliases(String name) {
            return new String[0];
        }
    };


}
