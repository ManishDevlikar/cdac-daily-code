namespace efcore.entities;

public class Department{
    public decimal Id { get; set; }
    public string Name { get; set; }
    public string Location { get; set; }
    public List<Employee> Employees { get; set; } = new List<Employee>();
}