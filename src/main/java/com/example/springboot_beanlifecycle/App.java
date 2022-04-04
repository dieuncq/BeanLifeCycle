package com.example.springboot_beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ConfigurationWarningsApplicationContextInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        //Tìm cô gái có id thỏa mãn trong csdl, yêu cầu tên cô gái phải viết hoa tất cả các kí tự (uppercase)
        GirlService girlService = context.getBean(GirlService.class);
        int id = 1;
        Girl girl = girlService.findGirlByUppercaseName(id);
        System.out.println(
                "Cô gái có id = " + id + " là: " + girl
        );
    }

}
