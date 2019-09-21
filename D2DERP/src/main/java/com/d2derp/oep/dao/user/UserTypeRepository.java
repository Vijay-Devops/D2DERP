package com.d2derp.oep.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.d2derp.oep.entity.UserType;
import com.d2derp.oep.pojo.UserTypeModel;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType,Integer>
{

}
