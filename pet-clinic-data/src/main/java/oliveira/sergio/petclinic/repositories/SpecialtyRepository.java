package oliveira.sergio.petclinic.repositories;

import oliveira.sergio.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
