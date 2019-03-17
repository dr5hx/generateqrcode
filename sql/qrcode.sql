/*
 Navicat Premium Data Transfer

 Source Server         : dr5hx
 Source Server Type    : MySQL
 Source Server Version : 80014
 Source Host           : localhost:3306
 Source Schema         : qrcode

 Target Server Type    : MySQL
 Target Server Version : 80014
 File Encoding         : 65001

 Date: 17/03/2019 19:55:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `user_salt` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户颜值',
  `user_password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户密码',
  `register_time` datetime(0) NOT NULL COMMENT '用户注册时间',
  `update_time` datetime(0) NOT NULL COMMENT '用户更新时间',
  `is_block` int(1) NULL DEFAULT 0 COMMENT '用户是否拉黑',
  `is_del` int(1) NULL DEFAULT 0 COMMENT '用户是否删除',
  `version` int(11) NULL DEFAULT 0 COMMENT '用户数据当前版本号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_login_log
-- ----------------------------
DROP TABLE IF EXISTS `user_login_log`;
CREATE TABLE `user_login_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户登录日志表主键',
  `user_id` bigint(20) NOT NULL COMMENT '来自用户表的主键',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `user_ip` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户登录ip地址',
  `user_time` datetime(0) NOT NULL COMMENT '用户登录时间',
  `user_device` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户登录设备',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户登录日志记录表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
