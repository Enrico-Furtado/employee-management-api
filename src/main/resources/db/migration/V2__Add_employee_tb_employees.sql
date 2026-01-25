
-- 1. Create first project
INSERT INTO tb_projects (name, description, initial_date)
VALUES ('API Quant', 'Development of an API for Quant Trading', '2026-01-01');

-- 2. Create first employee
INSERT INTO tb_employees (
    name, "e-mail", phone, employment_type, job_title,
    department, salary, admission_date, is_active, project_id
)
VALUES (
           'John The First',
           'johnfirst@gmail.com',
           '+1 917 999-9999',
           'FULL_TIME',
           'BACKEND_DEVELOPER',
           'ENGINEERING',
           140000.00,
           '2026-01-24',
           TRUE,
           1  -- Este '1' agora existe na tb_projects!
       );