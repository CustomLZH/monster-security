package com.monster.security.core.convert;

import com.monster.security.core.bean.dto.EnumerateDataDTO;
import com.monster.security.core.bean.dto.EnumerateDataSaveDTO;
import com.monster.security.core.bean.entity.EnumerateData;
import liquibase.pro.packaged.E;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/4/11
 */
@Mapper
public interface EnumerateDataConvert {

    EnumerateDataConvert INSTANCE = Mappers.getMapper(EnumerateDataConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "enumerateType", target = "enumerateType")
    @Mapping(source = "enumerateLabel", target = "enumerateLabel")
    @Mapping(source = "enumerateKey", target = "enumerateKey")
    @Mapping(source = "enumerateSort", target = "enumerateSort")
    EnumerateData toEntity(EnumerateDataSaveDTO params);
    List<EnumerateData> toEntity(List<EnumerateDataSaveDTO> params);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "enumerateType", target = "enumerateType")
    @Mapping(source = "enumerateLabel", target = "enumerateLabel")
    @Mapping(source = "enumerateKey", target = "enumerateKey")
    @Mapping(source = "enumerateSort", target = "enumerateSort")
    EnumerateDataDTO toDTO(EnumerateData enumerateData);
    List<EnumerateDataDTO> toDTO(List<EnumerateData> enumerateData);
}
