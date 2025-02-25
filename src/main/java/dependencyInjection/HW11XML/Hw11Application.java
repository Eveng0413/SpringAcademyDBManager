package dependencyInjection.HW11XML;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Hw11Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Player player = context.getBean("player", Player.class);
		System.out.println("XML: ");
		player.printThreeSchedule();

		((ClassPathXmlApplicationContext)context).close();


	}

}
