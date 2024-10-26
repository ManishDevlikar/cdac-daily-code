using efcore.entities;
using Microsoft.EntityFrameworkCore;
namespace efcore.dbcontext;

public class EfDbContext : DbContext{
    public DbSet<Department> Departments { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlServer("Data Source=iitdac.met.edu;Database=Shop2;User Id=dac2;Password=Dac2@1234;Encrypt=False");
    }

// protected override void OnModelCreating(ModelBuilder modelBuilder)
// {
    // modelBuilder.Entity<Employee>()
        // .HasOne(e => e.Department);
        // .WithMany(d => d.Employees)
        // .HasForeignKey(e => e.DepartmentId);
        // .HasPrincipalKey(d => d.Id); // Ensure this matches your Department's key
// }

}