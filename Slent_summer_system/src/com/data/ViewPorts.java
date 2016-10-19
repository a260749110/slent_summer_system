package com.data;

import java.util.Enumeration;

import javax.comm.CommPortIdentifier;

public class ViewPorts {
public void listPorts(){
	
	System.err.println("!!!!!!!");

	System.loadLibrary("win32com");
	System.err.println(System.getProperty("java.library.path"));
Enumeration enumeration=CommPortIdentifier.getPortIdentifiers();
CommPortIdentifier portId;
while(enumeration.hasMoreElements()){
portId=(CommPortIdentifier)enumeration.nextElement();
if(portId.getPortType()==CommPortIdentifier.PORT_SERIAL){
System.out.println("port name :"+portId.getName());
}
}
}


}
