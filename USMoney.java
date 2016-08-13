public class USMoney
{
 int dollar;
 int cents;
private static final int cents_per_dollar=100;
// Great work, constructor is correct.
USMoney(int dollar,int cents)
{
	this.dollar=dollar;	//Excellent usage of this keyword.
	this.cents=cents;
}
// The code below must be in some method, check the handout for details.
while(cents<0)
{
cents+=100;
dollar--;
}
while(cents>99)
{
cents-=100;
dollar++;
}
}

