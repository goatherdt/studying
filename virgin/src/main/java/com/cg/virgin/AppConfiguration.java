package com.cg.virgin;

import com.cg.virgin.db.MyDataSource;
import org.springframework.context.annotation.*;

@Configuration("youConfig")
//@Profile("dev")
@ComponentScan("com.cg.virgin")
//@Scope()
public class AppConfiguration {

    @Bean
    public MyDataSource myDataSource(){
        return new MyDataSource();
    }
}
