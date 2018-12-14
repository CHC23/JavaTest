/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : javatest

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-12-14 14:18:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sudent`
-- ----------------------------
DROP TABLE IF EXISTS `sudent`;
CREATE TABLE `sudent` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `number` varchar(10) DEFAULT NULL,
  `passowrd` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `score` double DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sudent
-- ----------------------------
INSERT INTO `sudent` VALUES ('1', '706', '123', 'hello', '21', '100', '男');
