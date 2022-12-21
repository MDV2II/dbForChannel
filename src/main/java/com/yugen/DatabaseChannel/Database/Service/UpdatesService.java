package com.yugen.DatabaseChannel.Database.Service;


import com.yugen.DatabaseChannel.Database.Entity.UpdatesEntity;
import com.yugen.DatabaseChannel.Database.Repository.UpdatesEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class UpdatesService {

    @Autowired
    private UpdatesEntityRepository updatesRepository;

    public UpdatesEntity save(UpdatesEntity updatesEntity) {
        return updatesRepository.save(updatesEntity);
    }
    public List<UpdatesEntity> getAll() {
        return updatesRepository.findAll();
    }

    public UpdatesEntity getLast() {
        List<UpdatesEntity> all = updatesRepository.findAll();
        Optional<UpdatesEntity> lastUpdate = all.stream().max(Comparator.comparing(UpdatesEntity::getUpdateId));
        return lastUpdate.get();
    }
    public void delete(UpdatesEntity updates) {
        updatesRepository.delete(updates);
    }
    public void deleteById(long id) {
        updatesRepository.deleteById(id);
    }

    public void deleteAll() {
        updatesRepository.deleteAll();
    }
}
