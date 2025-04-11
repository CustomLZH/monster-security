package com.monster.security.core.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.monster.commons.beans.ResponseData;
import com.monster.security.core.bean.dto.*;
import com.monster.security.core.bean.entity.EnumerateData;
import com.monster.security.core.service.EnumerateService;
import com.monster.security.core.service.impl.EnumerateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LiuZhaoHong
 * @date 2025/3/9
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/enumerate")
public class EnumerateController {

    private final EnumerateService enumerateService;

    @PostMapping("/getEnumerateTypePage")
    public ResponseData<IPage<EnumerateTypeDTO>> getEnumerateType(@RequestBody EnumerateTypePageDTO params) {
        return ResponseData.succeed(enumerateService.getEnumerateTypePage(params));
    }
    @PostMapping("/saveEnumerateType")
    public ResponseData<Boolean> saveEnumerateType(@RequestBody EnumerateTypeSaveDTO params) {
        return ResponseData.succeed(enumerateService.saveEnumerateType(params));
    }
    @PostMapping("/saveEnumerateData")
    public ResponseData<Boolean> saveEnumerateData(@RequestBody EnumerateDataSaveDTO params) {
        return ResponseData.succeed(enumerateService.saveEnumerateData(params));
    }

    @PostMapping("/getEnumerateDataByType")
    public ResponseData<List<EnumerateDataDTO>> getEnumerateDataByType(@RequestParam("type") String type) {
        return ResponseData.succeed(enumerateService.getEnumerateDataByType(type));
    }

    @PostMapping("/deleteEnumerateType")
    public ResponseData<Boolean> deleteEnumerateType(@RequestParam("type") String type) {
        return ResponseData.succeed(enumerateService.deleteEnumerateType(type));
    }

    @PostMapping("/deleteEnumerateData")
    public ResponseData<Boolean> deleteEnumerateData(@RequestParam("id") Long id) {
        return ResponseData.succeed(enumerateService.deleteEnumerateData(id));
    }
    @PostMapping("/updateEnumerateDataSort")
    public ResponseData<Boolean> updateEnumerateDataSort(@RequestBody List<EnumerateDataSaveDTO> params) {
        return ResponseData.succeed(enumerateService.updateEnumerateDataSort(params));
    }

}
