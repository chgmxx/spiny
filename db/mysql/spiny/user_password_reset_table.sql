

-- 用户密码重置表
DROP TABLE
IF EXISTS `user_password_reset`;

CREATE TABLE `user_password_reset` (
  `id` BIGINT(20) UNSIGNED AUTO_INCREMENT COMMENT 'id',
  `user_id` BIGINT(20) UNSIGNED NOT NULL COMMENT '用户 id',
  `verify_from` VARCHAR(255) NOT NULL COMMENT '用户绑定的电子邮箱或手机号码',
  `verify_code` VARCHAR(255) NOT NULL COMMENT '电子邮箱或手机号码验证码',
  `gmt_expires` DATETIME NOT NULL COMMENT '过期时间',
  `gmt_created` DATETIME DEFAULT NOW() COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_id` (`user_id`),
  UNIQUE KEY `uk_verify_from` (`verify_from`),
  UNIQUE KEY `uk_verify_code` (`verify_code`)
)
  ENGINE = INNODB
  DEFAULT CHARACTER
  SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  AUTO_INCREMENT = 1
  ROW_FORMAT = DYNAMIC
  COMMENT = '用户密码重置表';
