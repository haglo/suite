insert into pilger.elytron_role (uuidEntry, rolename) values (uuid(), 'System');
insert into pilger.elytron_role (uuidEntry, rolename) values (uuid(), 'Poweruser');
insert into pilger.elytron_role (uuidEntry, rolename) values (uuid(), 'Administrator');
insert into pilger.elytron_role (uuidEntry, rolename) values (uuid(), 'User');
insert into pilger.elytron_role (uuidEntry, rolename) values (uuid(), 'Guest');

insert into pilger.elytron_user (uuidEntry, username, comment, defaultLanguage, defaultTheme, elytronrole_id) values (uuid(), 'N-U-T',  'New-User-Template',  'english', 'Default', 3);
insert into pilger.elytron_user (uuidEntry, username, comment, defaultLanguage, defaultTheme, elytronrole_id) values (uuid(), 'Admin1', 'First User', 'german', 'Default', 1);
insert into pilger.elytron_user (uuidEntry, username, comment, defaultLanguage, defaultTheme, elytronrole_id) values (uuid(), 'Admin2', 'Second User', 'english', 'Medjugorje', 3);
