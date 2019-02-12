use fseassignment;

create table category (
   category_id INT NOT NULL AUTO_INCREMENT,
   category_name VARCHAR(64) NOT NULL,
   PRIMARY KEY (category_id)
);

create table workout (
   workout_id INT NOT NULL AUTO_INCREMENT,
   category_id INT NOT NULL,
   calories_burn_per_min float NOT NULL,
   workout_title  VARCHAR(128) NOT NULL,
   workout_note   VARCHAR(256),
   PRIMARY KEY (workout_id),
   CONSTRAINT workout_category FOREIGN KEY (category_id) REFERENCES category (category_id)
);

select * from category;
select * from workout;

#delete from category;
#delete from workout;

