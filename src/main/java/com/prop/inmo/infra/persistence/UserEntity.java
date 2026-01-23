package com.prop.inmo.infra.persistence;

import com.prop.inmo.core.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Entity
@Table(name ="user_tb")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;
    private String password;
    private Date birthdate;
    //entidad a la que se conecta en este caso seria la propiedad.
    private String name;
    private String lastName;
    private String phoneNumber;
    //entidad direccion enbbebida para poder agrupar esos datos que se van a usar juntos.
    @Enumerated(EnumType.STRING)
    private UserRole role;
}
