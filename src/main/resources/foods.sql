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
INSERT INTO foods
(icon, name, quantity, expiredate)
VALUES
('image', 'milk', '1', '2015-11-17'),
('image', 'bread', '3', '2015-11-19'),
('image', 'beef', '2', '2015-11-23'),
('image', 'apple', '4', '2015-11-30');
