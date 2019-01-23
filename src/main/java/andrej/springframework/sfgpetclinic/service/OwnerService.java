package andrej.springframework.sfgpetclinic.service;

import andrej.springframework.sfgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);


}