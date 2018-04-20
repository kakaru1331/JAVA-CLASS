@echo off

SET date=%date
mysqldump --user root -p1234 spring > C:\backup\spring_%date%.sql