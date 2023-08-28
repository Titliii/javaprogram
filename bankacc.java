import java.util.*;
class account
{
	String acc_name;
	int balance;
	account(String x,int y)
	{
		acc_name=x;
		balance=y;
	}
	void deposit()
	{
		return balance;
	}
}
class savings_acc extends account
{
	int interest;
	savings_acc(String x,int y)
	{
		super(x,y)
		balance=1000;
	}
	void cal_interest
	{
		
	}
}
class current_acc extends savings_acc
{
	