-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public.candidates
(
    id integer NOT NULL,
    first_name character varying(30) NOT NULL,
    last_name character varying(30) NOT NULL,
    date_of_birth date NOT NULL,
    national_id character varying(11) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.email_verificate_candidates
(
    id integer NOT NULL,
    candidate_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.email_verificate_employers
(
    id integer NOT NULL,
    employer_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.email_verificator
(
    id integer NOT NULL,
    verification_code character varying(8) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employees
(
    id integer NOT NULL,
    first_name character varying(30) NOT NULL,
    last_name character varying(30) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employer_activation
(
    id integer NOT NULL,
    employer_id integer NOT NULL,
    employee_id integer NOT NULL,
    if_verificated boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employers
(
    id integer NOT NULL,
    company_name character varying(100) NOT NULL,
    website_adress character varying(80) NOT NULL,
    phone_number character varying(15) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.job_titles
(
    id integer NOT NULL,
    title character varying(60) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.users
(
    id integer NOT NULL,
    email character varying(50) NOT NULL,
    password character varying(25) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.candidates
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.email_verificate_candidates
    ADD FOREIGN KEY (candidate_id)
    REFERENCES public.candidates (id)
    NOT VALID;


ALTER TABLE public.email_verificate_employers
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.employers (id)
    NOT VALID;


ALTER TABLE public.email_verificator
    ADD FOREIGN KEY (id)
    REFERENCES public.email_verificate_employers (id)
    NOT VALID;


ALTER TABLE public.email_verificator
    ADD FOREIGN KEY (id)
    REFERENCES public.email_verificate_candidates (id)
    NOT VALID;


ALTER TABLE public.employees
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employer_activation
    ADD FOREIGN KEY (employee_id)
    REFERENCES public.employers (id)
    NOT VALID;


ALTER TABLE public.employer_activation
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.employers (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;

END;