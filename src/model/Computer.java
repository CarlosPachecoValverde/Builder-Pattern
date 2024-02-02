package model;
 
public class Computer {

	private String model;
	private CPU cpu;
	private GPU gpu;
	private RAM ram;
	private int storage;
	
	public Computer(String model, CPU cpu, GPU gpu, RAM ram,int storage) {
		this.model = model;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		this.storage=storage;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public GPU getGpu() {
		return gpu;
	}
	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", cpu=" + cpu + ", gpu=" + gpu + ", ram=" + ram + ", storage=" + storage
				+ "]";
	}
	
	
	
	
}
