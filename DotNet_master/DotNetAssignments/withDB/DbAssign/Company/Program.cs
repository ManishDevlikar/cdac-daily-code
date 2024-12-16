using Company.Models;
using DotNetEnv;
Env.Load();
var model = new CompModel();
// model.SaveDepartment(3,"IT");

// model.saveEmployee(1,"sam",20000, 1);
model.displayAllDept();
Console.WriteLine("---------------");
model.displayEmployees(1);

