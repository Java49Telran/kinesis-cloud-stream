package telran.aws.kinesis;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KinesisProducerAppl {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext ctx = SpringApplication.run(KinesisProducerAppl.class, args);
		Thread.sleep(3000);
		ctx.close();

	}
	private int count = 1;
	@Bean
	Supplier<String> streamImitator() {
		return this::sendMessage;
	}
	String sendMessage() {
		return "message" + count++;
	}
}
