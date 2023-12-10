create or replace procedure menu_cost_proc
( 
  menu_no IN number
)
IS

BEGIN
  update menu_tbl mt 
  set mt.menu_cost = calculate_menu(menu_no) 
  where mt.menu_no = menu_no;

END menu_cost_proc;