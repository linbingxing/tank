DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
   `id`        BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
   `loginName` VARCHAR(50) NOT NULL COMMENT '登录用户名',
   `password`  VARCHAR(100) NOT NULL COMMENT '密码',
   `realName`  VARCHAR(250) DEFAULT NULL COMMENT '真实名称',
   `mobile`    VARCHAR(11) DEFAULT NULL COMMENT '手机',
   `phone`     VARCHAR(20) DEFAULT NULL COMMENT '电话',
   `email`     VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
   `photo`     VARCHAR(1000) DEFAULT NULL COMMENT '头像',
   `status`    TINYINT(1)  DEFAULT 0 COMMENT '用户状态（0 冻结、1 激活 ）',
   `deptId`    BIGINT(20)  DEFAULT NULL COMMENT '部门id',
   `jobId`     BIGINT(20)  DEFAULT NULL COMMENT '职位id',
   `remark`    VARCHAR(500)  DEFAULT NULL COMMENT '备注信息',
   `createId`  BIGINT(20) DEFAULT NULL COMMENT '创建人ID',
   `createName` VARCHAR(100) DEFAULT NULL COMMENT '创建人名称',
   `createTime` VARCHAR(25) DEFAULT NULL COMMENT '创建时间',
   `updateId`   BIGINT(20) DEFAULT NULL COMMENT '更新人ID',
   `updateTime` VARCHAR(25) DEFAULT NULL COMMENT '更新时间',
   `updateName` VARCHAR(100) DEFAULT NULL COMMENT '更人人名称',
   `delFlag`    TINYINT(1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
   PRIMARY KEY (`id`) USING BTREE,
   INDEX SYS_USER_INDEX_01(`deptId`) USING BTREE,
   INDEX SYS_USER_INDEX_02(`jobId`) USING BTREE
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='系统用户';

DROP TABLE IF EXISTS `sys_role` ;
CREATE TABLE `sys_role` (
  `id` bigint (20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `roleName` varchar (100) NOT NULL COMMENT '角色名称',
  `roleCode` VARCHAR (100) NOT NULL COMMENT '角色英文名称，代码',
  `status` TINYINT (1) DEFAULT 0 COMMENT '角色状态（0 冻结、1 激活 ）',
  `sysId` TINYINT (1) DEFAULT 1 COMMENT '系统标识（1、坦克后台 2、其他(后续补充））',
  `dataScope` varchar (64) DEFAULT NULL COMMENT '数据范围',
  `remark` varchar (500) DEFAULT NULL COMMENT '备注信息',
  `createId` bigint (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` varchar (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` varchar (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` bigint (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` varchar (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` varchar (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` tinyint (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统角色' ;

DROP TABLE IF EXISTS `sys_menu` ;
CREATE TABLE `sys_menu` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `parentId` BIGINT(20) DEFAULT '0' COMMENT '父级菜单id',
  `menuName` VARCHAR (100) NOT NULL COMMENT '菜单名称',
  `menuCode` VARCHAR (100) NOT NULL COMMENT '菜单编号',
  `path` VARCHAR(100) DEFAULT NULL COMMENT '菜单层级路径',
  `href` VARCHAR(250) DEFAULT NULL COMMENT '链接地址',
  `menuLevel` TINYINT(2) DEFAULT '1' COMMENT '菜单级别',
  `sort` INT(11) DEFAULT NULL COMMENT '排序',
  `icon` VARCHAR(200)  DEFAULT NULL COMMENT '图标',
  `isPublic` TINYINT(4) DEFAULT '0' COMMENT '是否为公共模块（任务角色都能拥有的权限）',
  `permission` VARCHAR(100)  DEFAULT NULL COMMENT '权限标识',
  `status` TINYINT (1) DEFAULT 0 COMMENT '是否展示（0 不展示、1 展示 ）',
  `sysId` TINYINT (1) DEFAULT 1 COMMENT '系统标识（1、坦克后台 2、其他(后续补充））',
  `remark` VARCHAR (500) DEFAULT NULL COMMENT '备注信息',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统菜单';

DROP TABLE IF EXISTS `sys_resource` ;
CREATE TABLE `sys_resource` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '资源id',
  `menuId` BIGINT(20) DEFAULT NULL COMMENT '模块菜单id',
  `resourceName` VARCHAR (100) NOT NULL COMMENT '资源名称',
  `resourceCode` VARCHAR (100) NOT NULL COMMENT '资源编号',
  `sort` INT(11) DEFAULT NULL COMMENT '排序',
  `icon` VARCHAR(200)  DEFAULT NULL COMMENT '图标',
  `permission` VARCHAR(100)  DEFAULT NULL COMMENT '权限标识',
  `status` TINYINT (1) DEFAULT 0 COMMENT '是否展示（0 不展示、1 展示 ）',
  `sysId` TINYINT (1) DEFAULT 1 COMMENT '系统标识（1、坦克后台 2、其他(后续补充））',
  `remark` VARCHAR (500) DEFAULT NULL COMMENT '备注信息',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX SYS_RESOURCE_INDEX_01(`menuId`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统资源' ;

DROP TABLE IF EXISTS `sys_dept` ;
CREATE TABLE `sys_dept` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `deptName` VARCHAR (200) NOT NULL COMMENT '部门名称',
  `deptCode` VARCHAR (100) NOT NULL COMMENT '部门编码',
  `parentId` BIGINT(20) DEFAULT NULL COMMENT '父id',
  `companyId` BIGINT(20) DEFAULT NULL COMMENT '所在公司id',
  `sort` INT(11) DEFAULT NULL COMMENT '排序',
  `status` TINYINT (1) DEFAULT 0 COMMENT '部门状态（0 冻结、1 激活 ）',
  `sysId` TINYINT (1) DEFAULT 1 COMMENT '系统标识（1、坦克后台 2、其他(后续补充））',
  `remark` VARCHAR (500) DEFAULT NULL COMMENT '备注信息',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
   PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统部门' ;

DROP TABLE IF EXISTS `sys_job` ;
CREATE TABLE `sys_job` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `jobName` VARCHAR (200) NOT NULL COMMENT '职务名称',
  `deptId` BIGINT (20) NOT NULL COMMENT '所属部门ID',
  `sort` INT(11) DEFAULT NULL COMMENT '排序',
  `status` TINYINT (1) DEFAULT 0 COMMENT '部门状态（0 冻结、1 激活 ）',
  `sysId` TINYINT (1) DEFAULT 1 COMMENT '系统标识（1、坦克后台 2、其他(后续补充））',
  `remark` VARCHAR (500) DEFAULT NULL COMMENT '备注信息',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
   PRIMARY KEY (`id`) USING BTREE,
   INDEX SYS_JOB_INDEX_01(`deptId`) USING BTREE,
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统职务' ;


DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `roleId` BIGINT(20) NOT NULL COMMENT '模块角色id',
  `menuId` BIGINT(20) NOT NULL COMMENT '模块菜单id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX SYS_ROLE_MENU_INDEX_01(`menuId`) USING BTREE,
  INDEX SYS_ROLE_MENU_INDEX_02(`roleId`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统角色-菜单' ;

DROP TABLE IF EXISTS `sys_role_resource` ;
CREATE TABLE `sys_role_resource` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `roleId` BIGINT(20) NOT NULL COMMENT '模块角色id',
  `resourceId` BIGINT(20) NOT NULL COMMENT '模块资源id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX SYS_ROLE_RESOURCE_INDEX_01(`roleId`) USING BTREE,
  INDEX SYS_ROLE_RESOURCE_INDEX_02(`resourceId`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统角色-资源' ;

DROP TABLE IF EXISTS `sys_user_role` ;
CREATE TABLE `sys_user_role` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userId` BIGINT(20) NOT NULL COMMENT '用户id',
  `roleId` BIGINT(20) NOT NULL COMMENT '模块角色id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX SYS_USER_ROLE_INDEX_01(`userId`) USING BTREE,
  INDEX SYS_USER_ROLE_INDEX_02(`roleId`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统用户-角色';

DROP TABLE IF EXISTS `sys_user_dept` ;
CREATE TABLE `sys_user_dept` (
  `id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userId` BIGINT(20) NOT NULL COMMENT '用户id',
  `deptId` BIGINT(20) NOT NULL COMMENT '部门id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX SYS_USER_ROLE_INDEX_01(`userId`) USING BTREE,
  INDEX SYS_USER_ROLE_INDEX_02(`deptId`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统用户-部门';

DROP TABLE IF EXISTS `sys_company`;
CREATE TABLE `sys_company` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '公司id',
  `name` VARCHAR(100)  DEFAULT NULL COMMENT '公司名称',
  `address` VARCHAR(500) DEFAULT NULL COMMENT '公司地址',
  `areaId` VARCHAR(64)  DEFAULT NULL COMMENT '区域id',
  `zipCode` VARCHAR(10)  DEFAULT NULL COMMENT '邮政编码',
  `master` VARCHAR(20)  DEFAULT NULL COMMENT '法人',
  `phone` VARCHAR(20)  DEFAULT NULL COMMENT '联系电话',
  `fax` VARCHAR(20)  DEFAULT NULL COMMENT '传真',
  `email` VARCHAR(100)  DEFAULT NULL COMMENT '邮箱',
  `copyright` VARCHAR(100)  DEFAULT NULL COMMENT '版权信息',
  `remark` VARCHAR (500) DEFAULT NULL COMMENT '备注信息',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统公司信息' ;

DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '日志id',
  `loginName` VARCHAR(100)  DEFAULT NULL COMMENT '用户登录名',
  `loginType` VARCHAR(64)  DEFAULT NULL COMMENT '日志来源类型',
  `module` VARCHAR(500)  DEFAULT NULL COMMENT '模块名称',
  `method` VARCHAR(1000)  DEFAULT NULL COMMENT '全类名或者操作url',
  `requestIp` VARCHAR(15)  DEFAULT NULL COMMENT '请求ip',
  `params` VARCHAR(5000)  DEFAULT NULL COMMENT '请求参数',
  `msg` VARCHAR(1000)  DEFAULT NULL COMMENT '信息',
  `useTime` BIGINT(20)  DEFAULT NULL COMMENT '请求时间',
  `remark` VARCHAR (500) DEFAULT NULL COMMENT '备注信息',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT = '系统日志' ;

DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict`  (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '字典id',
  `dictTypeId` BIGINT(20) NOT NULL COMMENT '所属字典类型的id',
  `code` VARCHAR(50)  NOT NULL COMMENT '字典编码',
  `name` VARCHAR(255)  NOT NULL COMMENT '字典名称',
  `parentId` BIGINT(20) NOT NULL COMMENT '上级代码id',
  `status` TINYINT (1) DEFAULT 0 COMMENT '状态（0 冻结、1 激活 ）',
  `sort` INT(11) DEFAULT NULL COMMENT '排序',
  `description` VARCHAR(1000)  DEFAULT NULL COMMENT '字典的描述',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4  COMMENT = '基础字典';

DROP TABLE IF EXISTS `sys_dict_type`;
CREATE TABLE `sys_dict_type`  (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '字典类型id',
  `code` VARCHAR(255)  NOT NULL COMMENT '字典类型编码',
  `name` VARCHAR(255)  NOT NULL COMMENT '字典类型名称',
  `description` VARCHAR(500)   DEFAULT NULL COMMENT '字典描述',
  `sysFlag` TINYINT (1)  DEFAULT 0 COMMENT '是否是系统字典，0、否 1、是',
  `status` TINYINT (1) DEFAULT 0 COMMENT '状态（0 冻结、1 激活 ）',
  `sort` INT(11) DEFAULT NULL COMMENT '排序',
  `createId` BIGINT (20) DEFAULT NULL COMMENT '创建人ID',
  `createName` VARCHAR (50) DEFAULT NULL COMMENT '创建人名称',
  `createTime` VARCHAR (25) DEFAULT NULL COMMENT '创建时间',
  `updateId` BIGINT (20) DEFAULT NULL COMMENT '更新人ID',
  `updateTime` VARCHAR (25) DEFAULT NULL COMMENT '更新时间',
  `updateName` VARCHAR (50) DEFAULT NULL COMMENT '更人人名称',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4   COMMENT = '字典类型表' ;

DROP TABLE IF EXISTS `quartz_job`;
CREATE TABLE `quartz_job` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `jobName` varchar(512) NOT NULL COMMENT '任务名称',
  `jobGroup` varchar(512) NOT NULL COMMENT '任务组名',
  `jobCron` varchar(512) NOT NULL COMMENT '时间表达式',
  `jobClassPath` varchar(1024) NOT NULL COMMENT '类路径,全类型',
  `methodName` varchar(255)  DEFAULT NULL COMMENT '执行方法',
  `jobDataMap` varchar(1024) DEFAULT NULL COMMENT '传递map参数',
  `jobStatus` int(2) NOT NULL COMMENT '状态:1启用 0停用',
  `jobDescribe` varchar(1024) DEFAULT NULL COMMENT '任务功能描述',
  `lastExecuteStatus` bit(1)  DEFAULT NULL COMMENT '最后一次执行状态',
  `lastExecuteTime` varchar(19)  DEFAULT NULL COMMENT '最后一次执行时间',
  `createId` bigint(20) DEFAULT NULL COMMENT '操作人',
  `createTime` varchar(19) NOT NULL DEFAULT '' COMMENT '创建时间',
  `updateId` bigint(20) DEFAULT NULL COMMENT '更新人',
  `updateTime` varchar(19) DEFAULT '' COMMENT '更新时间',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='quartz任务';

DROP TABLE IF EXISTS `quartz_log`;
CREATE TABLE `quartz_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `jobName` varchar(512) DEFAULT NULL COMMENT '任务名称',
  `jobGroup` varchar(512) DEFAULT NULL COMMENT '任务组名',
  `jobCron` varchar(512) DEFAULT NULL COMMENT '时间表达式',
  `methodName` varchar(255)  DEFAULT NULL COMMENT '执行方法',
  `params` varchar(255) DEFAULT NULL COMMENT '执行参数',
  `isSuccess` bit(1)  DEFAULT NULL COMMENT '执行状态 0 失败 1成功',
  `executeTime` int(11)  DEFAULT NULL COMMENT '执行时间',
  `exceptionDetail` text  DEFAULT NULL COMMENT '异常详细',
  `createTime` varchar(19)  NULL DEFAULT '' COMMENT '创建时间',
  `delFlag` TINYINT (1) DEFAULT '0' COMMENT '是否删除；0未删除、1已删除',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='quartz任务执行日志';



