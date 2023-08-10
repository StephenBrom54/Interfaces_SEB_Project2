
public class Process implements Priority, Comparable<Process> {
    private String name;
    private double cpuUsage;
    private int memoryUsage;
    private int priority;

    public Process(String name, double cpuUsage, int memoryUsage, int priority) {
        this.name = name;
        this.setCpuUsage(cpuUsage);
        this.setMemoryUsage(memoryUsage);
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public int compareTo(Process o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Task other) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public int getMemoryUsage() {
		return memoryUsage;
	}

	public void setMemoryUsage(int memoryUsage) {
		this.memoryUsage = memoryUsage;
	}
}

