# todo
# Create User Table
create table Realm.user(
  id int not null auto_increment primary key,
  user_name varchar(20),
  password varchar(50),
  account_created_time timestamp default current_timestamp comment '账户创建时间',
  account_valid_time int default 0.5  comment '账户有效时间 年为单位',
  is_enabled boolean default true comment '账户是否有效',
  is_account_non_locked boolean default false comment '账户是否有效'
);

# insert User
insert into Realm.user (user_name,password,role) values("gaoyang","password",9999);
insert into Realm.user (user_name,password) values("user","password");

# create Role Table
drop table Realm.role;
create table Realm.role(
  id int not null AUTO_INCREMENT PRIMARY KEY ,
  role_name VARCHAR(50) comment '角色名称',
  role_desc VARCHAR(100) comment '角色描述',
  role_creator_id int comment '角色创建者Id',
  data_create_time TIMESTAMP DEFAULT current_timestamp
);
insert into Realm.role (role_name,role_desc,role_creator) values("ROLE_ADMIN","系统管理员",1);
# user-role
drop table Realm.user_role;
create table Realm.user_role(
  user_id int ,
  role_id int,
  PRIMARY KEY (user_id,role_id),
  data_create_time TIMESTAMP DEFAULT current_timestamp
);