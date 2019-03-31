package oliveira.sergio.petclinic.repositories;

import oliveira.sergio.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
