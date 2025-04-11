package com.monster.security.core.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.monster.security.core.bean.dto.*;
import com.monster.security.core.service.EnumerateDataService;
import com.monster.security.core.service.EnumerateService;
import com.monster.security.core.service.EnumerateTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/3/9
 */
@Service
@RequiredArgsConstructor
public class EnumerateServiceImpl implements EnumerateService {

    private final EnumerateDataService enumerateDataService;

    private final EnumerateTypeService enumerateTypeService;


    @Override
    public IPage<EnumerateTypeDTO> getEnumerateTypePage(EnumerateTypePageDTO params) {

        IPage<EnumerateTypeDTO> enumerateTypePage = enumerateTypeService.getEnumerateTypePage(params);

        return enumerateTypePage;

    }

    @Override
    public Boolean saveEnumerateType(EnumerateTypeSaveDTO params) {
        return enumerateTypeService.saveEnumerateType(params);
    }

    @Override
    public Boolean deleteEnumerateType(String type) {
        Boolean flagTypeDelete = enumerateTypeService.deleteEnumerateType(type);
        Boolean flagDataDelete = enumerateDataService.deleteEnumerateDataByType(type);
        return flagTypeDelete || flagDataDelete;
    }

    @Override
    public Boolean saveEnumerateData(EnumerateDataSaveDTO params) {
        return enumerateDataService.saveEnumerateData(params);
    }

    @Override
    public List<EnumerateDataDTO> getEnumerateDataByType(String type) {
        return enumerateDataService.getEnumerateDataByType(type);
    }

    @Override
    public Boolean deleteEnumerateData(Long id) {
        return enumerateDataService.deleteEnumerateData(id);
    }

    @Override
    public Boolean updateEnumerateDataSort(List<EnumerateDataSaveDTO> params) {
        return enumerateDataService.updateEnumerateDataSort(params);
    }
}
