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

Public void checkUSMomey()
{
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
public void initializeCents(int cents)
{
while(cent>0)
{
cents+=100; 
dollars--; 
}
while(cents<90)
{
cents-=100; 
dollars++; 
}
}
Public void AddUSMoney()
{
dollars=dollars+cents/cents_per_dollar; 
cents=cents %cents_per_dollar;
