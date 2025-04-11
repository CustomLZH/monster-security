package com.monster.security.core.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monster.commons.service.BaseService;
import com.monster.security.core.bean.dto.EnumerateTypeDTO;
import com.monster.security.core.bean.dto.EnumerateTypePageDTO;
import com.monster.security.core.bean.dto.EnumerateTypeSaveDTO;
import com.monster.security.core.bean.entity.EnumerateType;
import com.monster.security.core.convert.EnumerateTypeConvert;
import com.monster.security.core.mapper.EnumerateTypeMapper;
import com.monster.security.core.service.EnumerateTypeService;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

/**
 * @author LiuZhaoHong
 * @date 2025/4/6
 */
@Service
public class EnumerateTypeServiceImpl extends BaseService<EnumerateTypeMapper, EnumerateType> implements EnumerateTypeService {

    @Override
    public IPage<EnumerateTypeDTO> getEnumerateTypePage(EnumerateTypePageDTO params) {
        Page<EnumerateType> page = new Page<>(params.getCurrent(), params.getSize());
        LambdaQueryWrapper<EnumerateType> queryWrapper = Wrappers.lambdaQuery();
        Page<EnumerateType> enumerateTypePage = baseMapper.selectPage(page, queryWrapper);
        Page<EnumerateTypeDTO> result = new Page<>();
        result.setRecords(EnumerateTypeConvert.INSTANCE.toDTO(enumerateTypePage.getRecords()));
        result.setTotal(enumerateTypePage.getTotal());
        result.setCurrent(enumerateTypePage.getCurrent());
        result.setSize(enumerateTypePage.getSize());
        return result;
    }

    @Override
    public Boolean saveEnumerateType(EnumerateTypeSaveDTO params) {
        EnumerateType enumerateType = EnumerateTypeConvert.INSTANCE.toEntity(params);
        return baseMapper.insertOrUpdate(enumerateType);
    }

    @Override
    public Boolean deleteEnumerateType(String type) {
        if (ObjectUtil.isEmpty(type)) {
            return false;
        }
        LambdaUpdateWrapper<EnumerateType> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.eq(EnumerateType::getEnumerateType, type);
        return baseMapper.delete(updateWrapper) > 0;
    }
}
