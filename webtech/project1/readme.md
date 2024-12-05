npm init -y

npm start 

express framework (MVC)

npm i express

default port mongo port:-> 27017

start mongo server

to acceses mongo terminal->  mongosh.exe

--------------------------------mongo shell cmds-------------------------------------------------------

check dbs 
----- show dbs

how to create db (create if not found)
------- use metcdac2024

to check current selected db
-------- db

to create table
-------- db.createCollection('users');
-------- db.createCollection('products');

to get collections from current db
--------- show collections

to insert records in db

----------- db.users.insert([{'name': 'John', age: 21,},{'name': 'ana', 'age': 22,},{'name': 'bob', age: 23,}]);

----------- db.users.insert([{'name': 'Manya', age: 23},{'name': 'Pashya', age: 34},{'name': 'Darshyaa', age: 25}])

to show records

---------- db.users.find()
---------- db.users.find().pretty();

where clause

----------- db.users.find({age:22})

conditional operations

----------- db.users.find({age:{$gt:22}});
----------- db.users.find({age:{$gte:22}});
----------- db.users.find({age:{$lt:22}});
---------- db.users.find({age:{$lte:22}});
---------- db.users.find({age:{$ne:22}});

delete record
----------- db.users.remove({name:'John'});

to delete all records
----------- db.users.remove({});

to update records
db.users.update({name:'Darshyaa'},{$set:{name:'darshan',age:23}});


------------- to install mongoose (db driver)
npm i mongoose