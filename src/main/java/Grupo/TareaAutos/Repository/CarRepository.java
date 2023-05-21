package Grupo.TareaAutos.Repository;

import Grupo.TareaAutos.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
