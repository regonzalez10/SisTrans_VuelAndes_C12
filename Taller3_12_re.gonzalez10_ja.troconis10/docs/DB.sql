
CREATE TABLE VIDEOS 
(
  ID NUMBER NOT NULL,
  NAME VARCHAR2(255 BYTE), 
  DURATION NUMBER,
  CONSTRAINT VIDEOS_PK PRIMARY KEY (ID)

);

Insert into VIDEOS (ID,NAME,DURATION) values ('1','Harry Potter 1','120');
Insert into VIDEOS (ID,NAME,DURATION) values ('2','Harry Potter 2','200');
Insert into VIDEOS (ID,NAME,DURATION) values ('3','Harry Potter 3','140');
Insert into VIDEOS (ID,NAME,DURATION) values ('4','Harry Potter 4','100');
Insert into VIDEOS (ID,NAME,DURATION) values ('5','Harry Potter 5','150');
Insert into VIDEOS (ID,NAME,DURATION) values ('6','Harry Potter 6','130');
Insert into VIDEOS (ID,NAME,DURATION) values ('7','Harry Potter 7.1','200');
Insert into VIDEOS (ID,NAME,DURATION) values ('8','Harry Potter 7.2','160');
Insert into VIDEOS (ID,NAME,DURATION) values ('9','Lord Of The Rings 1','120');
Insert into VIDEOS (ID,NAME,DURATION) values ('10','Lord Of The Rings 2','150');
Insert into VIDEOS (ID,NAME,DURATION) values ('11','Lord Of The Rings 3','100');

COMMIT;



