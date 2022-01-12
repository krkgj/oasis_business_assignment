INSERT INTO `book` (`seq`, `book_title`, `category`, `issue_date`, `quantity`, `author`, `net_price`, `supply_price`, `discount_rate`, `status`) VALUES
(1	,'책1',	'소설',	TO_DATE('2021-10-17', 'YYYY-MM-DD'),	13, '김철수',	13000,	13000,	0, '판매중'),
(2	,'책2',	'수필',	TO_DATE('2020-10-21', 'YYYY-MM-DD'),	15, '김영희',	13000,	13000,	0, '판매중'),
(3	,'책3',	'전래동화',	TO_DATE('2021-08-21', 'YYYY-MM-DD'),	5,	'문영희',	20000,	20000,	0, '판매중'),
(4	,'책4',	'소설',	TO_DATE('2021-09-27', 'YYYY-MM-DD'),	7,	'김첨지',	20000,	20000,	0, '판매중'),
(5	,'책5',	'소설',	TO_DATE('2017-05-21', 'YYYY-MM-DD'),	11,	'제갈용덕',	15000,	15000,	0, '절판'),
(6	,'책6',	'수필',	TO_DATE('2018-12-31', 'YYYY-MM-DD'),	11,	'홍길동',	21000,	10000,	52.38095238, '절판'),
(7	,'책7',	'경제',	TO_DATE('2016-08-05', 'YYYY-MM-DD'),	2,	'임꺽정',	14000,	10000,	28.57142857, '절판'),
(8	,'책8',	'역사',	TO_DATE('2021-10-21', 'YYYY-MM-DD'),	3,	'고길동',	13000,	10000,	23.07692308, '판매중'),
(9	,'책9',	'역사',	TO_DATE('2021-10-21', 'YYYY-MM-DD'),	3,	'도우너',	13000,	10000,	23.07692308, '판매중'),
(10	,'책10',	'경제',	TO_DATE('2021-10-21', 'YYYY-MM-DD'),	4,	'두울리',	13000,	10000,	23.07692308, '판매중'),
(11	,'책11',	'수필',	TO_DATE('2021-10-21', 'YYYY-MM-DD'),	6,	'석가',	13000,	13000,	0, '판매중');


INSERT INTO `contract_company` (`seq`, `cntrc_date`, `lwst_rate`, `status_code`) VALUES
(1, TO_DATE('2019-10-25', 'YYYY-MM-DD'), 14.5, 'APPROVAL'),
(2, TO_DATE('2019-11-23', 'YYYY-MM-DD'), 16.5, 'APPROVAL'),
(3, TO_DATE('2019-12-12', 'YYYY-MM-DD'), 16.5, 'APPROVAL');

INSERT INTO `supply` (`seq`, `contract_company_seq`, `supply_date`) VALUES
(1, 1, TO_DATE('2019-10-29', 'YYYY-MM-DD')),
(2, 2, TO_DATE('2019-11-30', 'YYYY-MM-DD')),
(3, 3, TO_DATE('2019-12-14', 'YYYY-MM-DD'));

INSERT INTO `supply_book` (`seq`, `supply_seq`, `book_seq`) VALUES
(1, 1,	2),
(2, 2,	5),
(3, 3,	8);


