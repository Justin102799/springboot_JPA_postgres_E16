PGDMP         (                 {            schooltable    15.1    15.1     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17093    schooltable    DATABASE     �   CREATE DATABASE schooltable WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE schooltable;
                postgres    false            �            1259    17110 
   tblstudent    TABLE     	  CREATE TABLE public.tblstudent (
    id integer NOT NULL,
    student_fname character varying(255) NOT NULL,
    student_lname character varying(255) NOT NULL,
    student_email character varying(255) NOT NULL,
    student_course character varying(255) NOT NULL
);
    DROP TABLE public.tblstudent;
       public         heap    postgres    false            �            1259    17109    tblstudent_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tblstudent_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.tblstudent_id_seq;
       public          postgres    false    215            �           0    0    tblstudent_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.tblstudent_id_seq OWNED BY public.tblstudent.id;
          public          postgres    false    214            e           2604    17113    tblstudent id    DEFAULT     n   ALTER TABLE ONLY public.tblstudent ALTER COLUMN id SET DEFAULT nextval('public.tblstudent_id_seq'::regclass);
 <   ALTER TABLE public.tblstudent ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            �          0    17110 
   tblstudent 
   TABLE DATA           e   COPY public.tblstudent (id, student_fname, student_lname, student_email, student_course) FROM stdin;
    public          postgres    false    215   v       �           0    0    tblstudent_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.tblstudent_id_seq', 11, true);
          public          postgres    false    214            g           2606    17117    tblstudent tblstudent_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.tblstudent
    ADD CONSTRAINT tblstudent_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.tblstudent DROP CONSTRAINT tblstudent_pkey;
       public            postgres    false    215            �   �   x�UO��0<O?ƈoo����^�l��Rm�A���dv�ٙ�f����R�#��%c'w����fHIH7m��9�.��$�t�϶p6^!�/��G9��g*�r\�s�g�DB&.{�~X�ĵ�֤ؓ��[�A�-��"��[I�����S$T��?my� ���o��z�;�u��|\kz     