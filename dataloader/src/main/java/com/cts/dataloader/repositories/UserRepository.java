package com.cts.dataloader.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.dataloader.entitities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	@Query("select a from UserEntity a where a.username=?1")
	public Optional<UserEntity> findByUserName(String name);

}
