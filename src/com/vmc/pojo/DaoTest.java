package com.vmc.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vmc.service.UserManagerService;

public class DaoTest {

	public static void main(String[] args){

        ApplicationContext context;
//        context = new ClassPathXmlApplicationContext(
//                          "classpath:../applicationContext.xml");
        context = new FileSystemXmlApplicationContext(
                "WebRoot/WEB-INF/applicationContext.xml");

        Object bean = context.getBean("login");
        System.out.println(bean);
        UserManagerService service = (UserManagerService)bean;

        User user = new User();
        user.setName("jhonxll12");
        user.setPassword("1");
        user.setEmail("***@****.com");
        
        service.addUser(user);

//        System.out.println(s.getName());

}

}
