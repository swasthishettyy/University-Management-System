create database universitymanagementsystem;

show databases;

use universitymanagementsystem;
create table login(username varchar(25),password varchar(25));
insert into login values('admin','12345');
select * from login;
drop table login;

create table student(name varchar(40),fname varchar(40),rollno varchar(40),dob varchar(20),address varchar(40),phone varchar(10),email varchar(40),X varchar(20),XII varchar(20),aadhar varchar(20),course varchar(20),branch varchar(20));
select * from student;
drop table student;

create table faculty(name varchar(40),fname varchar(40),empid varchar(40),dob varchar(20),address varchar(40),phone varchar(10),email varchar(40),X varchar(20),XII varchar(20),aadhar varchar(20),qualification varchar(40),department varchar(40));
select * from faculty; 
drop table faculty;

create table studentleave(rollno varchar(20),date varchar(50),duration varchar(20)); 
select * from studentleave;
drop table studentleave;
create table facultyleave(empid varchar(20),date varchar(50),duration varchar(20)); 
select * from facultyleave;
drop table facultyleave;
create table subject(rollno varchar(30),semester varchar(30),subject1 varchar(50),subject2 varchar(50),subject3 varchar(50),subject4 varchar(50),subject5 varchar(50));
select * from subject;
create table marks(rollno varchar(30),semester varchar(30),marks1 varchar(50),marks2 varchar(50),marks3 varchar(50),marks4 varchar(50),marks5 varchar(50));

create table fee(course varchar(40),semester1 varchar(40),semester2 varchar(40),semester3 varchar(40),semester4 varchar(40),semester5 varchar(40),semester6 varchar(40),semester7 varchar(40),semester8 varchar(40));
insert into fee values("B.Tech","96000","96000","120000","120000","150000","150000","200000","200000");
insert into fee values("Skill Labs","10000","10000","10000","10000","20000","20000","-","-");
insert into fee values("Placement","10000","10000","20000","20000","20000","20000","25000","25000");
insert into fee values("MBA","220000","200000","120000","200000","-","-","-","-");
insert into fee values("M.Tech","96000","96000","120000","120000","-","-","-","-");
select * from fee;

create table collegefee(rollno varchar(30),course varchar(30),branch varchar(30),semester varchar(30),total varchar(30));
drop table fee;
select * from collegefee;