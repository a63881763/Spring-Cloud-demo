/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2018-04-28 11:46:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for interface_limit
-- ----------------------------
DROP TABLE IF EXISTS `interface_limit`;
CREATE TABLE `interface_limit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interfaceId` int(11) DEFAULT NULL,
  `unitTime` int(11) DEFAULT NULL,
  `unitNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of interface_limit
-- ----------------------------
INSERT INTO `interface_limit` VALUES ('1', '1', '60', '10');
