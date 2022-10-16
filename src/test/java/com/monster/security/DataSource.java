package com.monster.security;


import com.monster.commons.generate.service.DataSourceConfigInfoService;

/**
 * @Author: LiuZhaoHong
 * @Date: 2021/8/14
 * @Version: 1.0
 */
public class DataSource implements DataSourceConfigInfoService {
    @Override
    public String getOracleDatabase() {
        return null;
    }

    @Override
    public String getOracleUsername() {
        return null;
    }

    @Override
    public String getOraclePassword() {
        return null;
    }

    @Override
    public String getMysqlDatabase() {
        return "monster_security";
    }

    @Override
    public String getMysqlUsername() {
        return "root";
    }

    @Override
    public String getMysqlPassword() {
        return "root";
    }

    @Override
    public String getMysqlHost() {
        return DataSourceConfigInfoService.super.getMysqlHost();
    }

    @Override
    public String getMysqlPort() {
        return DataSourceConfigInfoService.super.getMysqlPort();
    }

    @Override
    public String getOracleHost() {
        return DataSourceConfigInfoService.super.getOracleHost();
    }

    @Override
    public String getOraclePort() {
        return DataSourceConfigInfoService.super.getOraclePort();
    }
}
