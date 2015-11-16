/*
Navicat MySQL Data Transfer

Source Server         : mysql-root-joe
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : iscdb

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2015-11-16 17:15:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for foods
-- ----------------------------
DROP TABLE IF EXISTS `foods`;
CREATE TABLE `foods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `icon` varchar(500) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `quantity` int(50) DEFAULT NULL,
  `expiredate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of foods
-- ----------------------------
INSERT INTO `foods` VALUES ('1', 'image', 'milk', '2', '2015-11-16');
INSERT INTO `foods` VALUES ('2', 'image', 'bread', '1', '2015-11-17');
INSERT INTO `foods` VALUES ('3', 'image', 'beef', '3', '2015-11-18');
