package com.monster.security.core.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.monster.commons.service.BaseService;
import com.monster.security.core.bean.dto.EnumerateDataDTO;
import com.monster.security.core.bean.dto.EnumerateDataSaveDTO;
import com.monster.security.core.bean.entity.EnumerateData;
import com.monster.security.core.convert.EnumerateDataConvert;
import com.monster.security.core.mapper.EnumerateDataMapper;
import com.monster.security.core.service.EnumerateDataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/4/11
 */
@Service
public class EnumerateDataServiceImpl extends BaseService<EnumerateDataMapper, EnumerateData> implements EnumerateDataService {

    @Override
    public Boolean deleteEnumerateDataByType(String type) {
        if (ObjectUtil.isEmpty(type)) {
            return false;
        }
        LambdaUpdateWrapper<EnumerateData> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.eq(EnumerateData::getEnumerateType, type);
        return baseMapper.delete(updateWrapper) > 0;
    }

    @Override
    public Boolean saveEnumerateData(EnumerateDataSaveDTO params) {
        EnumerateData enumerateType = EnumerateDataConvert.INSTANCE.toEntity(params);
        return baseMapper.insertOrUpdate(enumerateType);
    }

    @Override
    public List<EnumerateDataDTO> getEnumerateDataByType(String type) {
        LambdaQueryWrapper<EnumerateData> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(EnumerateData::getEnumerateType, type);
        queryWrapper.orderByAsc(EnumerateData::getEnumerateSort);
        List<EnumerateData> enumerateData = baseMapper.selectList(queryWrapper);
        return EnumerateDataConvert.INSTANCE.toDTO(enumerateData);
    }

    @Override
    public Boolean deleteEnumerateData(Long id) {
        return baseMapper.deleteById(id) > 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean updateEnumerateDataSort(List<EnumerateDataSaveDTO> params) {
        List<EnumerateData> entity = EnumerateDataConvert.INSTANCE.toEntity(params);
        for (EnumerateData enumerateData : entity) {
            baseMapper.updateById(enumerateData);
        }
        return true;
    }
}
