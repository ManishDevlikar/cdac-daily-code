namespace Ads
{
	enum Medium {Plastic = 1, Wood = 2, Metal = 5};

	class Signboard
	{
	public:
		//A pure virtual member function must be overridden
		//in the derived class. A class that contains at least
		//one pure virtual member function is known as an
		//abstract data type (ADT) and such a class cannot
		//be instantiated, it can only be used as a pointer
		//or a reference type.
		virtual double Area() const = 0;
		double Price() const;
		virtual ~Signboard(){}
	protected: //members is also visible in a derived class
		Medium material;	
	};

	class Wasteful
	{
	public:
		virtual double Scrap() const = 0;
		virtual ~Wasteful(){}
	};

	//Virtual Inheritance - If two classes inherit from a common base,
	//then an instance of a class derived from both of them will contain
	//two separate copies of that common base subobject causing ambiguity
	//in implict upcasting of this class type pointer to that common base
	//type (known as diamond-of-death problem). A class defined with a 
	//virtual base shares the subobject of this base within an instance
	//of its derived class which is also derived from another class with
	//the same virtual base.
	class RectangularBoard : public virtual Signboard
	{
	public:
		RectangularBoard(float length, float breadth, Medium make);
		double Area() const;
	private:
		float width, height;
	};

	//multiple inheritance
	class CircularBoard : public virtual Signboard, public Wasteful
	{
	public:
		CircularBoard(float diameter, Medium material);
		double Area() const;
		double Scrap() const;
	private:
		float radius;
	};
}

