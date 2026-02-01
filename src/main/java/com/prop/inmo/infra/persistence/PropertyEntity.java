package com.prop.inmo.infra.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@Entity
@Table(name = "property_tb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String description;
    Boolean yard;
    Integer bedroomCount;
    @ManyToOne()
    @JoinColumn(name = "user_id" )
    UserEntity userEntity;


}
