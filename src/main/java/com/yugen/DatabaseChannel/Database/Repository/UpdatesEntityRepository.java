package com.yugen.DatabaseChannel.Database.Repository;


import com.yugen.DatabaseChannel.Database.Entity.UpdatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdatesEntityRepository extends JpaRepository<UpdatesEntity, Long> {
}