package rouvt;

import rouvt.Lab10.ClientComponent;
import rouvt.Lab10.SingletonComponent;
import rouvt.Lab10.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab8 {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(rouvt.Lab8.class, args);
        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();
        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();


        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);

        c.operation();
        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();


    }
}