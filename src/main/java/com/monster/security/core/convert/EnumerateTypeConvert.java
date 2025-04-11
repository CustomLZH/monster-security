package com.monster.security.core.convert;

import com.monster.security.core.bean.dto.EnumerateTypeDTO;
import com.monster.security.core.bean.dto.EnumerateTypeSaveDTO;
import com.monster.security.core.bean.entity.EnumerateType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/4/6
 */
@Mapper
public interface EnumerateTypeConvert {

    EnumerateTypeConvert INSTANCE = Mappers.getMapper(EnumerateTypeConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "enumerateType", target = "enumerateType")
    @Mapping(source = "enumerateName", target = "enumerateName")
    @Mapping(source = "remark", target = "remark")
    @Mapping(source = "createId", target = "createId")
    @Mapping(source = "createName", target = "createName")
    @Mapping(source = "createDate", target = "createDate")
    @Mapping(source = "updateId", target = "updateId")
    @Mapping(source = "updateName", target = "updateName")
    @Mapping(source = "updateDate", target = "updateDate")
    EnumerateTypeDTO toDTO(EnumerateType entity);
    List<EnumerateTypeDTO> toDTO(List<EnumerateType> entityList);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "enumerateType", target = "enumerateType")
    @Mapping(source = "enumerateName", target = "enumerateName")
    @Mapping(source = "remark", target = "remark")
    EnumerateType toEntity(EnumerateTypeSaveDTO params);
}
