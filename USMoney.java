public class USMoney
{
 int dollar;
 int cents;
private static final int cents_per_dollar=100;

USMoney(int dollar,int cents)
{
	this.dollar=dollar;
	this.cents=cents;
}

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

