package docvel.homework2;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    StdRepo repository(){
        return new StdRepo();
    }
}
