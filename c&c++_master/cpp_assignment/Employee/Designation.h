#ifndef DESIGNATION_H
#define DESIGNATION_H

#include <string>
#include <iostream>

using namespace std;

// Enum for Designation
enum class Designation {
    SoftwareDeveloper,
    DataScientist,
    DevOpsEngineer,
    QualityAssuranceEngineer,
    ProductManager,
    ProjectManager,
};

// Helper function to convert Designation enum to string
inline string getDesignation(Designation designation) {
    switch(designation) {
        case Designation::SoftwareDeveloper: return "Software Developer";
        case Designation::DataScientist: return "Data Scientist";
        case Designation::DevOpsEngineer: return "DevOps Engineer";
        case Designation::QualityAssuranceEngineer: return "Quality Assurance Engineer";
        case Designation::ProductManager: return "Product Manager";
        case Designation::ProjectManager: return "Project Manager";
        default: return "Unknown";
    }
}

#endif // DESIGNATION_H
