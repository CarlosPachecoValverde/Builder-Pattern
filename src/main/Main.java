package main;

import builderPattern.ComputerBuilderOffice;
import model.CPU;
import model.Computer;
import model.RAM;

public class Main {

	public static void main(String[] args) {
	

		ComputerBuilderOffice builder = new ComputerBuilderOffice();
		
	
		
		Computer computer = builder.build();
		
		builder.setStorage(2000);
		
		
		Computer computer2 = builder.build();
		
		builder.setCPU(CPU.CPU_BASIC);
		builder.setRAM(RAM.RAM_ADVANCED);
		
		Computer computer3 = builder.build();
		
		System.out.println(computer);
		System.out.println(computer2);
		System.out.println(computer3);
		
	}

}
