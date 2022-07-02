insert into TYPE_CONNECTION (id,connection_type) values (1,'Resedential'); 
insert into TYPE_CONNECTION (id,connection_type) values (2,'Agriculture'); 
insert into TYPE_CONNECTION (id,connection_type) values (3,'Industrial'); 
insert into VOLTAGE_LEVEL (id,level) values (1,'HT'); 
insert into VOLTAGE_LEVEL (id,level) values (2,'LT'); 

insert into RATE_TARIF (id,rate,type,type_connection,unit_level,voltage_level) values (1,3.36,'A','Resedential','0-100','LT');
insert into RATE_TARIF (id,rate,type,type_connection,unit_level,voltage_level) values (2,7.34,'B','Resedential','101-300','LT');--insert into RATE_TARIF (id,rate,type) values (1,3.36,'A');
insert into RATE_TARIF (id,rate,type,type_connection,unit_level,voltage_level) values (3,10.37,'C','Resedential','301-500','LT');--insert into RATE_TARIF (id,rate,type) values (1,3.36,'A');