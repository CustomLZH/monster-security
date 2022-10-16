package com.monster.security;

import com.monster.commons.generate.enums.ClassAnnotationVerifyEnum;
import com.monster.commons.generate.enums.ColumnAnnotationVerifyEnum;
import com.monster.commons.generate.enums.ConvertTypeEnum;
import com.monster.commons.generate.enums.ImportVerifyEnum;
import com.monster.commons.generate.service.impl.ConfigureInfoServiceImpl;
import com.monster.commons.generate.util.GenerateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CustomLZH
 * @version 1.0
 * @date 2022/10/16 19:35
 * @since JDK1.8
 */
@SpringBootTest
public class GenerateUtilTest {
    /**
     * 包模块路径
     */
    @Value("${generate.packageModulePath}")
    String packageModulePath;
    /**
     * 类路径
     */
    @Value("${generate.classPackagePath}")
    String classPackagePath;

    @Test
    void generate() throws IOException {
        // 表名称对应实体类名称
        Map<String, String> names = new HashMap<>();
        names.put("t_security_user", "SecurityUser");
        // 项目存放位置
        String projectPath = new File("").getCanonicalPath();
        // 生成实体类
        GenerateUtil.generate(
                names,
                new DataSource(),
                ConvertTypeEnum.MYSQL_TO_JAVA,
                projectPath,
                packageModulePath,
                classPackagePath,
                new ConfigureInfoServiceImpl(),
                Arrays.asList(ImportVerifyEnum.values()),
                Arrays.asList(ClassAnnotationVerifyEnum.values()),
                Arrays.asList(ColumnAnnotationVerifyEnum.values())
        );
    }
}
