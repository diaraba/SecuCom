package com.bezkoder.springjwt;

import com.bezkoder.springjwt.repository.RoleRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityJwtApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository repositoryRole;
	@Autowired
	private UserRepository repositoryUsers;
	public static void main(String[] args) {
    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (repositoryRole.findAll().size()==0){
			repositoryRole.creationRole();
		}
		if(repositoryUsers.findAll().size()==0){
			repositoryUsers.creationUsers();
		}
	}
}
