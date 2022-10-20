-- 创建用户表
create table if not exists t_security_user
(
    i_id              BIGINT not null primary key comment '编号',
    s_name            VARCHAR(32) not null comment '姓名',
    s_nickname        VARCHAR(32) comment '昵称',
    s_account         VARCHAR(16) not null comment '账号',
    s_email           VARCHAR(32) comment '邮箱',
    i_create_id       BIGINT not null comment '创建人id',
    s_create_name     VARCHAR(32) comment '创建人姓名',
    d_create_date     DATETIME default current_timestamp comment '创建时间',
    i_update_id       BIGINT not null comment '更新人id',
    s_update_name     VARCHAR(32) comment '更新人姓名',
    d_update_date     DATETIME default current_timestamp comment '更新时间'
) comment '用户表';