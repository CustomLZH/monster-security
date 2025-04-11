package com.monster.security.core.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.monster.security.core.bean.dto.*;

import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/3/9
 */
public interface EnumerateService {

    /**
     * 获取枚举类型分页
     * @param params 参数
     * @return {@link IPage }<{@link EnumerateTypeDTO }>
     */
    IPage<EnumerateTypeDTO> getEnumerateTypePage(EnumerateTypePageDTO params);

    /**
     * 保存枚举类型
     * @param params 参数
     * @return {@link Boolean }
     */
    Boolean saveEnumerateType(EnumerateTypeSaveDTO params);

    /**
     * 删除枚举类型
     * @param type 主键
     * @return {@link Boolean }
     */
    Boolean deleteEnumerateType(String type);

    /**
     * 保存枚举数据
     * @param params 参数
     * @return {@link Boolean }
     */
    Boolean saveEnumerateData(EnumerateDataSaveDTO params);

    /**
     * @param type
     * @return {@link List }<{@link EnumerateDataDTO }>
     */
    List<EnumerateDataDTO> getEnumerateDataByType(String type);

    /**
     * @param id
     * @return {@link Boolean }
     */
    Boolean deleteEnumerateData(Long id);

    /**
     * 更新枚举数据排序
     * @param params
     * @return {@link Boolean }
     */
    Boolean updateEnumerateDataSort(List<EnumerateDataSaveDTO> params);
}
