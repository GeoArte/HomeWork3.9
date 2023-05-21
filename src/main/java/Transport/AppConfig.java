package Transport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBeen(){
        return new Car("BMW", "e36", 2000, "Germany", "Black", 200);
    }
    @Bean
    public Bus getBusBeen(){
        return  new Bus("Volkswagen", "Transporter T1", 1967, "USA", "Green", 110);
    }
    @Bean
    public Pickup getPickupBeen(){
        return new Pickup("Jeep", "Compass", 2014, "USA", "Blue", 201);
    }

}
