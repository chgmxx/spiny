

-- 视图菜单分类表
DROP TABLE
IF EXISTS `view_menu_category`;

CREATE TABLE `view_menu_category` (
  `id` BIGINT(20) UNSIGNED AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(255) NOT NULL COMMENT '分类名称',
  `icon` VARCHAR(255) DEFAULT '' COMMENT '图标（icon）',
  `parent_id` BIGINT(20) DEFAULT NULL COMMENT '父级分类 id',
  `role_id` BIGINT(20) UNSIGNED NOT NULL COMMENT '角色 id',
  `sort` BIGINT(20) DEFAULT 0 COMMENT '排序',
  `remark` VARCHAR(255) DEFAULT '' COMMENT '备注',
  `gmt_modified` DATETIME DEFAULT NOW() COMMENT '更新时间',
  `gmt_created` DATETIME DEFAULT NOW() COMMENT '创建时间',
  PRIMARY KEY `pk_id`(`id`)
)
  ENGINE = INNODB
  DEFAULT CHARACTER
  SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  AUTO_INCREMENT = 1
  ROW_FORMAT = DYNAMIC
  COMMENT = '视图菜单分类表';
