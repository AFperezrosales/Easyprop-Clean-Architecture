package com.prop.inmo.infra.gateway;


import com.prop.inmo.core.domain.PropertyModel;
import com.prop.inmo.core.gateway.PropertyGataway;
import com.prop.inmo.infra.exceptions.UserNotFoundException;
import com.prop.inmo.infra.mapper.PropertyModelMapper;
import com.prop.inmo.infra.persistence.PropertyEntity;
import com.prop.inmo.infra.persistence.PropertyRepository;
import com.prop.inmo.infra.persistence.UserEntity;
import com.prop.inmo.infra.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PropertyRepositoryGateway implements PropertyGataway {

    private final PropertyRepository propertyRepository;
    private final PropertyModelMapper propertyModelMapper;
    private final UserRepository userRepository;

    @Override
    public PropertyModel createProperty(PropertyModel propertyModel) {

        UserEntity user = userRepository.findById(propertyModel.userId()).orElseThrow(()-> new UserNotFoundException("User not found"));

       PropertyEntity prop = propertyModelMapper.modelToPropertyEntity(propertyModel, user );

       propertyRepository.save(prop);

        return propertyModelMapper.entityToPropertyModel(prop);
    }
}
