package recipemanager.projekt.recipemanager.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import recipemanager.projekt.recipemanager.controller.AccessTokenValidationResponse;

@FeignClient(name = "user-service", url = "${application.config.users-url}")
public interface UserFeignClient {

    @PostMapping("/auth/check")
    AccessTokenValidationResponse validateAccessToken(@RequestHeader("Authorization") String jwtToken);
}