using System;
using Microsoft.EntityFramework;

namespace company.Entity
{
    public class SiteDbContex : DbContext
    {
        public DbSet<Department> dept {get;set;}

            protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
            {
                optionsBuilder.UseSqlServer("Data Source=iitdac.met.edu;Database=Shop1;User Id=dac1;Password=Dac1@1234;Encrypt=False");
            }

    }
}