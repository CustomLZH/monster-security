-- 创建枚举表
create table if not exists t_enumerate_type
(
    i_id             BIGINT not null primary key comment '编号',
    s_enumerate_type VARCHAR(128) comment '枚举类型',
    s_enumerate_name VARCHAR(128) comment '枚举类型名称',
    s_remark         VARCHAR(128) comment '备注',
    i_create_id      BIGINT not null comment '创建人id',
    s_create_name    VARCHAR(64) comment '创建人姓名',
    d_create_date    DATETIME default current_timestamp comment '创建时间',
    i_update_id      BIGINT not null comment '更新人id',
    s_update_name    VARCHAR(64) comment '更新人姓名',
    d_update_date    DATETIME default current_timestamp comment '更新时间'
) comment '枚举类型表';
create index IDX_s_enumerate_type on t_enumerate_type (s_enumerate_type);
create index IDX_i_create_id on t_enumerate_type (i_create_id);
create index IDX_i_update_id on t_enumerate_type (i_update_id);

create table if not exists t_enumerate_data
(
    i_id              BIGINT    not null comment '编号',
    s_enumerate_type  VARCHAR(128) comment '枚举类型',
    s_enumerate_label VARCHAR(32) comment '枚举描述',
    s_enumerate_key   VARCHAR(128) comment '枚举键值',
    s_enumerate_sort  TINYINT comment '枚举排序',
    i_create_id       BIGINT not null comment '创建人id',
    s_create_name     VARCHAR(64) comment '创建人姓名',
    d_create_date     DATETIME default current_timestamp comment '创建时间',
    i_update_id       BIGINT not null comment '更新人id',
    s_update_name     VARCHAR(64) comment '更新人姓名',
    d_update_date     DATETIME default current_timestamp comment '更新时间'
) comment '枚举数据表';
create index IDX_s_enumerate_type on t_enumerate_data (s_enumerate_type);
create index IDX_i_create_id on t_enumerate_data (i_create_id);
create index IDX_i_update_id on t_enumerate_data (i_update_id);