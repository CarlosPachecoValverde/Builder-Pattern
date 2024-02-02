package builderPattern;

import model.CPU;
import model.Computer;
import model.GPU;
import model.RAM;

public interface  ComputerBuilder {

	


	public void setGPU(GPU gpu);
	public void setCPU(CPU cpu);
	public void setRAM(RAM ram);
	public Computer build();
	public void setStorage(int storage);
	
	
}
