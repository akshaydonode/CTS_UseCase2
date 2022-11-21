package com.cts.dataloader.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.dataloader.entitities.RoleMasterEntity;

@Repository
public interface RoleMasterRepository extends JpaRepository<RoleMasterEntity, Integer> {

	@Query("select r from RoleMasterEntity r where r.roleName=?1")
	Optional<RoleMasterEntity> findRoleByRoleName(String roleName);

	
}
