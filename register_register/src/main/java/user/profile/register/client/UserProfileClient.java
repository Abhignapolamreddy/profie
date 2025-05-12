package user.profile.register.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import user.profile.register.request.UserDto;



@FeignClient(name = "user-profile-service", url = "http://localhost:8084")
public interface UserProfileClient {

    @PostMapping("/api/profiles")
	
    void createProfileFromUser(@RequestBody UserDto userDto);
		// TODO Auto-generated method stub
		
	
}
