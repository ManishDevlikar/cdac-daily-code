#include "Animal.h"
#include <iostream>

using namespace Anm;

void print(Animal* animal) {
    Walkable* walkable = dynamic_cast<Walkable*>(animal);
    Predator* predator = dynamic_cast<Predator*>(animal);

    if(animal!=nullptr && walkable!=nullptr && predator!=nullptr){
        animal->isAnimal();
        walkable->isWalk();
        predator->isPredator();
    }else if(animal!=nullptr && walkable!=nullptr && predator==nullptr){
           animal->isAnimal();
           walkable->isWalk();
    }
}

int main(){
    Rabbit r("ana");
    Tiger t("max");

    print(&r);
    print(&t);

    return 0;
}