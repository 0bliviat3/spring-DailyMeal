--식자재 번호 시퀀스
create sequence food_no_sq
increment by 1
start with 1;

--메뉴 번호 시퀀스
create sequence menu_no_sq
increment by 1
start with 1;

--식자재 테이블
create table food_tbl (
    food_no number primary key,
    food_name varchar2(50) not null,
    food_date number not null,
    food_allergy number not null,
    food_cost number not null
);

--식자재 테이블 알러지 유무 체크 제한 조건 추가
alter table food_tbl add check(food_allergy in (1, 0));

--식자재 테이블 단가 컬럼 트리거 추가(up date cascade)


--식자재 테이블 insert문
insert into food_tbl values (food_no_sq.nextval, ?, ?, ?, ?);

--식자재 단가 update문 (트리거가 필요한가?)
update food_tbl set food_cost = ? where food_no = ?;

--식자재 상세 테이블(이건 현재 갖고있는 식자재에 대한 정보) 아마 식단생성기에선 필요없을듯?
create table food_detail_tbl(
    food_no number not null,
    constraint fk_food_no foreign key (food_no)
    references food_tbl (food_no),
    food_cnt number not null,
    food_indate date default sysdate
);

--식자재 상세 테이블 식자재 수량 트리거 생성


--식자재 상세 테이블 insert 문
insert into food_detail_tbl values(?, ?, ?);

--식자재 상세 테이블 개수 update 문(트리거가 필요한가?)
update food_detail_tbl set food_cnt = ? where food_no = ?;

--메뉴 테이블 생성
--메뉴 상세 테이블 먼저 작성후 프로시저 실행
create table menu_tbl (
    menu_no number primary key,
    menu_name varchar2(50) not null,
    menu_kcal number not null,
    menu_cost number
);



--메뉴테이블 insert 문
insert into menu_tbl values (menu_no_sq.nextval, ?, ?, ?, ?);

--메뉴 상세 테이블 생성
create table menu_detail_tbl (
    menu_no number not null,
    constraint fk_menu_no foreign key (menu_no)
    references menu_tbl (menu_no),
    food_no number not null,
    constraint fk_food_no_2 foreign key (food_no)
    references food_tbl (food_no),
    food_cnt number not null
);

-- 메뉴 상세 테이블 insert 문
insert into menu_detail_tbl values (?, ? ,?);

--메뉴테이블 메뉴 단가 산출 함수 생성
--create or replace function calculate_menu(find_menu_no number)
--    return number
--is
--    menu_sum number;
--begin
--
--    select sum(get_food_cost(mdt.food_no) * mdt.food_cnt)
--    into menu_sum
--    from menu_detail_tbl mdt
--    where menu_no = find_menu_no;
--
--    return menu_sum;
--end;

--식자재 단가 리턴하는 함수 생성
create or replace function get_food_cost(find_food_no number)
    return number
is
    food_num number;
begin
    select ft.food_cost
    into food_num
    from food_tbl ft
    where food_no = find_food_no;
    
    return food_num;
end;

--초기화용 구문
drop function calculate_menu;
drop function get_food_cost;
drop table menu_detail_tbl;
drop table menu_tbl;
drop table food_detail_tbl;
drop table food_tbl;
drop sequence food_no_sq;
drop sequence menu_no_sq;


--더미 데이터 쿼리문
insert into food_tbl values(0, 'a', 10, 0, 300);
insert into food_tbl values(1, 'b', 10, 0, 500);
insert into food_tbl values(2, 'c', 10, 0, 1000);

insert into menu_tbl values(0, 'aa', 1500, null);

insert into menu_detail_tbl values(0, 0, 3);
insert into menu_detail_tbl values(0, 1, 2);
insert into menu_detail_tbl values(0, 2, 10);

commit;

--더미 데이터 테스트 쿼리
select calculate_menu(0) from dual;

--메뉴 가격 갱신
update menu_tbl set menu_cost = calculate_menu(0) where menu_no = 0;

select * from menu_tbl;


--메뉴 카테고리 추가
alter table menu_tbl add menu_category varchar2(10);
alter table menu_tbl add check(menu_category in ('rice', 'main_manu', 'side_menu', 'soup', 'snack'));
commit;

alter table menu_tbl drop column menu_category;

