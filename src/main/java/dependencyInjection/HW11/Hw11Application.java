package dependencyInjection.HW11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Hw11Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Hw11Application.class, args);

		Player player = context.getBean(Player.class);
		player.printThreeSchedule();



	}

}
