package com.monster.security.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author LiuZhaoHong
 * @date 2025/4/10
 */
@Configuration
public class MybatisMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createId", Long.class, 1L);
        this.strictInsertFill(metaObject, "createName", String.class, "超级管理员");
        this.strictInsertFill(metaObject, "createDate", Date.class, new Date());
        this.strictUpdateFill(metaObject, "updateId", Long.class, 1L);
        this.strictUpdateFill(metaObject, "updateName", String.class, "超级管理员");
        this.strictUpdateFill(metaObject, "updateDate", Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateId", Long.class, 1L);
        this.strictUpdateFill(metaObject, "updateName", String.class, "超级管理员");
        this.strictUpdateFill(metaObject, "updateDate", Date.class, new Date());
    }
}
