package oliveira.sergio.petclinic.service;

import oliveira.sergio.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
