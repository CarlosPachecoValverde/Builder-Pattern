package builderPattern;

import model.CPU;
import model.Computer;
import model.GPU;
import model.RAM;

public class ComputerBuilderOffice implements ComputerBuilder {
	private String model;
	private CPU cpu;
	private GPU gpu;
	private RAM ram;
	private int storage;
	
	
	
	
	public ComputerBuilderOffice() {
		super();
		this.model = "Oficina";
		this.cpu = CPU.CPU_MID;
		this.gpu = GPU.GPU_BASIC;
		this.ram = RAM.RAM_BASIC;
		this.storage = 500;
	}



	@Override
	public void setGPU(GPU gpu) {
		this.gpu=gpu;
		
	}

	@Override
	public void setCPU(CPU cpu) {
		this.cpu=cpu;
		
	}

	@Override
	public void setRAM(RAM ram) {
		this.ram=ram;
		
	}



	@Override
	public void setStorage(int storage) {
		this.storage=storage;
	}


	@Override
	public Computer build() {
		return new Computer(this.model,this.cpu,this.gpu,this.ram,this.storage);
	}


	
	
}
