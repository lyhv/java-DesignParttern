package proxy;

public class ReadFileProxy implements ReadfileListener {
	private String name;
	private ReadFileModle readFileModle;

	public ReadFileProxy(String name) {
		this.name = name;
	}

	public String readFile() {
		if ("HoVanLy".equals(name)) {
			if (readFileModle == null) {
				readFileModle = new ReadFileModle();
			}
			return this.name + ": " + readFileModle.readFile();
		}
		return this.name + ": can't read this file";
	}
}
