package by.tms.models;

--insert into workers(login,salary,age,date,description)values('aaa',2000,24,'2016-05-11','sasafsdgdsgsdg');
        --insert into workers(login,salary,age,date,description)values('zzz',4800,25,'2014-10-24','dsfdsfdsfsfsdf');
        --insert into workers(login,salary,age,date,description)values('bbb',1200,26,'2022-11-12','iuiouoiuouiouu');
        --insert into workers(login,salary,age,date,description)values('ccc',2750,27,'1995-08-01','wqewqewqewqeqw');
        --insert into workers(login,salary,age,date,description)values('ggg',1450,24,'1998-02-06','nmmnmnmnmnmnnm');
        --insert into workers(login,salary,age,date,description)values('lll',6540,25,'2016-03-03','xzcxczxczxczxx');
        --insert into workers(login,salary,age,date,description)values('eee',3550,28,'2022-09-25','trytryrtytrytt');
        --insert into workers(login,salary,age,date,description)values('lll',5000,30,'2023-01-01','klkljkjljkljjl');
        --На IN
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:IN.
        --Выберите из таблицы workers записи с id равным 1,2,3,5,14.
        select*from workers where id in(1,2,3,5);
        --Выберите из таблицы workers записи с login равным 'eee','bbb','zzz'.
        select*from workers where login in('eee','bbb','zzz');
        --Выберите из таблицы workers записи с id равным 1,2,3,7,9,и логином,равным'user','admin','ivan'и зарплатой больше 300.
        select*from workers where id in(1,8,5,7,9)and login in('ggg','lll','ccc')and salary>300;
        --На BETWEEN
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:BETWEEN.
        --Выберите из таблицы workers записи c зарплатой от 100до 1000.
        select*from workers where salary between 100and 4000;
        --Выберите из таблицы workers записи c id от 3до 10и зарплатой от 300до 500.
        select*from workers where id between 3and 10and salary between 3000and 5000;
        --На AS
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:AS.
        --Выберите из таблицы workers все записи так,чтобы вместо id было userId,вместо login – userLogin,вместо salary-userSalary.
        select id as userId,login as userLogin,salary as userSalary from workers;
        --На DISTINCT
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:DISTINCT.
        --Выберите из таблицы workers все записи так,чтобы туда попали только записи с разной зарплатой(без дублей).
        --Получите SQL запросом все возрасты без дублирования.
        select distinct salary from workers;
        select distinct age from workers;
        --Получите SQL запросом все возрасты без дублирования.
        --На MIN и MAX
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:MIN,MAX.
        --Найдите в таблице workers минимальную зарплату.
        select min(age)from workers;
        select max(age)from workers;
        select min(salary)from workers;
        select max(salary)from workers;
        --На SUM
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:SUM.
        --Найдите в таблице workers суммарную зарплату.
        --
        --Найдите в таблице workers суммарную зарплату для людей в возрасте от 21до 25.
        --
        --Найдите в таблице workers суммарную зарплату для id,равного 1,2,3и 5.
        select sum(salary)from workers;
        select sum(salary)from workers where age between 21and 25;
        select sum(salary)from workers where id in(1,2,3,5);
        --На AVG
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:AVG.
        --Найдите в таблице workers среднюю зарплату.
        select avg(salary)from workers;
        --На NOW,CURRENT_DATE,CURRENT_TIME
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:NOW,CURRENT_DATE,CURRENT_TIME.
        --Выберите из таблицы workers все записи,у которых дата больше текущей.
        select*from workers where date>current_date;
        --Вставьте в таблицу workers запись с полем date с текущим моментом времени в формате'год-месяц-день часы:минуты:секунды'.
        insert into workers(login,salary,age,date,description)values('sss',125,14,now(),'dsfdsfdsfdsfs');
        --Вставьте в таблицу workers запись с полем date с текущей датой в формате'год-месяц-день'.
        insert into workers(login,salary,age,date,description)values('sss',125,14,current_date,'dsfdsfdsfdsfs');
        --Вставьте в таблицу workers запись с полем time с текущим моментом времени в формате'часы:минуты:секунды'.
        insert into workers(login,salary,age,date,description)values('kkk',450,18,current_timestamp,'safasfsafasg');
        --На работу с частью даты
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функция:extract.
        --Выберите из таблицы workers все записи за 2016год.
        select*from workers where extract(year from date)=2016;
        --Выберите из таблицы workers все записи за март любого года.
        select*from workers where extract(month from date)=03;
        --Выберите из таблицы workers все записи за третий день месяца.
        select*from workers where extract(day from date)=03;
        --Выберите из таблицы workers все записи за пятый день апреля любого года.
        select*from workers where extract(day from date)=05and extract(month from date)=04;
        --Выберите из таблицы workers все записи за следующие дни любого месяца:1,7,11,12,15,19,21,29.
        select*from workers where extract(day from date)in(1,7,11,12,15,19,21,29);
        --Выберите из таблицы workers все записи за вторник.
        select*from workers where extract(dow from date)=02;
        --Выберите из таблицы workers все записи за первую декаду любого месяца 2016года.
        select*from workers where extract(day from date)between 1and 10and extract(year from date)=2016;
        --Выберите из таблицы workers все записи,в которых день меньше месяца.
        select*from workers where extract(day from date)<extract(month from date);
        --При выборке из таблицы workers запишите день,месяц и год в отдельные поля.
        select*,extract(day from date)as day,extract(month from date)as month,extract(year from date)as year from workers;
        --При выборке из таблицы workers создайте новое поле today,в котором будет номер текущего дня недели.
        select*,extract(dow from date)as номер_текущего_дня from workers;
        --На EXTRACT,DATE
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:EXTRACT,DATE.
        --При выборке из таблицы workers запишите год,месяц и день в отдельные поля с помощью EXTRACT.
        select extract(year from date)as year,extract(month from date)as month,extract(day from date)as day from workers;
        --При выборке из таблицы workers запишите день,месяц и год в отдельное поле с помощью DATE в формате'год-месяц-день'.
        select date from workers;
        --На DATE_FORMAT
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:DATE_FORMAT.
        --При выборке из таблицы workers выведите дату в формате'31.12.2025'.
        select to_char(date,'dd.MM.yyyy')from workers;
        --При выборке из таблицы workers выведите дату в формате'2025% 31.12'.
        select to_char(date,'yyyy% dd.MM')from workers;
        --На INTERVAL,DATE_ADD,DATE_SUB
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:INTERVAL,DATE_ADD,DATE_SUB.
        --При выборке из таблицы workers прибавьте к дате 1день.
        select(date+interval'1 day')from workers;
        --При выборке из таблицы workers отнимите от даты 1день.
        select(date-interval'1 day')from workers;
        --При выборке из таблицы workers прибавьте к дате 1день,2часа.
        select(date+interval'1 day 2 hours')from workers;
        --При выборке из таблицы workers прибавьте к дате 1год,2месяца.
        select(date+interval'1 year 2 month')from workers;
        --При выборке из таблицы workers прибавьте к дате 1день,2часа,3минуты.
        select(date+interval'1 day 2 hour 3 minutes')from workers;
        --При выборке из таблицы workers прибавьте к дате 1день,2часа,3минуты,5секунд.
        select(date+interval'2 hour 3 minute 5 second')from workers;
        --При выборке из таблицы workers прибавьте к дате 1день и отнимите 2часа.
        select(date+interval'1 day'-interval'2 hour')from workers;
        --При выборке из таблицы workers прибавьте к дате 1день и отнимите 2часа,3минуты.
        select(date+interval'1 day'-interval'2 hour 3 minute')from workers;
        --На математические операции
        --При выборке из таблицы workers создайте новое поле res,в котором будет число 3.
        select 3as res from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будет строка'eee'.
        select'eee'as res from workers;
        --При выборке из таблицы workers создайте новое поле 3,в котором будет число 3.
        select 3"3"from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будет лежать сумма зарплаты и возраста.
        select salary,age,(salary+age)as res from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будет лежать разность зарплаты и возраста.
        select salary,age,(salary-age)as res from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будет лежать произведение зарплаты и возраста.
        select salary,age,(salary*age)as res from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будет лежать среднее арифметическое зарплаты и возраста.
        select salary,age,((salary+age)/2)as res from workers;
        --Выберите из таблицы workers все записи,в которых сумма дня и месяца меньше 10-ти.
        select*from workers where(extract(day from date)+extract(month from date))< 10;
        --На LEFT,RIGHT,SUBSTRING
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:LEFT,RIGHT,SUBSTRING.
        --При выборке из таблицы workers получите первые 5символов поля description.
        select"left"(description,5)from workers;
        --При выборке из таблицы workers получите последние 5символов поля description.
        select"right"(description,5)from workers;
        --При выборке из таблицы workers получите из поля description символы со второго по десятый.
        select substring(description,2,10)from workers;
        --На UNION
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:UNION.
        --Даны две таблицы:таблица category и таблица sub_category с полями id и name.Достаньте одним запросом названия категорий и подкатегорий.
        select id,name from students union select city_id,city from students_city;
        --На CONCAT,CONCAT_WS
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:CONCAT,CONCAT_WS.
        --При выборке из таблицы workers создайте новое поле res,в котором будут лежать одновременно зарплата и возраст(слитно).
        select concat(salary,age)as res from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будут лежать одновременно зарплата и возраст(слитно),а после возраста будут идти три знака'!'.
        select concat(salary,age,'!!!')as res from workers;
        --При выборке из таблицы workers создайте новое поле res,в котором будут лежать одновременно зарплата и возраст через дефис.
        select concat(salary,'-',age)as res from workers;
        --При выборке из таблицы workers получите первые 5символов логина и добавьте троеточие.
        select concat("left"(login,5),'...')as res from workers;
        --На GROUP BY
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:GROUP BY.
        --Найдите самые маленькие зарплаты по группам возрастов(для каждого возраста свою минимальную зарплату).
        select age,min(salary)from workers group by age order by age;
        --Найдите самый большой возраст по группам зарплат(для каждой зарплаты свой максимальный возраст).
        select age,max(salary)from workers group by age order by age;
        --На GROUP_CONCAT
        --Для решения задач данного блока вам понадобятся следующие SQL команды и функции:GROUP_CONCAT.
        --Выберите из таблицы workers уникальные возраста так,чтобы для каждого возраста было поле res,в котором будут лежать через дефис id записей с таким возрастом.
        select distinct age as res(select group_concat(id'-'))from workers;
        --На подзапросы
        --Выберите из таблицы workers все записи,зарплата в которых больше средней зарплаты.
        select*from workers where salary>(select avg(salary)from workers);
        --Выберите из таблицы workers все записи,возраст в которых меньше среднего возраста,деленного на 2и умноженного на 3.
        select*from workers where age< (select(avg(salary)/2*3)from workers);
        --Выберите из таблицы workers записи с минимальной зарплатой.
        select*from workers where salary=(select min(salary)from workers);
        --Выберите из таблицы workers записи с максимальной зарплатой.
        select*from workers where salary=(select max(salary)from workers);
        --При выборке из таблицы workers создайте новое поле max,
        --в котором будет лежать максимальное значение зарплаты для возраста 25лет.
        select*,max(salary)as max from workers where age=25group by id,login,salary,age,date,description;
        --При выборке из таблицы workers создайте новое поле avg,
        --в котором будет лежать деленная на 2разница между максимальным значением
        --возраста и минимальным значением возраста в во всей таблице.
        select*,(select(max(age)-min(age))/2from workers)as avg from workers;
        --При выборке из таблицы workers создайте новое поле avg,
        --в котором будет лежать деленная на 2разница между максимальным значением зарплаты
        --и минимальным значением зарплаты для возраста 25лет.
        select*,(select(max(salary)-min(salary))/2from workers)as avg from workers where age=25;
