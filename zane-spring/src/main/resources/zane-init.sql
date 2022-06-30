create TABLE user(
  id BIGINT  NOT NULL AUTO_INCREMENT,
  name VARCHAR(64)  NOT NULL DEFAULT '',
  age TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY(id)
);

INSERT INTO user(name,age) values('zane',18),('张三',18),('李四',18),('王五',18),('王五',18);

select * from user;