#include<string>
#include<cstdio>
#include<stdexcept>
class Employee{
    private:
        int empId;
        std::string name;
        double sal;
        int deptNo;

    public:
        Employee(int empId,const std::string& name,double sal,int deptNo){
            this->empId=empId;
            this->name=name;
            this->sal=sal;


            if(deptNo==10 || deptNo==20 || deptNo==30 || deptNo==40){
            this->deptNo=deptNo;
            }
            else{
                throw std::invalid_argument("Invalid deptNo. Allowed values are 10, 20, 30, 40.");
            }
        }

        Employee(){
            this->empId=0;
            this->name="";
            this->sal=0.0;
            this->deptNo=10;
        }

        ~Employee(){
            printf("Destructor called\n");
        }

        void displayEmployee() const{
            printf("Employee Id : %d\n",this->empId);
            printf("Employee Name : %s\n",this->name.c_str());
            printf("Employee Salary : %lf\n",this->sal);
            printf("Employee Department No : %d\n",this->deptNo);
        }
};

int main(){
        Employee* empArray = new Employee[5];

        for(int i=0;i<5;i++){
            empArray[i].displayEmployee();
            printf("----------------");
        }

        delete[] empArray;

        return 0;
    }