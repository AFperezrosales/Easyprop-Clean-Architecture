package com.prop.inmo.infra.persistence;

import com.prop.inmo.core.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;
import java.util.List;

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
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "phonenumber")
    private String phoneNumber;
    //entidad direccion enbbebida para poder agrupar esos datos que se van a usar juntos.

    @Enumerated(EnumType.STRING)
    @Column(name = "role", columnDefinition = "role_users")
    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    private UserRole role;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<PropertyEntity> propertyEntities;
}
