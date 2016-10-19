package com.data;

import java.io.OutputStream;
import java.util.Enumeration;

import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
import javax.comm.SerialPort;

public class PortHelper {
	public static PortHelper instance = new PortHelper();

	private SerialPort serialPort;
	static CommPortIdentifier portId;
	/* Enumeration 为枚举型类,在util中 */
	static Enumeration portList;
	OutputStream outputStream;
	/* RS-232的串行口 */


	private PortHelper() {

	
	}

	public void write(byte[]... bs) {
		
		try {
			try {

				CommPortIdentifier.getPortIdentifiers();
				portList = CommPortIdentifier.getPortIdentifiers();
				/* 用循环结构找出串口 */
				System.err.println("`````````````````read port size:" + portList.hasMoreElements());
				while (portList.hasMoreElements()) {
					/* 强制转换为通讯端口类型 */
					portId = (CommPortIdentifier) portList.nextElement();
					System.err.println("`````````````````read port:" + portId.getName());
					if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
						if (portId.getName().equals("COM1")) {

//							serialPort = (SerialPort) portId.open("ReadComm", 2000);
//							outputStream = serialPort.getOutputStream();
							break;
						}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		
			
			serialPort=(SerialPort) portId.open("ReadComm", 2000);
			outputStream = serialPort.getOutputStream();
			serialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			outputStream.write(0x0c);

			outputStream.flush();
			for(byte[] b:bs)
			{
			outputStream.write(b);
		
			}
			outputStream.flush();
			serialPort.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void test() {
//		Thread t = new Thread(new Runnable() {
//			public void run() {
//				int i = 0;
//				while (true) {
//					try {
//						serialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
//								SerialPort.PARITY_NONE);
//						i++;
//						byte[] c = (i + "").getBytes();
//						outputStream.write(c);
//
//						outputStream.flush();
//						Thread.sleep(2000);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//
//		});
//		t.start();
	}
}
