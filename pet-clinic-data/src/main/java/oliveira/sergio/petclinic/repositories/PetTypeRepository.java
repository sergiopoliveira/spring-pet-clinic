package oliveira.sergio.petclinic.repositories;

import oliveira.sergio.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
