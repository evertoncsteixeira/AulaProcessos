package view;
import  controller.ProcessosController;
public class Principal {
	public static void main(String[] args) {
		ProcessosController procController = new ProcessosController();
	//	String os = procController.os(); 
	//	System.out.println(os);
	//	String process = "C:\\Windows\\regedit.exe";
	//	procController.callProcess(process);
	//	String process = "ping -t10 www.uol.com.br";
	// 	procController.readProcess(process);
		String param = "12904";
		procController.killProcess(param);
 	}

}
