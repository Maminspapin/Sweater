insert into users (id, username, password, active)
    values (1, 'admin', 'atmin', true);

insert into user_roles (user_id, roles)
    values (1, 'USER'), (1, 'ADMIN');