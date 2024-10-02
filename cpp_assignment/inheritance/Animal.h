#include<string>
namespace Anm{
    class Animal{
        public:
        virtual void isAnimal() const = 0;

        protected:
        std::string name;
    };

    class Predator{
        public:
        virtual void isPredator() const = 0;
    };

    class Walkable{
        public:
        virtual void isWalk() const = 0;
    };

    class Rabbit : public Animal, public Walkable{
        public:
        Rabbit(std::string name);
        void isAnimal() const;
        void isWalk() const;
    };

    class Tiger : public Animal, public Walkable, public Predator{
        public:
        Tiger(std::string name);
        void isAnimal() const;
        void isWalk() const;
        void isPredator() const;
    
        
    };
}