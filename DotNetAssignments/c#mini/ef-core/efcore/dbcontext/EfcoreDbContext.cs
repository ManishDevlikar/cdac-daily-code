using efcore.entities;
using Microsoft.EntityFrameworkCore;
namespace efcore.dbcontext;

public class EfDbContext : DbContext{
    public DbSet<Department> Departments { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlServer("Data Source=iitdac.met.edu;Database=Shop2;User Id=dac2;Password=Dac2@1234;Encrypt=False");
    }

}