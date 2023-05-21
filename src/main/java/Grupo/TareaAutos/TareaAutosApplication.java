package Grupo.TareaAutos;

import Grupo.TareaAutos.Model.Car;
import Grupo.TareaAutos.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareaAutosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TareaAutosApplication.class, args);
	}

	@Autowired
	private CarRepository carRepository;
	@Override
	public void run(String... args) throws Exception {

		Car car1 = new Car(1L, "marca1","2222","color1", 10000, false, "s", false, false, 0);
		Car car2 = new Car(2L, "marca2","2222","color2", 10000, false, "s", false, false, 0);
		Car car3 = new Car(3L, "marca3","2222","color3", 10000, false, "s", false, false, 0);
		Car car4 = new Car(4L, "marca4","2222","color4", 10000, false, "s", false, false, 0);
		Car car5 = new Car(5L, "marca5","2222","color5", 10000, false, "s", false, false, 0);

	}
}
