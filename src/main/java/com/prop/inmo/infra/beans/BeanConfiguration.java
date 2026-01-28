package com.prop.inmo.infra.beans;


import com.prop.inmo.core.gateway.UserGateway;
import com.prop.inmo.core.usecases.CreateUserUsecase;
import com.prop.inmo.core.usecases.CreateUserUsecaseImpl;
import com.prop.inmo.core.usecases.FindAllUsersUsecase;
import com.prop.inmo.core.usecases.FindAllUsersUsecaseImpl;
import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUserUsecase createUserUsecase(UserGateway userGateway){
       return new CreateUserUsecaseImpl(userGateway);
   }

   @Bean
    public FindAllUsersUsecase findAllUsersUsecase(UserGateway userGateway){
        return new FindAllUsersUsecaseImpl(userGateway);
   }
}
