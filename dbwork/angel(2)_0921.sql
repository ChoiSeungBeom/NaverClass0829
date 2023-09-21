-- PL-SQL �̶�?
-- SQL �� ������ ����Ҹ� �߰��ؼ� ���α׷����Ѱ��� PL-SQL �̶�� �Ѵ�
-- ���� 1
DECLARE
        --���� �����ϴ� ����
    v_no NUMBER(4, 1); -- 4�ڸ��� �Ҽ������� 1�ڸ� ���� �ִ� ���� ����

BEGIN
        -- sql�����̳� pl-sql ������ �ڵ��ϴ� ����
        --  = �������(�񱳿�����) , := ���� ������
    v_no := 12.7;
    dbms_output.put_line(v_no); -- ���
END;
/
--���� 2

DECLARE
    vname VARCHAR2(20);
    vban  VARCHAR2(20);
BEGIN
    SELECT
        name,
        ban
    INTO
        vname,
        vban
    FROM
        student
    WHERE
        num = 1;

    dbms_output.put_line(vname
                         || ' ���� '
                         || vban
                         || '�Դϴ�.');
END;
/

-- person �� food ���̺��� �����Ͽ� person_num �� 9�� ����� �̸�, �ֹ��� �޴�, ������ ����Ͻÿ�
DECLARE
    vname  VARCHAR2(20);
    vfood  VARCHAR2(20);
    vprice NUMBER(7);
BEGIN
    SELECT
        person_name,
        fname,
        fprice
    INTO
        vname,
        vfood,
        vprice
    FROM
        food   f,
        person p
    WHERE
            f.food_num = p.food_num
        AND person_num = 19;

    dbms_output.put_line('�ֹ��� : ' || vname);
    dbms_output.put_line('�޴��� : ' || vfood);
    dbms_output.put_line('��   �� : ' || vprice);
END;
/

-- ���� 4
-- ��ǰ���� ������ �������� �ش� ��ǰ���� ���ݰ� ������ ���
DECLARE
    vsangpum VARCHAR2(20) := '����';
    vcolor   VARCHAR2(20);
    vprice   NUMBER(7);
    vprice2  VARCHAR2(20);
BEGIN
    SELECT
        sang_price,
        sang_color,
        ltrim(to_char(sang_price, 'L999,999'))
    INTO
        vprice,
        vcolor,
        vprice2
    FROM
        shop
    WHERE
        sang_name = vsangpum;

    dbms_output.put_line('��ǰ��:' || vsangpum);
    dbms_output.put_line('��    ��:' || vcolor);
    dbms_output.put_line('��    ��:' || vprice);
    dbms_output.put_line('��    ��:' || vprice2);
END;
/

/*
if      ���ǽ� then
        ����1;
else 
        ����2;
end if;

���� if��
if      ���ǽ�1 then
        ����1;
elsif       ����2 then
        ����2;
        ...
end if;


*/

--���� 5
--�⵵�� �´� �챸�ϱ�
--Ű����� �⵵�� �Է¹ް��� �Ұ�� accept ���
accept year prompt '�¾ ������ �Է��ϼ���' ;

DECLARE
    --v_year number(4) := 1995;
    v_year NUMBER(4) := '&year';
    v_mod  NUMBER(2) := MOD(v_year, 12); -- �⵵�� 12�� ���� �������� ���Ѵ�
    v_ddi  VARCHAR2(10); --�� ������ ����
BEGIN
    IF v_mod = 0 THEN
        v_ddi := '������';
    ELSIF v_mod = 1 THEN
        v_ddi := '��';
    ELSIF v_mod = 2 THEN
        v_ddi := '��';
    ELSIF v_mod = 3 THEN
        v_ddi := '����';
    ELSIF v_mod = 4 THEN
        v_ddi := '��';
    ELSIF v_mod = 5 THEN
        v_ddi := '��';
    ELSIF v_mod = 6 THEN
        v_ddi := 'ȣ����';
    ELSIF v_mod = 7 THEN
        v_ddi := '�䳢';
    ELSIF v_mod = 8 THEN
        v_ddi := '��';
    ELSIF v_mod = 9 THEN
        v_ddi := '��';
    ELSIF v_mod = 10 THEN
        v_ddi := '��';
    ELSIF v_mod = 11 THEN
        v_ddi := '��';
    END IF;

    dbms_output.put_line(v_year
                         || '�����'
                         || v_ddi
                         || '���Դϴ�.');
END;
/

--------------------------------------------------------------------------------------------------------------------
-- ���� 6
-- db �÷��� Ÿ���� �������� ���

accept iname prompt 'name?';

DECLARE
    v_name   student.name%TYPE := '&iname';
    v_height student.height%TYPE;
    v_java   student.java%TYPE;
    v_spring student.spring%TYPE;
BEGIN
    SELECT
        height,
        java,
        spring
    INTO
        v_height,
        v_java,
        v_spring
    FROM
        student
    WHERE
        name = v_name;

    dbms_output.put_line('�л�����:' || v_name);
    dbms_output.put_line('�ڹ�������:' || v_java);
    dbms_output.put_line('������������:' || v_spring);
    dbms_output.put_line('Ű��:' || v_height);
    dbms_output.put_line('������:' ||(v_java + v_spring));
END;
/

--���� 7
-- loop, for

/*
�ݺ��� : loop
loop
        �����;
        exit when ����;
    end loop;
*/

--1���� 10���� �ݺ��ؼ� ���
DECLARE
    v_no NUMBER(2) := 0;
BEGIN
    LOOP
        v_no := v_no + 1;
        dbms_output.put_line('no=' || v_no);
        EXIT WHEN v_no = 10; --10�ϰ�� �ݺ����� ����������
    END LOOP;
END;
/

--����: ���� �Է��ϸ� �ش���� ����Ͻÿ�

accept idan prompt 'dan?' DEFAULT 1;

DECLARE
    v_dan NUMBER(2) := '&idan';
    v_idx NUMBER(1) := 1;
BEGIN
    dbms_output.put_line('**********'
                         || v_dan
                         || '��**********');
    LOOP
        dbms_output.put_line(v_dan
                             || 'x'
                             || v_idx
                             || '='
                             || v_dan * v_idx);

        v_idx := v_idx + 1;
        EXIT WHEN v_idx = 10; --10�ϰ�� �ݺ����� ����������
    END LOOP;

END;
/
-------------------------------------
--��ǰ���� ������ ������ �� �ش� ��ǰ���� ���ݰ� ������ ���
--���� 4 - Exception ó��(���� 4 ����) 

accept sangpum prompt 'sangpum?';

DECLARE
    vsangpum VARCHAR2(20) := '&sangpum';
    vcolor   VARCHAR2(20);
    vprice   NUMBER(7);
    vprice2  VARCHAR2(20);
BEGIN
    SELECT
        sang_price,
        sang_color,
        ltrim(to_char(sang_price, 'L999,999'))
    INTO
        vprice,
        vcolor,
        vprice2
    FROM
        shop
    WHERE
        sang_name = vsangpum;

    dbms_output.put_line('��ǰ��:' || vsangpum);
    dbms_output.put_line('��    ��:' || vcolor);
    dbms_output.put_line('��    ��:' || vprice);
    dbms_output.put_line('��    ��:' || vprice2);
        -- ����� 2�� �̻��̰ų� ������ �����߻�
        -- ����Ŭ���� ����ó���ϴ� ���
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line(vsangpum || '��ǰ�� DB�� �����ϴ�');
    WHEN too_many_rows THEN
        dbms_output.put_line(vsangpum || '��ǰ�� �ΰ��̻� �ֽ��ϴ�');
    WHEN OTHERS THEN
        dbms_output.put_line(vsangpum || '��ǰ�� ���� ���� �߻�-���� ��');
END;
/

--���� 10

accept idan prompt 'dan?';

DECLARE
    v_dan NUMBER(2) := '&idan';
    v_idx NUMBER(1) := 1;
BEGIN
    dbms_output.put_line('**********'
                         || v_dan
                         || '��**********');
   
   for v_su in 1..9 loop
        dbms_output.put_line(v_dan
                             || 'x'
                             || v_idx
                             || '='
                             || v_dan * v_idx);
                             v_idx := v_idx + 1;
        end loop;
END;
/
--���ڵ� ������ ������ ��������
declare
    v_num student.num%TYPE := 6;
    v_stu angel.student%rowtype;  --���ڵ� ������ �о�ð��
begin
    select * into v_stu
    from student where num=v_num;
    
    dbms_output.put_line('�̸�:'||v_stu.name);
    dbms_output.put_line('Ű:'||v_stu.height);
    dbms_output.put_line('�ڹ�:'||v_stu.java);
    dbms_output.put_line('������:'||v_stu.spring);
    dbms_output.put_line('��:'||v_stu.ban);

end;
/

--db�� ���������͸� ��ȸ�Ұ��
/*
Cursor : sql ���� �����Ҷ����� ����� �м��ǰ� ����Ǿ� ����� �����ϱ� ���� 
Ư���� �޸� ������ ����ϴµ� �� ������ �����ϴ� ���� Ŀ���̴�.

select ������ ���� ������ ��ȸ�� ����ϴ� ��ü�̴�

Ŀ�� �Ӽ�
sql%rowcount : ����� ���� ��ȯ
sql%found : ���� �ֱ��� sql���� �ϳ� �̻��� �࿡ ������ �ذ�� true
sql%notfound : ������� ���°��
sql%isopen : �׻� false(�׻� close�� �ϱ� ������ �׻� false)

*/

--���� 12
DECLARE
    v_sno number(3) := 20;
    v_shop angel.shop%rowtype;
    
BEGIN
        select * into v_shop
        from shop where sang_no=v_sno;
        
        DBMS_Output.put_line('��ǰ��:'||v_shop.sang_name);
        DBMS_Output.put_line('��ȸ�� ���హ��:'|| sql%rowcount); -- 1��
        
        --student�� java ���� �����ϱ�
        update student set java=99;
        DBMS_Output.put_line('������ ���హ��:'|| sql%rowcount); -- 3��
end;
/

--���� ���ڵ� ���
--���� 13

DECLARE
        Cursor s1
        is
        select * from shop;
BEGIN
        DBMS_Output.put_line('��ǰ��ȣ  ��ǰ�� ����  ����');
        DBMS_Output.put_line('----------------------------------------');
        for s in s1 loop
            exit when s1%notfound; -- ���̻� �����Ͱ� ������ ����������       
            DBMS_Output.put_line(s.sang_no||'   '||s.sang_name||'    ' || s.sang_color||'    ' || s.sang_price);
        end loop;
end;
/

--���� 14

--��ǰ��,���� ,������ �Է��ϸ� shop db�� �߰��ϱ�
accept isang prompt 'sangpum?';
accept icolor prompt 'color?';
accept iprice prompt 'price?';

DECLARE
      v_sang shop.sang_name%TYPE := '&isang';
      v_color shop.sang_color%TYPE := '&icolor';
      v_price shop.sang_price%TYPE := '&iprice';
BEGIN
        insert into shop values (seq_shop.nextval,v_sang,v_price,v_color);
        commit;
        DBMS_Output.put_line('��ǰ������ �߰��߽��ϴ�');
end;
/

-- ���� : food ���̺�
/*
    fname,fprice,no �Է��� �޾Ƽ�
    no �� 1 �̸� fname, fprice�� ������ �߰��� �ϰ�, 
    no�� 2�� food ��ü ������ ���
*/

accept ifname prompt 'fname?' ;
accept ifprice prompt 'fprice?' ;
accept ino prompt 'no?' ;

DECLARE
      v_fname food.fname%TYPE := '&ifname';
      v_fprice food.fprice%TYPE := '&ifprice';
      v_no number(2) := '&ino';      
      
       Cursor s1
        is
        select * from food;
BEGIN
        if v_no = 1 THEN
        insert into food values (seq_food.nextval,v_fname,v_fprice);
        DBMS_Output.put_line('��ǰ������ �߰��߽��ϴ�');
        commit;
        elsif v_no =2 THEN
        DBMS_Output.put_line('���Ĺ�ȣ      ���ĸ�         ���İ���');
        DBMS_Output.put_line('-------------------------------------------------------');
        for s in s1 loop
            exit when s1%notfound; -- ���̻� �����Ͱ� ������ ����������       
            DBMS_Output.put_line(s.food_num||'   '||s.fname||'    ' || s.fprice||'    ');
        end loop;
        end if;
end;
/

delete from food where food_num = 24;
select * from food