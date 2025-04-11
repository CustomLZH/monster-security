package com.monster.security.core.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.monster.security.core.bean.dto.EnumerateTypeDTO;
import com.monster.security.core.bean.dto.EnumerateTypePageDTO;
import com.monster.security.core.bean.dto.EnumerateTypeSaveDTO;

/**
 * @author LiuZhaoHong
 * @date 2025/4/6
 */
public interface EnumerateTypeService {

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
}
