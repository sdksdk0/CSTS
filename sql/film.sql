
drop table filmInfo1;
drop table filmType1;

drop sequence seq_filmInfo1;
drop sequence seq_filmType1;

-- Create table
create table filmInfo1 --电影信息
(
  FILMID      NUMBER(8) primary key,
  FILMNAME    VARCHAR2(50 CHAR) not null,
  TYPEID      VARCHAR2(8 CHAR) not null,
  ACTOR       VARCHAR2(255 CHAR),
  DIRECTOR    VARCHAR2(50 CHAR),
  TICKETPRICE NUMBER(19) not null,
  TICKETCOUNT NUMBER(10) not null
);

-- Create table
create table filmType1 --电影类型
(
  TYPEID   NUMBER(8) primary key,
  TYPENAME NVARCHAR2(20)
);


create sequence seq_filmType1 start with 10000;
insert into filmType1 values(seq_filmType1.nextval, '爱情片');
insert into filmType1 values(seq_filmType1.nextval, '动作片');
insert into filmType1 values(seq_filmType1.nextval, '喜剧片');
insert into filmType1 values(seq_filmType1.nextval, '战争片');
insert into filmType1 values(seq_filmType1.nextval, '科幻片');
insert into filmType1 values(seq_filmType1.nextval, '恐怖片');
insert into filmType1 values(seq_filmType1.nextval, '动画片');
insert into filmType1 values(seq_filmType1.nextval, '其它片');

create sequence seq_filmInfo1 start with 100000;
insert into filmInfo1 values(seq_filmInfo1.nextval, '阿凡达', 10005, '萨姆·沃辛顿,佐伊·索尔达娜,西格妮·韦弗,乔·摩尔,拉兹·阿隆索,乔瓦尼·瑞比西', '詹姆斯·卡梅隆', 150, 150000);
insert into filmInfo1 values(seq_filmInfo1.nextval, '猫和老鼠', 10007, '汤姆,杰瑞', 'William Hanna,Joseph Barbera', 60, 60000);
insert into filmInfo1 values(seq_filmInfo1.nextval, '大兵小将', 10002, '成龙,王力宏,刘承俊,林鹏,徐冬梅,杜玉明', '丁晟', 50, 100);
insert into filmInfo1 values(seq_filmInfo1.nextval, '大侦探福尔摩斯', 10002, '小罗伯特·唐尼,裘德·洛', '盖·里奇', 100, 50000);
insert into filmInfo1 values(seq_filmInfo1.nextval, '全城热恋', 10001, '谢霆锋,张学友 ,刘若英,徐若瑄,徐熙媛', '夏永康,陈国辉', 80, 8000);
insert into filmInfo1 values(seq_filmInfo1.nextval, '第九区', 10005, '沙尔托·科普雷,詹森·库伯,威廉·艾伦·扬', '尼尔·布洛姆坎普', 100, 2000);
insert into filmInfo1 values(seq_filmInfo1.nextval, '敢死队3', 10002, '西尔维斯特·史泰龙，杰森·斯坦森，梅尔·吉布森，李连杰，阿诺·施瓦辛格，杜夫·龙格尔', '派特里克·休斯', 250, 10000);
select * from filmType1;
select * from filmInfo1;