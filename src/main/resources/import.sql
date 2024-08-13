INSERT INTO country(id, name) values (1,"Colombia"), (2,"Mexico"), (3,"Ecuador");

INSERT INTO region(id, name, country_id) values (1,"Santander",1), (2,"Amazonas",1);

INSERT INTO city(id, name, region_id) values (1,"Bucaramanga",1), (2,"Giron",1);

INSERT INTO customer (id, name_custoer, last_name_customer, email_customer, city_id, long_customer, latitud_customer, birth_date)
VALUES ("1","Alice","Smith","email",1,74.0060,40.7128,"1990-05-15");
