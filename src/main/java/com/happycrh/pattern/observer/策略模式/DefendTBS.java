package com.happycrh.pattern.observer.策略模式;
 
public class DefendTBS implements IDefendBehavior
{
 
	@Override
	public void defend()
	{
		System.out.println("铁布衫");
	}
 
}