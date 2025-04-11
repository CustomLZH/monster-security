package com.monster.security.core.service;

import com.monster.security.core.bean.dto.EnumerateDataDTO;
import com.monster.security.core.bean.dto.EnumerateDataSaveDTO;

import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/4/11
 */
public interface EnumerateDataService {

    Boolean deleteEnumerateDataByType(String type);

    Boolean saveEnumerateData(EnumerateDataSaveDTO params);

    List<EnumerateDataDTO> getEnumerateDataByType(String type);

    Boolean deleteEnumerateData(Long id);

    Boolean updateEnumerateDataSort(List<EnumerateDataSaveDTO> params);
}
