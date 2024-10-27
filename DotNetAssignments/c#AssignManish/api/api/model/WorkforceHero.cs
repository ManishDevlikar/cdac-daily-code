using System;


namespace api.model
{
    public readonly record struct WorkforceHero(decimal Id, string Name, string Job,decimal Sal ,decimal DeptNo);
}

// public readonly record struct Visitor(string Name, int Visits, DateTime Recent, string Stars);