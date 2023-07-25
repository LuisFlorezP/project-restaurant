package com.dish.servicedish.mapper;

import com.dish.servicedish.dtos.DishRequestDto;
import com.dish.servicedish.dtos.DishResponseDto;
import com.dish.servicedish.entity.DishEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DishMapper {

    DishRequestDto entityToRequest(DishEntity dishEntity);
    List<DishRequestDto> entitiesToRequests(List<DishEntity> dishesEntities);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "active", ignore = true)
    })
    DishEntity requestToEntity(DishRequestDto dishRequestDto);
    List<DishEntity> requestsToEntities(List<DishRequestDto> dishesRequestDto);

    DishResponseDto entityToResponse(DishEntity dishEntity);
    List<DishResponseDto> entitiesToResponses(List<DishEntity> dishesEntities);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "active", ignore = true)
    })
    DishEntity responseToEntity(DishResponseDto dishResponseDto);
    List<DishEntity> responsesToEntities(List<DishResponseDto> dishesResponseDto);
}
