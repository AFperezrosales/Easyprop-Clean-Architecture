package com.prop.inmo.infra.beans;


import com.prop.inmo.core.gateway.UserGateway;
import com.prop.inmo.core.usecases.*;
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

   @Bean
    public FindUserByIdUsecase findUserByIdUsecase(UserGateway userGateway){
        return new FindUserByIdUsecaseImpl(userGateway);
   }
}
