package com.Sneha.types;

public interface InterfaceDemo {
	
	int s=10;
	
	int add(int first, int second); //declare methods but not implemented

}

interface Info{}
interface Join extends Info{}

class Auto{}
class Bus extends Auto{}

class Check implements Info, Join{}

abstract class Calculations implements InterfaceDemo
{
	
}