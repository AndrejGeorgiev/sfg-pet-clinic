package andrej.springframework.sfgpetclinic.service.map;

import andrej.springframework.sfgpetclinic.model.Vet;
import andrej.springframework.sfgpetclinic.service.CrudService;
import andrej.springframework.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}