package concert;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
@ImportResource("classpath:audienceConcertConfig.xml")
public class ConcertConfig {


}