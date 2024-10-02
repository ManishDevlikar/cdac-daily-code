#include "Animal.h"
#include <iostream>

namespace Anm{

    Rabbit::Rabbit(std::string nname){
        name=nname;
    }
    void Rabbit::isAnimal() const{
        std::cout << name +": Rabbit is an animal" << std::endl;
    }

    void Rabbit::isWalk() const{
        std::cout << name+ ": Rabbit can walk" << std::endl;
    }

    Tiger::Tiger(std::string nname){
        name=nname;
    }

    void Tiger::isAnimal() const{
        std::cout <<name+ ": Tiger is an animal" << std::endl;
    }

    void Tiger::isWalk() const {
        std::cout <<name +": Tiger can walk" << std::endl;
    }

    void Tiger::isPredator() const{
        std::cout<<name +": Tiger is a Predator"<<std::endl;
    }

}