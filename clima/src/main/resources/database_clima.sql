CREATE DATABASE clima;
create user 'springuser'@'%' identified by 'pass12';
grant all on clima.* to 'springuser'@'%' WITH GRANT OPTION;
use clima;