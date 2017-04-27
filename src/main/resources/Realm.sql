# todo
# Create User Table
create table Realm.user(
  id int not null auto_increment primary key,
  role_id varchar(10),
  user_name varchar(20),
  password varchar(100),
  data_create_time TIMESTAMP DEFAULT current_timestamp
);

# insert User
insert into Realm.user (user_name,password,role) values("gaoyang","password","admin");
insert into Realm.user (user_name,password,role) values("user","password","ROLE_USER")

# create Role Table
create table Realm.role(
  id int not null AUTO_INCREMENT PRIMARY KEY ,
  role_name VARCHAR(50),
  role_desc VARCHAR(100),
  data_create_time TIMESTAMP DEFAULT current_timestamp
)