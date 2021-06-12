SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


CREATE TABLE `faculty`(
	`id` VARCHAR(20) PRIMARY KEY,
	`name` NVARCHAR(50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `faculty` (`id`, `name`) VALUES
('FIT','Cong nghe thong tin'),
('FFL','Ngoai ngu'),
('FCE','Xay dung'),
('ITE','Vien su pham ky thuat'),
('FPI','Ly luan chinh tri'),
('FAS','Khoa ung dung'),
('FEEE','Dien - dien tu'),
('FE','Kinh te'),
('FGRAM','In va truyen thong'),
('FHQ','Dao tao chat luong cao'),
('FGTFD','Cong nghe may va thoi trang'),
('FCFT','Cong nghe hoa hoc va thuc pham'),
('FME','Co khi che tao may'),
('FAE','Co khi dong luc');


CREATE TABLE `class`(
	`id` VARCHAR(20) PRIMARY KEY,
	`name` NVARCHAR(50),
	`major` NVARCHAR(50),
	`id_faculty` VARCHAR(20),
	FOREIGN KEY (`id_faculty`) REFERENCES `faculty`(`id`) ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `class` (`id`, `name`, `major`, `id_faculty`) VALUES
('1','181330','Ky thuat du lieu', 'FIT'),
('2','181110A','Cong nghe phan mem', 'FIT'),
('3','181110B','He thong thong tin', 'FIT'),
('4','181110C','An ninh mang', 'FIT'),
('5','181220A','Ngon ngu anh', 'FFL'),
('6','181220B','Su pham anh', 'FFL'),
('7','181440A','Kien truc', 'FCE'),
('8','181440B','Quan ly xay dung', 'FCE'),
('9','181550A','Quan ly cong nghiep', 'FE'),
('10','181550C','Thuong mai dien tu', 'FE'),
('11','181550D','Ke toan- tai chinh', 'FE'),
('12','181550E','Kinh doanh quoc te', 'FE'),
('13','181550F','Logistics va quan ly chuoi cung ung', 'FE'),
('14','181660','Cong nghe ky thuat in', 'FGRAM'),
('15','181770A','CN ky thuat co dien tu', 'FME'),
('16','181770B','Ky thuat co khi', 'FME'),
('17','181770C','Che tao may', 'FME'),
('18','181770D','Ky thuat cong nghiep', 'FME'),
('19','181770E','Robot va tri tue nhan tao', 'FME'),
('20','181880A','CN ky thuat o to', 'FAE'),
('21','181880B','CN ky thuat nhiet', 'FAE'),
('22','181880C','Nang luong tai tao', 'FAE'),
('23','181990A','Cong nghe may', 'FGTFD'),
('24','181990B','Thiet ke thoi trang', 'FGTFD'),
('25','181990D','Quan ly nha hang va dich vu an uong', 'FGTFD'),
('26','181990E','CN vat lieu det- may', 'FGTFD');


CREATE TABLE `user`
(
	`id` VARCHAR(20) PRIMARY KEY,
	`first_name` NVARCHAR(20),
	`last_name` NVARCHAR(20),
	`middle_name` NVARCHAR(20),
	`phone_no` VARCHAR(20),
	`sex` BIT,
	`dob` DATE,
	`mail` VARCHAR(50),
	`password` VARCHAR(50),
	`class_id` VARCHAR(20),
	FOREIGN KEY (`class_id`) REFERENCES `class`(`id`) ON UPDATE CASCADE ON DELETE SET NULL,
	`faculty_id` VARCHAR(20),
	FOREIGN KEY (`faculty_id`) REFERENCES `faculty`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user`(`id`, `first_name`,`last_name`,`middle_name`,`phone_no`,`sex`,`dob`,`mail`,`password`,`class_id`,`faculty_id`) VALUES
('U00001','Viet', 'Lam', 'Hoang', '0863233886',1,'20000515', '18133062@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','1','FIT'),
('U00002','Ngoc', 'Dinh', 'Quang', '0863233886', 1, '20000825', '18133034@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','1','FIT'),
('U00003','Hung', 'Pham', 'Ngoc', '0863233886', 1, '20001004', '18133017@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '1','FIT'),
('U00004','Tin', 'Nguyen', 'Dang Phuoc', '0863233886', 1, '20000216', '18133056@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '1','FIT'),
('U00005','Thang', 'Pham', 'Viet', '0863233886', 1, '20001201', '18133052@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '1','FIT'),
('U00006','A', 'Van', 'Nguyen', '0863233886',1,'20000515', '18133062@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','2','FIT'),
('U00007','B', 'Thi', 'Tran', '0863233886', 1, '20000825', '18133034@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','3','FIT'),
('U00008','C', 'Dinh', 'Thanh', '0863233886', 1, '20001004', '18133017@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '4','FIT'),
('U00009','D', 'Nguyen', 'Thi', '0863233886', 1, '20000216', '18133056@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '5','FFL'),
('U00010','E', 'Hoang', 'Pham', '0863233886', 1, '20001201', '18133052@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '6','FFL'),
('U00011','F', 'Xuan', 'Phan', '0863233886',1,'20000515', '18133062@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','7','FCE'),
('U00012','J', 'Ngoc', 'Nguyen', '0863233886', 1, '20000825', '18133034@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','8','FCE'),
('U00013','Q', 'Van', 'Dinh', '0863233886', 1, '20001004', '18133017@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '9','FE'),
('U00014','K', 'Ngoc', 'Tran', '0863233886', 1, '20000216', '18133056@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '10','FE'),
('U00015','H', 'Quang', 'Pham', '0863233886', 1, '20001201', '18133052@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '11','FE'),
('U00016','F', 'Xuan', 'Phan', '0863233886',1,'20000515', '18133062@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','12','FE'),
('U00017','J', 'Ngoc', 'Nguyen', '0863233886', 1, '20000825', '18133034@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','13','FE'),
('U00018','Q', 'Van', 'Dinh', '0863233886', 1, '20001004', '18133017@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '14','FGRAM'),
('U00019','K', 'Ngoc', 'Tran', '0863233886', 1, '20000216', '18133056@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '15','FME'),
('U00020','H', 'Quang', 'Pham', '0863233886', 1, '20001201', '18133052@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '16','FME'),
('U00021','F', 'Xuan', 'Phan', '0863233886',1,'20000515', '18133062@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','17','FME'),
('U00022','J', 'Ngoc', 'Nguyen', '0863233886', 1, '20000825', '18133034@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','18','FME'),
('U00023','Q', 'Van', 'Dinh', '0863233886', 1, '20001004', '18133017@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '19','FME'),
('U00024','K', 'Ngoc', 'Tran', '0863233886', 1, '20000216', '18133056@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '20','FAE'),
('U00025','H', 'Quang', 'Pham', '0863233886', 1, '20001201', '18133052@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '21','FAE'),
('U00026','F', 'Xuan', 'Phan', '0863233886',1,'20000515', '18133062@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','22','FAE'),
('U00027','J', 'Ngoc', 'Nguyen', '0863233886', 1, '20000825', '18133034@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a','23','FGTFD'),
('U00028','Q', 'Van', 'Dinh', '0863233886', 1, '20001004', '18133017@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '24','FGTFD'),
('U00029','K', 'Ngoc', 'Tran', '0863233886', 1, '20000216', '18133056@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '25','FGTFD'),
('U00030','H', 'Quang', 'Pham', '0863233886', 1, '20001201', '18133052@student.hcmute.edu.vn','2d944828fdb3cd3bc07c42d6b685333a', '26','FGTFD');


CREATE TABLE `role`(
	`id` VARCHAR(20) PRIMARY KEY,
	`role` VARCHAR(20),
	`description` NVARCHAR(50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `role` (`id`, `role`, `description`) VALUES
('1','ADMIN', NULL),
('2','TEACHER', NULL),
('3','STUDENT', NULL);


CREATE TABLE `user_role`(
	`user_id` VARCHAR(20),
	FOREIGN KEY (`user_id`) REFERENCES `user`(`id`) ON UPDATE CASCADE ON DELETE CASCADE,
	`role_id` VARCHAR(20),
	FOREIGN KEY (`role_id`) REFERENCES `role`(`id`) ON UPDATE CASCADE ON DELETE CASCADE,
	PRIMARY KEY(`user_id`, `role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user_role`(`user_id`,`role_id`) VALUES
('U00001','3'),
('U00002','3'),
('U00003','3'),
('U00004','3'),
('U00005','3'),
('U00006','3'),
('U00007','3'),
('U00008','3'),
('U00009','3'),
('U00010','3'),
('U00011','3'),
('U00012','3'),
('U00013','3'),
('U00014','3'),
('U00015','3'),
('U00016','3'),
('U00017','3'),
('U00018','3'),
('U00019','3'),
('U00020','3'),
('U00021','3'),
('U00022','3'),
('U00023','3'),
('U00024','3'),
('U00025','3'),
('U00026','3'),
('U00027','3'),
('U00028','3'),
('U00029','3'),
('U00030','3');


CREATE TABLE `semester`(
	`id` VARCHAR(20) PRIMARY KEY,
	`title` NVARCHAR(50),
	`start_sem` DATE,
	`end_sem` DATE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `semester`(`id`,`title`,`start_sem`,`end_sem`) VALUES
('19201', 'HOC KY I 2019-2020',  '20191003', '20191007'),
('19202', 'HOC KY II 2019-2020', '20191009', '20201001'), 
('20211', 'HOC KY I 2020-2021', '20201003', '20201007');


CREATE TABLE `subject`(
	`id` VARCHAR(20) PRIMARY KEY,
	`name` NVARCHAR(50),
	`description` NVARCHAR(200),
	`faculty_id` varchar(20),
	FOREIGN KEY (`faculty_id`) REFERENCES `faculty`(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `subject`(`id`,`name`,`description`,`faculty_id`) VALUES
('DASA230179', 'Cau truc du lieu va giai thuat', null, 'FIT'),
('MATH132401', 'Toan 1', null, 'FAS'),
('MATH132501', 'Toan 2', null, 'FAS'),
('MATH143001', 'Dai so va cau truc dai so', null, 'FAS'),
('MATH132901', 'Xac xuat thong ke va ung dung', null, 'FAS'),
('PHYS130902', 'Ly 1', null, 'FAS'),
('EEEN234162', 'Dien tu can ban', null, 'FEEE'),
('INPR130285', 'Nhap mon lap trinh', null, 'FIT'),
('PRTE230385', 'Ky thuat lap trinh', null, 'FIT'),
('OOPR230279', 'Lap trinh huong doi tuong', null, 'FIT'),
('INSE330380', 'An toan thong tin', null, 'FIT'),
('WEPR330479', 'Lap trinh Web', null, 'FIT'),
('SOEN330679', 'Cong nghe phan mem', null, 'FIT'),
('NEES330380', 'Mang may tinh can ban', null, 'FIT'),
('DBSY230184', 'Co so du lieu', null, 'FIT');


CREATE TABLE `course`(
	`id` VARCHAR(20) PRIMARY KEY,
	`name` NVARCHAR(50),
	`description` NVARCHAR(200),
	`semester_id` VARCHAR(20),
	FOREIGN KEY (`semester_id`) REFERENCES `semester`(`id`) ON UPDATE CASCADE ON DELETE SET NULL,
	`subject_id` VARCHAR(20),
	FOREIGN KEY (`subject_id`) REFERENCES `subject`(`id`) ON UPDATE CASCADE ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `course`(`id`,`name`,`description`,`semester_id`,`subject_id`) VALUES
('MATH132501_20211_1', 'Toan 2', NULL, '20211', 'MATH132501'),
('MATH143001_20211_1', 'Dai so va cau truc dai so', NULL, '20211', 'MATH143001'),
('INSE330380_20211_1', 'An toan thong tin', NULL, '20211', 'INSE330380'),
('WEPR330479_20211_1', 'Lap trinh Web', NULL, '20211', 'WEPR330479'),
('SOEN330679_20211_1', 'Cong nghe phan mem', NULL, '20211', 'SOEN330679'),
('DBSY230184_20211_1', 'Co so du lieu', NULL, '20211', 'DBSY230184'),
('INPR130285_20211_1', 'Nhap mon lap trinh', NULL, '20211', 'INPR130285'),
('EEEN234162_20211_1', 'Dien tu can ban', NULL, '20211', 'EEEN234162');


CREATE TABLE `learns`(
	`user_id` VARCHAR(20),
	FOREIGN KEY (`user_id`) REFERENCES `user`(`id`) ON UPDATE CASCADE ON DELETE CASCADE,
	`course_id` VARCHAR(20),
	FOREIGN KEY (`course_id`) REFERENCES `course`(`id`) ON UPDATE CASCADE ON DELETE CASCADE,
	PRIMARY KEY(`user_id`, `course_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `learns`(`user_id`,`course_id`) VALUES
('U00002','MATH132501_20211_1'),
('U00002','MATH143001_20211_1'),
('U00002','WEPR330479_20211_1'),
('U00002','SOEN330679_20211_1'),
('U00002','INPR130285_20211_1'),
('U00002','DBSY230184_20211_1'),
('U00002','INSE330380_20211_1'),
('U00002','EEEN234162_20211_1'),
('U00005','MATH132501_20211_1'),
('U00005','MATH143001_20211_1'),
('U00005','WEPR330479_20211_1'),
('U00005','SOEN330679_20211_1'),
('U00005','INPR130285_20211_1'),
('U00005','DBSY230184_20211_1'),
('U00005','INSE330380_20211_1'),
('U00005','EEEN234162_20211_1'),
('U00004','MATH132501_20211_1'),
('U00004','MATH143001_20211_1'),
('U00004','WEPR330479_20211_1'),
('U00004','SOEN330679_20211_1'),
('U00004','INPR130285_20211_1'),
('U00004','DBSY230184_20211_1'),
('U00004','INSE330380_20211_1'),
('U00004','EEEN234162_20211_1'),
('U00001','MATH132501_20211_1'),
('U00001','MATH143001_20211_1'),
('U00001','WEPR330479_20211_1'),
('U00001','SOEN330679_20211_1'),
('U00001','INPR130285_20211_1'),
('U00001','DBSY230184_20211_1'),
('U00001','INSE330380_20211_1'),
('U00001','EEEN234162_20211_1'),
('U00003','MATH132501_20211_1'),
('U00003','MATH143001_20211_1'),
('U00003','WEPR330479_20211_1'),
('U00003','SOEN330679_20211_1'),
('U00003','INPR130285_20211_1'),
('U00003','DBSY230184_20211_1'),
('U00003','INSE330380_20211_1'),
('U00003','EEEN234162_20211_1'),
('U00006','MATH132501_20211_1'),
('U00006','MATH143001_20211_1'),
('U00006','WEPR330479_20211_1'),
('U00006','SOEN330679_20211_1'),
('U00006','INPR130285_20211_1'),
('U00006','DBSY230184_20211_1'),
('U00006','INSE330380_20211_1'),
('U00006','EEEN234162_20211_1');