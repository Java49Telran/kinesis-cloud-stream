package telran.aws.kinesis;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KinesisConsumerAppl {

	public static void main(String[] args) {
		SpringApplication.run(KinesisConsumerAppl.class, args);

	}
	@Bean
	Consumer<String> streamConsumer() {
		return message -> System.out.println(message);
	}

}
