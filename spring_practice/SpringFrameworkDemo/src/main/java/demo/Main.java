package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
    }
}
