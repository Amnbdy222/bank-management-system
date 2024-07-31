create database bankmanagementsystem;

use bankmanagementsystem;

create table signup(formno char(20), name char(20), father_name char(20), dob varchar(20), 
					gender char(6), email varchar(30), marital_status char(20), address varchar(50), 
                    city char(25), state char(25), pin_code int);
                    
create table signuptwo(formno varchar(20), religion char(20), category char(20), income char(20), education char(20), occupation char(20), pan varchar(20), 
aadhar char(20), senior_citizen char(20), existing_account char(20));


create table signupthree (formno varchar(20), accountType varchar(40), cardnumber char(25), pinnumber char(10), facility char(100));

select * from signup;

select * from signuptwo;

select * from signupthree;


create table login (formno varchar(20), cardnumber char(25), pinnumber char(10));

select * from login;

create table bank(pinnumber char(10), date varchar(50), type varchar(20), amount varchar(20)); 

select * from bank;

truncate signup;
truncate signuptwo;
truncate signupthree;
truncate login;
truncate bank;