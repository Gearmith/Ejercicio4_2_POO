/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.ejercicio4_2poo;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Oficina extends Local {
	public static double valorArea = 3500000;
	protected boolean esGobierno;

	public Oficina(
		int identificadorInmobiliario,
		int area,
		String direccion,
		tipo tipoLocal,
		boolean esGobierno
	) {
		super(identificadorInmobiliario, area, direccion, tipoLocal);
		this.esGobierno = esGobierno;
	}

	void imprimir() {
		super.imprimir();
		System.out.println("Es gubernamental = " + esGobierno);
		System.out.println();
	}
}
