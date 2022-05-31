package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz1 =new AutobuzBuilder().setModel("Ford").setNumeSofer("Vasile").build();
		Autobuz autobuz2=new AutobuzBuilder().setNrInmatriculare("B123GTF").build();
		
		System.out.println(autobuz1.toString());
		System.out.println(autobuz2.toString());
	}
}
