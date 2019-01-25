package andrej.springframework.sfgpetclinic.service.map;

import andrej.springframework.sfgpetclinic.model.Owner;
import andrej.springframework.sfgpetclinic.service.CrudService;
import andrej.springframework.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}