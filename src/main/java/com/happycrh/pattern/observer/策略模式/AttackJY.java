package com.happycrh.pattern.observer.策略模式;
 
public class AttackJY implements IAttackBehavior
{
 
	@Override
	public void attack()
	{
		System.out.println("九阳神功！");
	}
 
}