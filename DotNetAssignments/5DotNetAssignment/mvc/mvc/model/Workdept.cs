using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mvc.model
{
    public readonly record struct Workdept(decimal Id, string Name, string Location);
}