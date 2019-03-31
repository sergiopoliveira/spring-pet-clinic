package oliveira.sergio.petclinic.repositories;

import oliveira.sergio.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
