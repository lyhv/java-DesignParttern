package proxy;

public class ReadFileProxy implements ReadfileListener {
	private String name;
	private ReadFileModule readFileModule;

	public ReadFileProxy(String name) {
		this.name = name;
	}

	public String readFile() {
		if ("HoVanLy".equals(name)) {
			if (readFileModule == null) {
				readFileModule = new ReadFileModule();
			}
			return this.name + ": " + readFileModule.readFile();
		}
		return this.name + ": can't read this file";
	}
}
