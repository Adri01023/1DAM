package Ejercicios_tema8;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {

	public MiObjectOutputStream() throws IOException, SecurityException {
		super();
	}
	public MiObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}
	protected void writeStreamHeader() throws IOException {}
}
