class Banner
{
public:

	//A constructor is a member-function (method) whose name matches
	//with the name of the class and is declared without a return type.
	//A constructor which does not take any parameter or has all optional
	//parameters is called a default contructor.
	Banner()
	{
		width = 20.0;
		height = 5.0;
	}

	void Resize(float w, float h)
	{
		width = w;
		height = h;
	}	

	double Price() const
	{
		float rate = width > height ? 0.80 : 0.95;
		return width * height * rate;
	}

private:
	float width;
	float height;
};

