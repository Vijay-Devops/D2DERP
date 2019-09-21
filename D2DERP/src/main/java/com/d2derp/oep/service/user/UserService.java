package com.d2derp.oep.service.user;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.d2derp.oep.entity.User;
import com.d2derp.oep.pojo.UserModel;

public interface UserService {
	void save( UserModel userModel);

	List<User> listUser();

	Optional<User> findById(int id);

	void deleteUser(int id);

	User editUser(User user);


}
