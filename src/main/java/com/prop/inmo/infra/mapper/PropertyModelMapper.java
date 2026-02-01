package com.prop.inmo.infra.mapper;


import com.prop.inmo.core.domain.PropertyModel;
import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.infra.persistence.PropertyEntity;
import com.prop.inmo.infra.persistence.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyModelMapper {

    public PropertyEntity modelToPropertyEntity(PropertyModel propertyModel, UserEntity userEntity){

        return new PropertyEntity(
                propertyModel.id(),
                propertyModel.description(),
                propertyModel.yard(),
                propertyModel.bedroomCount(),
                userEntity

        );

    }

    public PropertyModel entityToPropertyModel(PropertyEntity propertyEntity){
            return new PropertyModel(
                    propertyEntity.getId(),
                    propertyEntity.getDescription(),
                    propertyEntity.getYard(),
                    propertyEntity.getBedroomCount(),
                    propertyEntity.getUserEntity().getId()

            );
    }

}
