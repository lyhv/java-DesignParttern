package stratery;

public abstract class Shape {
	InterfaceDraw interfaceDraw;

	public Shape() {
		super();
	
	}
	public  void setDraw(InterfaceDraw interfaceDraw){
	   this.interfaceDraw = interfaceDraw;
	}
	public void onDraw(){
		interfaceDraw.draw();
	}
}
