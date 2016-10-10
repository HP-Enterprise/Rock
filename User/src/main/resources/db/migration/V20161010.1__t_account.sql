CREATE TABLE t_account (
  id int(11) NOT NULL AUTO_INCREMENT,
  phone varchar(11) COMMENT '手机号码',
  password varchar(32) COMMENT '密码',
  salt varchar(4) COMMENT 'salt',
  register_time datetime COMMENT '注册时间',
  create_date datetime COMMENT '创建时间',
  create_user varchar(50) COMMENT '创建用户',
  modify_date datetime COMMENT '更新时间',
  modify_user varchar(50) COMMENT '更新用户',
  is_enable varchar(1) COMMENT '是否可用(1:可用  0:不可用)',
  PRIMARY KEY (id)
)COMMENT='账户表';

INSERT INTO t_account values('1','13000000001',upper(md5(concat("0192023a7bbd73250516f069df18b500",salt))),'4yMh','2016-10-10 12:00:00','2016-10-10 12:00:00',NULL,NULL,NULL,'1');