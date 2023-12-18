DROP SCHEMA IF EXISTS carshop;
CREATE SCHEMA carshop;

USE carshop;

 CREATE TABLE `companies` (
   `company_id` int NOT NULL AUTO_INCREMENT primary key,
   `company_name` varchar(45) NOT NULL,
   `company_country` varchar(45) NOT NULL);

 CREATE TABLE `cars` (
   `car_id` int NOT NULL AUTO_INCREMENT primary key,
   `name` varchar(45) NOT NULL,
   `year` int NOT NULL,
   `distance` int DEFAULT NULL,
   `fuel` varchar(45) NOT NULL DEFAULT 'Бензин',
   `fuel_consumption` varchar(45) NOT NULL,
   `price` int NOT NULL,
   `company_id` int NOT NULL,
   FOREIGN KEY (`company_id`) REFERENCES companies(`company_id`)
   ON delete cascade
 );

CREATE TABLE `people` (
  `person_id` int NOT NULL primary key auto_increment,
  `surname` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int NOT NULL,
  `phone` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL
);

CREATE TABLE `users` (
  `user_id` int NOT NULL primary key auto_increment,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) not null DEFAULT 'User',
  `person_id` int,

 constraint `fk_user_person` foreign key (`person_id`) references `people` (`person_id`)
 on delete cascade
);
