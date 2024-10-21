using Microsoft.EntityFrameworkCore;

using System;


namespace Company.Data
{
    public class SiteDbContex : DbContext
    {
        public DbSet<Department> dept {get;set;}

        public SiteDbContex(){
            Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder){
             var connectionString = Environment.GetEnvironmentVariable("DB_CONNECTION_STRING");
    optionsBuilder.UseMySql(connectionString, new MySqlServerVersion(new Version(8, 0, 33)));
        }
    }
}