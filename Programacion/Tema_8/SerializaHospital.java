package Hospital;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializaHospital implements Serializable {
	private static final long serialVersionUID = 1L;
	File path;
	String dir;
	public SerializaHospital(String d) {
		path = new File(d);
		if (!path.isDirectory()) System.out.println("No directorio");
	}
	public void escribe(Hospital h, String p) throws IOException {
		File fichero = new File(path, p);
		if (!fichero.exists()) fichero.createNewFile();
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(h);
		oos.close();
	}
	public Hospital leer(String p) throws IOException, ClassNotFoundException {
		File fichero = new File(path, p);
		Hospital h1;
		FileInputStream fis = new FileInputStream(fichero);
		ObjectInputStream ois = new ObjectInputStream(fis);
		h1 = (Hospital) ois.readObject();
		ois.close();
		return h1;
	}
}
